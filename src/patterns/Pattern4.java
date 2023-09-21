package patterns;

public class Pattern4 {
    public static void main(String[] args) {

    /*
       n =5
        1
        2 2
        3 3 3
        4 4 4 4
        5 5 5 5 5

     */
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j != i) System.out.print((i + 1) + " ");
                else System.out.print(i + 1);
            }
            System.out.println();
        }

    }
}
