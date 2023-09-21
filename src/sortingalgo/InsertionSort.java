package sortingalgo;

public class InsertionSort {

    static void insertionSort(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            int j = i;
            while (j > 0 && (arr[j - 1] > arr[j])) {

                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }


        System.out.println("After insertion sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void insert(int arr[],int i)
    {
        if(i < 0) {
            return;
        }
        // Your code here
        insert(arr,i - 1);
        int j = i;
        while (j > 0 && (arr[j - 1] > arr[j])) {

            int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
            j--;
        }
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
//        insertionSort(arr, arr.length);
        insert(arr, arr.length - 1);
        printArray(arr);
    }

}
