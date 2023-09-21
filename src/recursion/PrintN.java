package recursion;

public class PrintN {

    void printN(int n) {
        if (n > 0) {
            printN(n - 1);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        int n = 10;
        PrintN p = new PrintN();
        p.printN(n);

    }

}
