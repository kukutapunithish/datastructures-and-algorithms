package recursion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Fibonacci {

    long[] printN(long[] li, long a, long b, int n) {
        if (n > 1) {
            li[li.length - n + 1] = b;
            n--;
            return printN(li, b, b + a, n);
        }
        return li;
    }

    long secondPrintN(int n, long a, long b) {
        if (n > 2) {
            n--;
            return secondPrintN(n, b, b + a);
        }
        return b;
    }

    int thirdPrintN(int n) {
        if (n <= 1) {
            return n;
        }
        return thirdPrintN(n - 1) + thirdPrintN(n - 2);
    }

    public static void main(String[] args) {
        long a = 0, b = 1;
        int n = 3;
        long[] li = new long[n];
        Fibonacci p = new Fibonacci();
        li[0] = a;
        long[] res = p.printN(li, a, b, n);
        System.out.println("First Approach: ");
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
        System.out.println("Second Approach: ");
        System.out.println(p.secondPrintN(n, a, b));
        System.out.println("Third Approach: ");
        System.out.println(p.thirdPrintN(4));
    }

}
