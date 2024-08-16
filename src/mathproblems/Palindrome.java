package mathproblems;

/*
Check if a number is Palindrome or Not
*/
public class Palindrome {

    public static void main(String[] args) {
        int n = 555;
        //First Approach.
        StringBuilder checkString = new StringBuilder();
        checkString.append(n);
        if ((checkString.reverse().toString()).equals(String.valueOf(n))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        //Second Approach
        int temp = n;
        int revNum = 0;
        while (temp > 0) {
            revNum = revNum * 10 + temp % 10;
            temp = temp / 10;
        }
        System.out.println(revNum == n ? "Yes" : "No");

    }

}
