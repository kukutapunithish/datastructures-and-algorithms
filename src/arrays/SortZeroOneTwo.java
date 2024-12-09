package arrays;

import java.util.Arrays;

public class SortZeroOneTwo {
    void printArray(int[] elements) {
        System.out.println(Arrays.toString(elements));
    }

    void sortArrayValues(int[] elements) {
        int zeros = 0,ones = 0,twos = 0;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == 0) {
                zeros += 1;
            } else if (elements[i] == 1) {
                ones += 1;
            } else if (elements[i] == 2) {
                twos += 1;
            }
        }
        for (int i = 0; i < zeros; i++) {
            elements[i] = 0;
        }
        for (int i = zeros; i < zeros + ones; i++) {
            elements[i] = 1;
        }
        for (int i = zeros + ones; i < zeros + ones + twos; i++) {
            elements[i] = 2;
        }
        printArray(elements);
    }
    void sortArrayValuesThreePointer(int[] elements) {
        int start = 0, mid = 0,end = elements.length - 1;
        while(mid <= end) {
            if(elements[mid] == 0) {
                elements[mid] = elements[start];
                elements[start] = 0;
                mid++;
                start++;
            }else if (elements[mid] == 1) {
                mid++;
            }else {
                 elements[mid] = elements[end];
                 elements[end] = 2;
                 end--;
            }
        }
        printArray(elements);
    }
    public static void main(String[] args) {
        SortZeroOneTwo obj = new SortZeroOneTwo();
        int[] elements = {2,0,2,1,1,0};
        obj.sortArrayValuesThreePointer(elements);

    }
}
