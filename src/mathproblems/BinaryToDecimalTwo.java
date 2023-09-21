package mathproblems;

public class BinaryToDecimalTwo {

    public static void main(String[] args) {
        long n = 5;
        StringBuilder str = new StringBuilder();
        str.append(Long.toBinaryString(n));
        int strLen = str.length();
        for (int i = 1; i <= 32 - strLen; i++) {
            str.insert(0,"0");
        }
        str.reverse();
        long res = Long.parseLong(str.toString(),2);
    }

}
