package arrays;

public class LargestConcecutiveOnes {

    int checkLargestConcecutive(int[] prices){
        int count = 0;
        int max = 0;

        for(int i = 0; i < prices.length; i++ ) {
            if(prices[i] == 1){
                count += 1;
            }
            else {
                if(count > max) {
                    max = count;
                }
                count = 0;
            }
        }
        if(count > max) {
            max = count;
        }

        return max;
    }

    public static void main(String args[]) {
        int[] prices = {1, 0, 1, 1, 0, 1};
        LargestConcecutiveOnes lco = new LargestConcecutiveOnes();
        int result = lco.checkLargestConcecutive(prices);
        System.out.println("Result: "+result);

    }
}
