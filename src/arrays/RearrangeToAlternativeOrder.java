package arrays;

import java.util.Arrays;

/*

There’s an array ‘A’ of size ‘N’ with an equal number of positive and negative elements.
Without altering the relative order of positive and negative elements,
you must return an array of alternately positive and negative values.

Input: arr[] = {1,2,-4,-5}, N = 4
Output: 1 -4 2 -5
Explanation:
Positive elements = 1,2
Negative elements = -4,-5
To maintain relative ordering, 1 must occur before 2, and -4 must occur before -5.
-4,1,2,-5
*/
public class RearrangeToAlternativeOrder {
    void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    int[] alternativeOrderingBruteForce(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        int indexTrack = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] > 0) {
                result[indexTrack] = arr[i];
                indexTrack = indexTrack + 2;
            }
        }
        indexTrack = 1;
        for (int i = 0; i < n; i++) {
            if(arr[i] < 0) {
                result[indexTrack] = arr[i];
                indexTrack = indexTrack + 2;
            }
        }

        return result;
    }

    int[] alternativeOrderingOptimal(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        int posIndex = 0;
        int negIndex = 1;
        for (int i = 0; i < n; i++) {
            if(arr[i] < 0) {
                result[negIndex] = arr[i];
                negIndex += 2;
            } else {
                result[posIndex] = arr[i];
                posIndex += 2;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        RearrangeToAlternativeOrder obj = new RearrangeToAlternativeOrder();
        int[] arr = {1,2,-3,-1,-2,3};
        int[] result = obj.alternativeOrderingOptimal(arr);
        System.out.println("The result of the alternating is");
        obj.printArray(result);

    }
}
