package patterns;

public class Pattern19 {
    public static void main(String[] args) {

    /*
        n =5

        **********
        ****  ****
        ***    ***
        **      **
        *        *
        *        *
        **      **
        ***    ***
        ****  ****
        **********

     */
        int n = 5;
        //Approach one
        for (int i = 1; i <= n; i++) {
            for (int j =1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 1; j < 2*n - 2*(n-i) -1; j++) {
                System.out.print(" ");
            }
            for (int j =1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j =1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 1; j < 2*n - 2*(n-i) -1; j++) {
                System.out.print(" ");
            }
            for (int j =1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n\n\n");
        //Approach two




    }
}
