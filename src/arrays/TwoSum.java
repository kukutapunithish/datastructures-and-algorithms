package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    int[] twoSumBruteForce(int[] elements,int target) {
        for (int i = 0; i < elements.length; i++) {
            for (int j = i + 1; j < elements.length; j++) {
                if(elements[i] + elements[j] == target) {
                    return new int[] {i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    int[] twoSumBetter(int[] elements,int target) {
        Map<Integer,Integer> elementsMap = new HashMap();
        for (int i = 0; i < elements.length; i++) {
            elementsMap.put(elements[i],i);
        }
        for (int i = 0; i < elements.length; i++) {
            if((elementsMap.containsKey(target - elements[i])) && (elementsMap.get(target - elements[i]) != i)) {
                return new int[] {i,elementsMap.get(target - elements[i])};
            }
        }
        return new int[]{-1,-1};
    }
    int[] twoSumBetterOnePass(int[] elements,int target) {
        Map<Integer,Integer> elementsMap = new HashMap();
        for (int i = 0; i < elements.length; i++) {
            if((elementsMap.containsKey(target - elements[i]))) {
                return new int[] {i,elementsMap.get(target - elements[i])};
            }
            elementsMap.put(elements[i],i);
        }
        return new int[]{-1,-1};
    }
    String twoSumOptimalVariantOne(int[] elements,int target) {
        Arrays.sort(elements);
        int start=0;
        int end = elements.length - 1;
        System.out.println(Arrays.toString(elements));
        while(start < end) {
            if(elements[start] + elements[end] == target) {
                return "Yes";
            } else if (elements[start] + elements[end] > target) {
                end--;
            } else {
                start++;
            }
        }
        return "No";
    }
    public static void main(String[] args) {
        TwoSum obj = new TwoSum();
        int [] elements = {2,6,5,8,11};
        int target = 15;
        int[] result = obj.twoSumBetter(elements,target);
        System.out.println("Start: " + result[0] + ", end: " + result[1]);
    }
}
