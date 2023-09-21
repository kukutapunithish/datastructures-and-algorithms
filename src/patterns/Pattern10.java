package patterns;

public class Pattern10 {
    public static void main(String[] args) {

    /*
       n =5
    *
    * *
    * * *
    * * * *
    * * * * *
    * * * *
    * * *
    * *
    *

     */
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\n\n");

        //Alternative approach
        for (int i = 1; i <= 2 * n - 1; i++) {
            int j = i;
            if(i > n) j = 2 * n - i;
            for (int k = 1; k <= j; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
