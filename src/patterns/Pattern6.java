package patterns;

public class Pattern6 {
    public static void main(String[] args) {

    /*
        n =5
        1 2 3 4 5
        1 2 3 4
        1 2 3
        1 2
        1

     */
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                if (j != n - i - 1) System.out.print((j + 1) + " ");
                else System.out.print(j + 1);
            }
            System.out.println();
        }

    }
}
