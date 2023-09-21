package patterns;

public class Pattern8 {
    public static void main(String[] args) {

    /*
    n = 5
    *********
     *******
      *****
       ***
        *

     */
        int n = 5;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n\n\n");

        //Alternate approach

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * n  - ( 2 * i  + 1); j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
