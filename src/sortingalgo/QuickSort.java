package sortingalgo;

public class QuickSort {

    static int partitionIndex(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;
        while (i < j) {
            while (arr[i] <= pivot && i <= high - 1) {
                i++;
            }
            while (arr[j] > pivot && j >= low + 1) {
                j--;
            }
            if (i < j) swap(arr, i, j);
        }
        swap(arr, low, j);
        return j;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pI = partitionIndex(arr, low, high);
            quickSort(arr, low, pI - 1);
            quickSort(arr, pI + 1, high);
        }
    }


    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
