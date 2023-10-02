package mathproblems;

/*
Check if a number is Palindrome or Not
*/
public class Palindrome {

    public static void main(String[] args) {
        int n = 555;
        StringBuilder checkString = new StringBuilder();
        checkString.append(n);
        if((checkString.reverse().toString()).equals(String.valueOf(n))){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }

}
