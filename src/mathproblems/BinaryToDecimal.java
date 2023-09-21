package mathproblems;

public class BinaryToDecimal {
    public static void main(String[] args) {

        /*

        Binary of 1 in 32 bits representation-
        00000000000000000000000000000001
        Reversing the binary form we get,
        10000000000000000000000000000000,
        whose decimal value is 2147483648.
        */
        BinaryToDecimal b = new BinaryToDecimal();
        char[] binaryNum = b.decimalToBinary(1L);
        long decimalNum = 0;
        int count = 1;
        for (int i = 31; i >= 0; i--) {
            decimalNum = (long) ( decimalNum + (( binaryNum.length>=count ? (( Character.getNumericValue(binaryNum[31-i]) ) ):0 )) * (Math.pow(2, i)) );
            count+=1;
        }
        System.out.println(decimalNum);
    }

    char[] decimalToBinary(long num) {
        StringBuilder res = new StringBuilder();
        while(num>0) {
            res.append(num%2);
            num = num/2;
        }
        res.reverse();
        char[] ans = (res.toString().toCharArray());
        return ans;
    }

}
