package patterns;

public class Pattern13 {
    public static void main(String[] args) {

    /*
       n =5
        1
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15

     */
        int n = 5;
        int printNum = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(printNum + " ");
                printNum+=1;
            }
            System.out.println();
        }

    }
}
