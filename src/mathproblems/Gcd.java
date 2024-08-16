package mathproblems;

/*
Find GCD of two numbers
*/
public class Gcd {

    /*
    Algorithm of Euclidean:
        1. If A = 0 then GCD(A,B)=B, since the GCD(0,B)=B, and we can stop.
        2. If B = 0 then GCD(A,B)=A, since the GCD(A,0)=A, and we can stop.
        Write A in quotient remainder form (A = B⋅Q + R)
        3. Find GCD(B,R) using the Euclidean Algorithm since GCD(A,B) = GCD(B,R)
    */

    int gcd(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b) a = a % b;
            else b = b % a;
        }
        if (a == 0) return b;
        return a;
    }
    int lcm (int gcd , int a, int b) {
        return ((a*b)/gcd);
    }

    public static void main(String[] args) {
        Gcd g = new Gcd();
        int a = 5 , b =10;
        int gcd = g.gcd(a, b);
        System.out.println(g.lcm(gcd,a,b) + " " + gcd);
    }

}
