package patterns;

public class Pattern15 {
    public static void main(String[] args) {

    /*
        n =5

        ABCDE
        ABCD
        ABC
        AB
        A

     */
        int n = 5;
        for (int i = 0; i < n; i++) {
            int charA = 65;
            for (int j = 0; j < n - i; j++) {
                System.out.print((char)(charA + j));
            }
            System.out.println();
        }

    }
}
