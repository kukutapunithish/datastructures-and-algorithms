package arrays;

import java.util.Arrays;

public class CheckSorted {

    boolean isArraySortedOne(int[] arr) {
        int [] unSortedArray = Arrays.stream(arr).toArray();
        Arrays.sort(arr);
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != unSortedArray[i]) {
                flag = true;
                break;
            }
        }
        if(flag) {
            return false;
        }
        return true;
    }

    boolean isArraySortedTwo(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = {30, 20, 30, 40, 50};
        CheckSorted c = new CheckSorted();
        boolean flag = c.isArraySortedTwo(arr);
        if (flag) {
            System.out.println("Sorted");
        }
        else {
            System.out.println("Not Sorted");
        }
    }

}
