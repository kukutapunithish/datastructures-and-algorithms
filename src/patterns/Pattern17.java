package patterns;

public class Pattern17 {
    public static void main(String[] args) {

    /*
    n=4

       A
      ABA
     ABCBA
    ABCDCBA
     */
        int n = 4;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            int charA = 65;
            for (int j = 0; j < i; j++) {
                System.out.print((char)(charA + j));
            }
            charA = 65;
            for (int j = i; j >= 0; j--) {
                System.out.print((char) (charA + j));
            }
            System.out.println();
        }

        System.out.println("\n\n\n");
        //Alternate approach

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            char a = 'A';
            int breakPoint = (2*i + 1) / 2;
            for (int j = 1; j <= 2 * i + 1; j++) {
                System.out.print(a);
                if(j<=breakPoint) a++;
                else a--;
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
