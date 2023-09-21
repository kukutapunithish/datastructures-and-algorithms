package arrays;

public class MoveZeros {

    void moveZeros(int[] arr, int n) {
        int end = arr.length - 1;
        for (int i = end; i >= 0; i--) {
            if(arr[i] == 0) {
                for (int j = i; j < end; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[end] = 0;
            }
        }
    }

    //3, 5, 0, 4, 0
    void moveZerosTwo(int[] arr, int n) {
        int j = -1;
        for (int i = 0; i < n; i++) {
            if(arr[i] == 0) {
                j = i;
                break;
            }
        }
        for (int i = j + 1; i < n; i++) {
            if(arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }


    //Leet code comment solution beats 99%
    public void moveZeroesThree(int[] nums) {
        int snowBallSize = 0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]==0){
                snowBallSize++;
            }
            else if (snowBallSize > 0) {
                int t = nums[i];
                nums[i]=0;
                nums[i-snowBallSize]=t;
            }
        }
    }

    void printArray(int[] arr) {
        for (int a: arr) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 0, 4, 0};
        int n = arr.length;
        MoveZeros m = new MoveZeros();
        m.moveZerosTwo(arr, n);
        m.printArray(arr);
    }

}
