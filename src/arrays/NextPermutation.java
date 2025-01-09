package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/*
Given an array Arr[] of integers, rearrange the numbers of the given array into the
lexicographically next greater permutation of numbers. If such an arrangement is not possible,
it must rearrange to the lowest possible order (i.e., sorted in ascending order).

Example:

Input format:
 Arr[] = {1,3,2}
Output
: Arr[] = {2,1,3}
Explanation:
All permutations of {1,2,3} are {{1,2,3} , {1,3,2},
{2,13} , {2,3,1} , {3,1,2} , {3,2,1}}. So, the next permutation just after {1,3,2} is {2,1,3}.
*/
public class NextPermutation {

    // My solution a little bit manual without any inbuilt functions
    int[] nextPermutation(int[] arr) {
        int breakIndex = -1;
        int n = arr.length;
        for (int i = n - 2; i >=0 ; i--) {
            if(arr[i + 1] > arr[i]) {
                breakIndex = i;
                break;
            }
        }
        if(breakIndex == -1) {
            for (int i = 0; i < n; i++) {
                int temp = arr[i];
                arr[i] = arr[n - i - 1];
                arr[n - i - 1] = temp;
            }
            return arr;
        }


        int maxNext = Integer.MAX_VALUE;
        int maxNextIndex = -1;
        for (int i = breakIndex + 1; i < n; i++) {
            if((arr[breakIndex] < arr[i]) & (arr[i] < maxNext)) {
                maxNext = arr[i];
                maxNextIndex = i;

            }
        }


        int temp = arr[breakIndex];
        arr[breakIndex] = arr[maxNextIndex];
        arr[maxNextIndex] = temp;

        int[] sortArray = new int[n - breakIndex - 1];
        int index = 0;
        for (int i = breakIndex+1; i < n; i++) {
            sortArray[index] = arr[i];
            index++;
        }
        Arrays.sort(sortArray);
        index = 0;
        for (int i = breakIndex+1; i < n; i++) {
            arr[i] = sortArray[index];
            index++;
        }
    return arr;
    }

    public static List<Integer> nextGreaterPermutation(List< Integer > A) {
        int n = A.size(); // size of the array.

        // Step 1: Find the break point:
        int ind = -1; // break point
        for (int i = n - 2; i >= 0; i--) {
            if (A.get(i) < A.get(i + 1)) {
                // index i is the break point
                ind = i;
                break;
            }
        }

        // If break point does not exist:
        if (ind == -1) {
            // reverse the whole array:
            Collections.reverse(A);
            return A;
        }

        // Step 2: Find the next greater element
        //         and swap it with arr[ind]:

        for (int i = n - 1; i > ind; i--) {
            if (A.get(i) > A.get(ind)) {
                int tmp = A.get(i);
                A.set(i, A.get(ind));
                A.set(ind, tmp);
                break;
            }
        }

        // Step 3: reverse the right half:
        List<Integer> sublist = A.subList(ind + 1, n);
        Collections.reverse(sublist);

        return A;
    }


    public static void main(String[] args) {
        NextPermutation obj = new NextPermutation();
        int[] arr = {2,1,5,4,3,0,0};
        int[] result = obj.nextPermutation(arr);
        System.out.println("Next permutation is: " + Arrays.toString(result));
        List<Integer> inputList = Arrays.asList(new Integer[] {2, 1, 5, 4, 3, 0, 0});
        List<Integer> res = nextGreaterPermutation(inputList);
        System.out.println("Next permutation is: " + res);
    }
}
