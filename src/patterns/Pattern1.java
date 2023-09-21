package patterns;

public class Pattern1 {
    public static void main(String[] args) {

    /*
       n =5
     * * * * *
     * * * * *
     * * * * *
     * * * * *
     * * * * *

     */
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j != n - 1) System.out.print("* ");
                else System.out.print("*");
            }
            System.out.println();
        }

    }
}
