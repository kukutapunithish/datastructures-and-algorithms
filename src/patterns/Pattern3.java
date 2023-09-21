package patterns;

public class Pattern3 {
    public static void main(String[] args) {

    /*
       n =5
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5

     */
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j != i) System.out.print((j + 1) + " ");
                else System.out.print(j + 1);
            }
            System.out.println();
        }

    }
}
