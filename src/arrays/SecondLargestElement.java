package arrays;

import java.util.Arrays;
import java.util.Collections;

public class SecondLargestElement {

    void secondLargestArray(int[] arr) {
        Arrays.sort(arr);
        int seMax = arr[arr.length - 2];
        for (int i = arr.length - 1; i > 0; i--) {
            if(seMax == arr[i]) {
                seMax = arr[i - 1];
            }
            else {
                break;
            }
        }
        System.out.println(seMax);
    }

    int secondApproach(int[] arr) {
        LargestElement e = new LargestElement();
        int max = e.largest(arr);
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    int thirdApproach(int[] arr) {
        int secondMax = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }
            else if(arr[i] > secondMax && arr[i] < max) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    int[] smallestLargestApproach(int[] arr) {
        int secondMax = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
            else if(arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
            if(arr[i] < min) {
                min = arr[i];
            }
            else if(arr[i] < secondMin && arr[i] != min) {
                secondMin = arr[i];
            }

        }
        return new int[]{secondMin,secondMax};
    }

    public static void main(String[] args) {
        int[] arr = {28, 43, 26, 65, 60, 54, 51, 35, 42, 48, 33, 40, 58, 38, 64, 47, 44, 49, 46, 25, 57, 39, 55, 45, 29, 32, 61, 53, 31, 36, 56, 63, 30, 52, 27, 34, 50, 41, 37, 66, 62, 59};
        long startTime = System.currentTimeMillis();
        SecondLargestElement e = new SecondLargestElement();
        int secondMax = e.thirdApproach(arr);
        long endTime = System.currentTimeMillis();
        System.out.println("Second Max of Array is: " + (secondMax==Integer.MIN_VALUE? "None" : secondMax) + " \nThis took about " + (endTime - startTime) + " Milliseconds");
        int[] largestSmallest = e.smallestLargestApproach(arr);
        System.out.println("Second smallest and largest are: " + largestSmallest[0] + " And " + largestSmallest[1]);
    }
}
