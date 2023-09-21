package patterns;

public class Pattern22 {
    public static void main(String[] args) {

    /*
       n = 4

    4 4 4 4 4 4 4
    4 3 3 3 3 3 4
    4 3 2 2 2 3 4
    4 3 2 1 2 3 4
    4 3 2 2 2 3 4
    4 3 3 3 3 3 4
    4 4 4 4 4 4 4

    4           4   // 11  5    1
    4 3       3 4   // 7   3    2
    4 3 2   2 3 4   // 3   1    3
    4 3 2 1 2 3 4   // 0   0    4
    4 3 2   2 3 4   // 3   1    5
    4 3       3 4   // 7   3    6
    4           4   // 11  5    7


     */
        int n = 4;
        int fillNum = 2 * n - 3;
        for (int i = 1; i <= 2 * n - 1; i++) {
            int displayNum = n;
            int j = i;
            if (i > n) j = 2 * n - i;
            for (int k = j; k >= 1; k--) {
                System.out.print(displayNum + " ");
                displayNum -= 1;
            }

            for (int k = 0; k < fillNum; k++) {
                System.out.print((displayNum + 1) + " ");
            }
            displayNum += 1;
            for (int k = 1; k <= j; k++) {
                if (displayNum != 1) System.out.print(displayNum + " ");
                displayNum += 1;
            }
            if (i < n) fillNum -= 2;
            else fillNum += 2;
            System.out.println();
        }

        System.out.println("\n\n\n");

        //Alternate Approach

        //This approach takes the distance from all directions and claculates the minimum value and subtracts it with n

        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                int top = i;
                int left = j;
                int right = (2 * n - 2) - j;
                int bottom = (2 * n - 2) - i;
                System.out.print((n-(Math.min(Math.min(top,left),Math.min(bottom,right)))) + " ");
            }
            System.out.println();
        }

    }
}
