package arrays;

import java.util.Arrays;

public class RotateByK {
    // In left rotation the elements will move specific units to right and the elements from right will move to left
    int[] leftRotateArrayByK(int[] elements, int K) {
        int[] temp = new int[K];
        for (int i = 0; i < K; i++) {
            temp[i] = elements[i];
        }
        for (int i = K - 1; i < elements.length - 1; i++) {
            elements[i - K + 1] = elements[i + 1];
        }
        for (int i = 0; i < temp.length; i++) {
            elements[elements.length - K + i] = temp[i];
        }
        return elements;
    }
    int[] rightRotateArrayByK(int[] elements, int K) {
        int[] temp = new int[K];
        int n = elements.length;

        for (int i = n - K; i < n; i++) {
            temp[(i - (n - K))] = elements[i];
        }
        for (int i = n - K - 1; i >= 0; i--) {
            elements[i + K] = elements[i];
        }
        for (int i = 0; i < temp.length; i++) {
            elements[i] = temp[i];
        }
        return elements;
    }

    int[] reverseArray(int[] elements,int start,int end) {
        int temp = 0;
        while( start <= end) {
            temp = elements[end];
            elements[end] = elements[start];
            elements[start] = temp;
            start++;
            end--;
        }
        return elements;
    }

    int[] rightRotateArrayByKReversal(int[] elements, int K) {
        int n = elements.length;
        K = K%n;
        reverseArray(elements,n - K , n - 1);
        reverseArray(elements,0 , n - K - 1);
        reverseArray(elements,0 , n - 1);
        return elements;
    }
    int[] leftRotateArrayByKReversal(int[] elements, int K) {
        int n = elements.length;
        K = K%n;
        reverseArray(elements,0 , K - 1);
        reverseArray(elements,K  , n - 1);
        reverseArray(elements,0 , n - 1);
        return elements;
    }

    public static void main(String[] args) {
        int[] elements = {1,2,3,4,5,6,7};
        int K = 3;
        RotateByK obj = new RotateByK();
        int[] leftResult = obj.leftRotateArrayByKReversal(elements.clone(),K);
        System.out.println("Left rotate: " + Arrays.toString(leftResult));
        int[] rightResult = obj.rightRotateArrayByKReversal(elements.clone(),K);
        System.out.println("Right rotate: " + Arrays.toString(rightResult));
    }
}
