package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
Problem Statement: You are given an array of ‘N’ integers.
You need to find the length of the longest sequence which contains the consecutive elements.
Example 1:
Input:
 [100, 200, 1, 3, 2, 4]

Output:
 4

Explanation:
 The longest consecutive subsequence is 1, 2, 3, and 4.
*/
public class LongestSubsequenceInArray {

    public static boolean linearSearch(int[] arr, int num) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
             if(arr[i] == num) {
                 return true;
             }
        }
        return false;
    }

    public static int longestSubsequence(int[] arr) {
        int n = arr.length;
        int longest = 1;
        for (int i = 0; i < n; i++) {
            int x = arr[i];
            int count = 1;
            while (linearSearch(arr,x + 1) == true) {
                x += 1;
                count += 1;
            }
            longest = Math.max(longest,count);
        }
        return longest;
    }

    public static int longestSuccessiveElements(int []a) {
        int n = a.length;
        if (n == 0) return 0;

        //sort the array:
        Arrays.sort(a);
        int lastSmaller = Integer.MIN_VALUE;
        int cnt = 0;
        int longest = 1;

        //find longest sequence:
        for (int i = 0; i < n; i++) {
            if (a[i] - 1 == lastSmaller) {
                //a[i] is the next element of the
                //current sequence.
                cnt += 1;
                lastSmaller = a[i];
            } else if (a[i] != lastSmaller) {
                cnt = 1;
                lastSmaller = a[i];
            }
            longest = Math.max(longest, cnt);
        }
        return longest;
    }

    public static int longestSuccessiveElementsOptimal(int[] a) {
        int n = a.length;
        if (n == 0)
            return 0;

        int longest = 1;
        Set<Integer> set = new HashSet<>();

        // put all the array elements into set
        for (int i = 0; i < n; i++) {
            set.add(a[i]);
        }

        // Find the longest sequence
        for (int it : set) {
            // if 'it' is a starting number
            if (!set.contains(it - 1)) {
                // find consecutive numbers
                int cnt = 1;
                int x = it;
                while (set.contains(x + 1)) {
                    x = x + 1;
                    cnt = cnt + 1;
                }
                longest = Math.max(longest, cnt);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int arr[] = {100, 2, 200, 1, 3, 4};
        int ans = longestSuccessiveElementsOptimal(arr);
        System.out.println("The longest consecutive sequence is " + ans);
    }

}
