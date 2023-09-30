package mathproblems;

/*
Problem Statement: Given an integer N, write a program to count the number of digits in N.
*/
public class CountDigits {
    public static void main(String[] args) {
        int n = 23;
        Integer a = n;
        String digits = a.toString();
        int lenString  = digits.length();

        System.out.println(lenString);
    }

}
