package arrays;

public class LinearSearch {

    int elementIndex(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6};
        int target = 6;
        LinearSearch l = new LinearSearch();
        int index = l.elementIndex(arr, target);
        System.out.println("Index of element is: " + index);
    }

}
