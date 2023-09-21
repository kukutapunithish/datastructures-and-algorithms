package recursion;

public class ReverseString {

    boolean printN(String s, int i) {
        if (i >= s.length() / 2) return true;
        if (!(s.charAt(i) == s.charAt(s.length() - i - 1))) return false;
        return printN(s, i + 1);

    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        int i = 0;
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        ReverseString p = new ReverseString();
        System.out.println(p.printN(s, i));

    }

}
