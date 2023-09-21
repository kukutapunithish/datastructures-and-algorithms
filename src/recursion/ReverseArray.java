package recursion;

import java.util.Arrays;

public class ReverseArray {

    int[] printN(int i, int[] arr) {
        if (i < (arr.length / 2)) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i -1] = temp;
            return printN(i + 1, arr);
        } else {
            return arr;
        }

    }


    public static void main(String[] args) {
        int i = 0;
        int[] arr = {1, 2, 3, 4, 5 , 6};
        ReverseArray p = new ReverseArray();
        for (int a: p.printN(i, arr)) {
            System.out.print(a + " ");
        }
    }

}
