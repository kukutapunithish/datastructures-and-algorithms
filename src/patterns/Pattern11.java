package patterns;

public class Pattern11 {
    public static void main(String[] args) {

    /*
       n =5
         0 1 2 3 4

    0    1              0 2 2 4 4 6 4 6 8
    1    0 1
    2    1 0 1
    3    0 1 0 1
    4    1 0 1 0 1

     */
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if((i + j)%2 == 0) System.out.print("1 ");
                else System.out.print("0 ");
            }
            System.out.println();
        }

        System.out.println("\n\n");

        //Alternate approach
        int printBit = 1;
        for (int i = 0; i < n; i++) {
            if(i % 2 == 0) printBit = 1;
            else printBit = 0;
            for (int j = 0; j <= i; j++) {
                System.out.print(printBit + " ");
                printBit = 1 - printBit;
            }
            System.out.println();
        }


    }
}
