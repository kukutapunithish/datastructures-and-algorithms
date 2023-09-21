package sortingalgo;

public class MergeSort {

    static void merge(int arr[], int low, int mid, int high) {
        int temp[] = new int[high + 1];
        int count = 0;
        int left = low;
        int right = mid + 1;
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[count] = arr[left];
                left++;
                count += 1;
            } else {
                temp[count] = arr[right];
                right++;
                count += 1;
            }
        }
        while (left <= mid) {
            temp[count] = arr[left];
            left++;
            count++;
        }
        while (right <= high) {
            temp[count] = arr[right];
            right++;
            count++;
        }
        for (int i = low; i <= high; i++) {
            arr[i] = temp[i - low];
        }
        System.out.println("Temp Array: ");
        for (int i = 0; i < temp.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void mergeSort(int arr[], int low, int high) {
        if (low == high) {
            return;
        }
        int mid = (high + low) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }


    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        mergeSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
