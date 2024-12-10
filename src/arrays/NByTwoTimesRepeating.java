package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*

Given an array of N integers, write a program to return an element that occurs more than N/2 times in the given array.
You may consider that such an element always exists in the array.

Example: N = 7, nums[] = {2,2,1,1,1,2,2}
Result: 2

*/
public class NByTwoTimesRepeating {

    public int repeatingNByTwoSortApproach(int[] arr) {
        int n = arr.length;
        int targetLength = Math.ceilDiv(n,2);
        int count = 1;
        Arrays.sort(arr);
        int selectElement = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] == selectElement) {
                count++;
            } else {
                count = 1;
                selectElement = arr[i];
            }
            if(count == targetLength) {
                return selectElement;
            }
        }

        return -1;
    }

    public int repeatingNByTwoBruteForce(int[] arr) {
        int n = arr.length;
        int targetLength = Math.ceilDiv(n,2);
        for (int i = 0; i < n; i++) {
            int selectElement = arr[i];
            int count = 1;
            for (int j = 0; j < n; j++) {
                if ((arr[j] == selectElement) & (i != j)) {
                    count++;
                }
                if(count == targetLength) {
                    return selectElement;
                }
            }

        }
        return -1;
    }

    public int repeatingNByTwoMap(int[] arr) {
        int n = arr.length;
        int targetLength = Math.ceilDiv(n,2);
        Map<Integer,Integer> freqElements = new HashMap();
        for (int i = 0; i < n; i++) {
            freqElements.put(arr[i],freqElements.getOrDefault(arr[i] , 0) + 1);
            if(freqElements.get(arr[i]) == targetLength) {
                return arr[i];
            }
        }
        return -1;
    }

    public int repeatingNByTwoMooresVotingApproach(int[] arr) {
        int n = arr.length;
        int targetLength = Math.ceilDiv(n,2);
        int count = 0;
        int selectElement = arr[0];
        for (int i = 0; i < n; i++) {
            if(count == 0) {
                count++;
                selectElement = arr[i];
            } else if(selectElement == arr[i]){
                count++;
            } else {
                count--;
            }
        }
        return selectElement;
    }


    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        NByTwoTimesRepeating obj = new NByTwoTimesRepeating();
        int result = obj.repeatingNByTwoMooresVotingApproach(arr);
        System.out.println("The repeating element is: " + result);

    }
}
