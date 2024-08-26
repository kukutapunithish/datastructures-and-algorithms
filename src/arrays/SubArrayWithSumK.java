package arrays;

import java.util.*;

public class SubArrayWithSumK {
    int[] longestSubArrayOne(int[] elements,int target) {
        int sizeBest = 0;
        int sum = 0;
        int start = -1;
        int end = - 1;
        for (int i = 0; i < elements.length; i++) {
            sum = 0;
            for (int j = 0; j < elements.length; j++) {
                sum += elements[j];
                if(sum == target) {
                    if((j - i + 1) > sizeBest) {
                        sizeBest = j - i + 1;
                        start = i;
                        end = j;
                    }
                    break;
                }
            }
        }
        if(start == -1) {
            return new int[0];
        }
        int[] largetArray = new int[sizeBest];
        int index = 0;
        for (int i = start; i <= end; i++) {
            largetArray[index] = elements[i];
            index++;
        }
        return largetArray;
    }
    int longestSubArrayTwo(int[] elements,int target) {
        int sizeBest = 0;
        int sum = 0;
        for (int i = 0; i < elements.length; i++) {
            sum = 0;
            for (int j = i; j < elements.length; j++) {
                sum += elements[j];
                if(sum == target) {
                    if((j - i + 1) > sizeBest) {
                        sizeBest = j - i + 1;
                    }
                    break;
                }
            }
        }
        return sizeBest;
    }

    int longestSubArrayThree(int[] elements,int target) {
        Map<Integer,Integer> preSumMap = new HashMap();
        int sum = 0;
        int maxLen = 0;
        for(int i = 0; i < elements.length; i++) {
            sum += elements[i];
            if(sum == target) {
                maxLen = Math.max(maxLen, i + 1);
            }

            int rem = sum - target;
            if(preSumMap.containsKey(rem)) {
                maxLen = Math.max(maxLen, i - preSumMap.get(rem));
            }

            if(!preSumMap.containsKey(sum)) {
                preSumMap.put(sum,i);
            }
        }

        return maxLen;
    }

    int longestSubArrayFour(int[] elements,int target) {
        int start = 0;
        int end = 0;
        int sum = elements[0];
        int maxLen = 0;
        while(end < elements.length) {

            while((start <= end) && (sum > target)) {
                sum -= elements[start];
                start++;

            }
            if(sum == target) {
                maxLen = Math.max(maxLen,end - start + 1);
            }

            end++;
            if(end < elements.length) sum+=elements[end];
        }

        return maxLen;
    }

    public static void main(String[] args) {
        SubArrayWithSumK obj = new SubArrayWithSumK();
        int[] elements = {-13,0, 6, 15, 16, 2, 15, -12, 17, -16, 0, -3, 19, -3, 2, -9, -6};
        int K = 15;

        int largestArray = obj.longestSubArrayThree(elements,K);
        System.out.println(largestArray);
    }

}
