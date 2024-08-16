package mathproblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/*
Print all Divisors of a given Number
*/
public class Divisors {

    List divisorsOfNum(int n) {
        List<Integer> l = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) l.add(i);
        }
        return l;
    }

    List divisorsOfNumSecond(int n) {
        List<Integer> l = new ArrayList<>();
        for (int i = 1; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                l.add(i);
                if (i != n / i) l.add(n / i);
            }
        }
        Collections.sort(l);
        return l;
    }


    public static void main(String[] args) {
        int n = 36;
        Divisors d = new Divisors();
        Iterator t = d.divisorsOfNum(n).iterator();
        while (t.hasNext()) {
            System.out.print(t.next() + " ");
        }
        System.out.println();
        Iterator f = d.divisorsOfNumSecond(n).iterator();
        while (f.hasNext()) {
            System.out.print(f.next() + " ");
        }


    }
}
