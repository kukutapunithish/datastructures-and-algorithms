package sortingalgo;

public class BubbleSort {

    static void bubbleSort(int arr[], int n) {
        for (int i = 1; i < n; i++) {
            int swap = 0;
            for (int j = 0; j < n - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    swap += 1;
                }
            }
            if (swap == 0) {
                break;
            }
        }

        System.out.println("After selection sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void recursiveBubbleSort(int[] arr, int n) {
        if (n == 1) {
            return;
        }
        for (int j = 0; j <= n - 2; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j + 1];
                arr[j + 1] = arr[j];
                arr[j] = temp;
            }
        }
        recursiveBubbleSort(arr, n - 1);

    }
    static void printArray(int[] arr) {
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        bubbleSort(arr, arr.length);
        recursiveBubbleSort(arr, arr.length);
        printArray(arr);
    }

}
