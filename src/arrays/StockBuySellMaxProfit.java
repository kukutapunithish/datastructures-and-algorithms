package arrays;

/*

choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
Return the maximum profit
Example:
Input: arr = [7,1,5,3,6,4] Output: 5
Explanation:
Buy on day 2 (price = 1) and
sell on day 5 (price = 6), profit = 6-1 = 5.

*/
public class StockBuySellMaxProfit {
    public long maximumProfitBruteForceApproach(int[] arr) {
        long maxSum = Long.MIN_VALUE;
        long sum;
        int start = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                sum = arr[j] - arr[i];
                if(sum > maxSum) {
                    maxSum = sum;
                }

            }
        }
        return Math.max(maxSum,0);
    }

    public long maximumProfitOptimal(int[] arr) {
        long maxSum = Long.MIN_VALUE;
        long sum = 0;
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i] - arr[i - 1];
            if(sum > maxSum) {
                maxSum = sum;

            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return Math.max(maxSum,0);
    }
    public long maximumProfitOptimalMinMaxApproach(int[] arr) {
        long minPrice = Long.MAX_VALUE;
        long maxPro = 0;
        for (int i = 0; i < arr.length; i++) {
            minPrice = Math.min(minPrice,arr[i]);
            maxPro = Math.max(maxPro,arr[i] - minPrice);
        }
        return maxPro;
    }

    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        StockBuySellMaxProfit obj = new StockBuySellMaxProfit();
        long result = obj.maximumProfitOptimalMinMaxApproach(arr);
        System.out.println("Maximum profit of the array is: " + result);
    }
}
