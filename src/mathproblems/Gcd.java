package mathproblems;

public class Gcd {

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
        System.out.print(g.lcm(gcd,a,b) + " " + gcd);
    }

}
