package mathproblems;

public class CountNumbers {
    public static void main(String[] args) {
        int n = 23;
        Integer a = n;
        String digits = a.toString();
        int lenString  = digits.length();

        int resultCount = 0;
        for (int i = 0; i < lenString; i++) {
            if(n % (Integer.parseInt(digits.substring(i,i+1))) == 0) {
                resultCount+=1;
            }
        }
        System.out.println(resultCount);

    }

}
