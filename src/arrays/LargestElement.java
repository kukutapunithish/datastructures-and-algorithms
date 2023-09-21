package arrays;

public class LargestElement {
    int largest(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int[] arr = {12, 35, 1, 10, 34, 1};
        LargestElement e = new LargestElement();
        int max = e.largest(arr);
        long endTime = System.currentTimeMillis();
        System.out.println("Max of Array is: " + max + " \nThis took about " + (endTime - startTime) + " Milliseconds");
    }
}
