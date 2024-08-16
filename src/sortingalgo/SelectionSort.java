package sortingalgo;

public class SelectionSort {

    static void selectionSort(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            int mini = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[mini]) {
                    mini = j;
                }
            }
            //swap
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }

        System.out.println("After selection sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int min = Integer.MAX_VALUE;
            int minIndex = -1;
            for (int i = start; i <= end; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                    minIndex = i;
                }
            }
            int temp;
            temp = arr[start];
            arr[start] = arr[minIndex];
            arr[minIndex] = temp;
            start++;
        }
        for (int a:arr) {
            System.out.println(a);
        }
    }

}
