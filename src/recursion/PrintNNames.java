package recursion;

public class PrintNNames {

    void printN(int n) {
        if (n > 0) {
            printN(n - 1);
            System.out.print("GFG ");
        }
    }

    public static void main(String[] args) {
        int n = 5;
        PrintNNames p = new PrintNNames();
        p.printN(n);

    }

}
