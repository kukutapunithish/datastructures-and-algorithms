package patterns;

public class Pattern18 {
    public static void main(String[] args) {

    /*
       n =5
        E
        E D
        E D C
        E D C B
        E D C B A

     */
        int n = 5;
        for (int i = 0; i < n; i++) {
            int charA = 65;
            int printChar = charA + (n - 1);
            for (int j = i; j >= 0; j--) {
                System.out.print(((char) (printChar)) + " ");
                printChar-=1;
            }
            System.out.println();
        }

    }
}
