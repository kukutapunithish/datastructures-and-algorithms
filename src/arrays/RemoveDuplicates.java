package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
    //3.1 4Q
    int numberOfDistinctElements(int[] arr) {
        List<Integer> inputArray = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < inputArray.size(); j++) {
                if (arr[i] == arr[j]) {
                    flag = true;
                }
            }
            if (!flag) {
                inputArray.add(arr[i]);
            }
            for (int j = 0; j < inputArray.size(); j++) {
                arr[j] = inputArray.get(j);
            }
        }
        return inputArray.size();
    }

    int removeDuplicates(int[] arr) {
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                arr[i + 1] = arr[j];
                i++;
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int arr[] = {2, 2, 2, 2};
        RemoveDuplicates c = new RemoveDuplicates();
        int numberOfDistinct = c.numberOfDistinctElements(arr);
        System.out.println("Number of Distinct Elements are " + numberOfDistinct);
        System.out.println(Arrays.toString(arr));
    }

}
