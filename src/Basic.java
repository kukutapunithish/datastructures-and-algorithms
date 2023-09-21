import java.util.ArrayDeque;
import java.util.Queue;

public class Basic {

    void rotateArray(int[] arr, int n, int k) {
        for (int i = 0; i < k; i++) {
            int tempValue = arr[0];
            for (int j = 1; j <= n - 1; j++) {
                arr[j - 1] = arr[j];
            }
            arr[n - 1] = tempValue;
        }
    }


    int[] rotateArrayTwo(int[] arr, int n, int k) {
        if (k == n) {
            return arr;
        } else if (k > n) {
            k = k % n;
        }
        int[] tempArray = new int[k];
        for (int i = 0; i < k; i++) {
            tempArray[i] = arr[i];
        }
        for (int i = k; i < n; i++) {
            arr[i - k] = arr[i];
        }
        for (int i = n - k; i < n; i++) {
            arr[i] = tempArray[i - (n - k)];
        }
        return arr;
    }
    //1,2,3,4,5
    //5,4,3,2,1
    void reverseArray(int[] arr, int start, int end) {
        while(start<end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    int[] rotateArrayThree(int[] arr, int n, int k) {
        if(k%n == n){
            return arr;
        }
        else if(k > n) {
            k = k%n;
        }
        reverseArray(arr,0,k - 1);
        reverseArray(arr,k,n - 1);
        reverseArray(arr,0,n - 1);
        return arr;
    }

    void printArray(int[] arr) {
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int[] arr1 = {1,2,3,4,5,6,7};
        int[] arr2 = {1,2,3,4,5,6,7};
        int k = 3;
        int n = 7;
        Basic b = new Basic();
        b.rotateArray(arr, n, k);
        int[] res = b.rotateArrayTwo(arr1,n,k);
        int[] res1 = b.rotateArrayThree(arr2, n ,k);
        b.printArray(arr);
        b.printArray(res);
        b.printArray(res1);
    }

}
