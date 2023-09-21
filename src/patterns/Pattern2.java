package patterns;

public class Pattern2 {
    public static void main(String[] args) {

    /*
       n =5
        *
        * *
        * * *
        * * * *
        * * * * *

     */
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j != i) System.out.print("* ");
                else System.out.print("*");
            }
            System.out.println();
        }

    }
}
