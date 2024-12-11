package arrays;

/*

Given an integer array arr, find the contiguous subarray (containing at least one number) which
has the largest sum and returns its sum and prints the subarray.
Example:
Input: arr = [-2,1,-3,4,-1,2,1,-5,4]  Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.

*/
public class MaximumContigiousSubArraySum {
    public long maximumContigiousArrayBruteForceApproach(int[] arr) {
        long maxSum = Long.MIN_VALUE;
        long sum;
        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if(sum > maxSum) {
                    maxSum = sum;
                }

            }
        }
        return maxSum;
    }

    // As per the wikipedia which is same with slight difference (wrote a comment to show difference )
    public long maximumContigiousArrayKadanas(int[] arr) {
        long maxSum = Long.MIN_VALUE;
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            // This line is the difference
            sum = Math.max(arr[i],sum + arr[i]);
            maxSum = Math.max(maxSum,sum);
        }
        return maxSum;
    }

    // As per the article which is same with slight difference (wrote a comment to show difference )
    public long maximumContigiousArrayKadanasSimilarity(int[] arr) {
        long maxSum = Long.MIN_VALUE;
        long sum = 0;
        int start = -1;
        int end = -1;
        for (int i = 0; i < arr.length; i++) {
            if(sum == 0) start = i;
            sum = sum + arr[i];
            if(sum > maxSum) {
                maxSum = sum;
                end = i;
            }
            // This line is the difference
            if(sum < 0) {
                sum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        MaximumContigiousSubArraySum obj = new MaximumContigiousSubArraySum();
        long result = obj.maximumContigiousArrayKadanasSimilarity(arr);
        System.out.println("Maximum sum of the array is: " + result);
    }
}
