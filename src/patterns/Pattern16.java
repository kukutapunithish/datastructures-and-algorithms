package patterns;

public class Pattern16 {
    public static void main(String[] args) {

    /*
       n =5
        A
        BB
        CCC
        DDDD
        EEEEE

     */
        int n = 5;
        for (int i = 0; i < n; i++) {
            int charA = 65;
            for (int j = 0; j <= i; j++) {
                System.out.print((char)(charA + i));
            }
            System.out.println();
        }

    }
}
