package recursion;

public class factorialN {

    //Parameterized Requires something to hold the values
    long printN(long n, long fact) {
        if (n > 0) {
            return printN(n - 1, fact * n);
        } else {
            return fact;
        }
    }

    //Functional Returns the result
    long secondPrintN(long n) {
        if(n==1) {
            return n;
        }
        else {
            return n * secondPrintN(n - 1);
        }
    }

    public static void main(String[] args) {
        long n = 20;
        long fact = 1;
        factorialN p = new factorialN();
        long startTime = System.currentTimeMillis();
        System.out.println("First Method: " + p.printN(n, fact));
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);
        startTime = System.currentTimeMillis();
        System.out.println( "Second Method: " + p.secondPrintN(n));
        endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);

    }

}
