package recursion;

public class SumN {

    void printN(long n, long sum) {
        if (n > 0) {
            sum = sum + (long) Math.pow(n, 3);
            printN(n - 1, sum);
        }
        else {
            System.out.println(sum);
        }
    }

    public static void main(String[] args) {
        long n = 5;
        long sum = 0;
        SumN p = new SumN();
        p.printN(n, sum);

    }

}
