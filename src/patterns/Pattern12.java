package patterns;

public class Pattern12 {
    public static void main(String[] args) {

    /*
       n =5

         0 1 2 3 4 5 6 7 8 9

    0    1                 1
    1    1 2             2 1
    2    1 2 3         3 2 1
    3    1 2 3 4     4 3 2 1
    4    1 2 3 4 5 5 4 3 2 1

     */
        //2 * n - 2 * i
        // (2*n + 2*(n-1) + 1)     (2*(i-1) + 2*i)

        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if(j==i) System.out.print(j);
                else System.out.print(j + " ");
            }
            for (int j = 1; j <= (2*n + 2*(n-1) + 1)   -  (2*(i-1) + 2*i); j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                if(j==1) System.out.print(j);
                else System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("\n\n");


    }
}
