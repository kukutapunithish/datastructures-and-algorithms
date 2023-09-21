package recursion;

public class PrintNToOne {

    void printN(int n) {
        if (n > 0) {
            System.out.print(n + " ");
            printN(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 10;
        PrintNToOne p = new PrintNToOne();
        p.printN(n);

    }

}
