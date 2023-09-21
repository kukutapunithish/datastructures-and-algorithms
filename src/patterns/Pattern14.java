package patterns;

public class Pattern14 {
    public static void main(String[] args) {

    /*
       n =5
        A
        AB
        ABC
        ABCD
        ABCDE

     */
        int n = 5;
        for (int i = 0; i < n; i++) {
            int charA = 65;
            for (int j = 0; j <= i; j++) {
                System.out.print((char)(charA + j));
            }
            System.out.println();
        }

        System.out.println("\n\n\n");

        //Alternate Approach

        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch <= 'A' + i ; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }

    }
}
