package mathproblems;

/*
Reverse a number
*/
public class ReverseOfNumber {

    public static void main(String[] args) {
        int n = 532;
        int temp = n;
        int revNum = 0;
        while (temp > 0) {
            revNum = revNum * 10 + temp % 10;
            temp = temp / 10;
        }
        System.out.println(revNum);
    }
}
