package arrays;

public class MissingNumber {

    void missingNumber(int[] arr) {
        int sum = 0, n = arr.length;
        int actualSum = 0;
        actualSum = ((n + 1) * (n + 2)) / 2;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println(actualSum - sum);
    }

    void missingNumberTwo(int[] arr) {
        int xor = 0 , n = arr.length;
        int actualXor  = 0;
        for (int i = 1; i <= n - 1 ; i++) {
            xor = xor ^ arr[i - 1];
            actualXor = actualXor ^ i;
        }
        actualXor = actualXor ^ n;
        System.out.println(actualXor^xor);
    }

    public static void main(String[] args) {
        MissingNumber m = new MissingNumber();
        int[] arr = {1, 3, 4, 5};
        m.missingNumberTwo(arr);
    }
}
