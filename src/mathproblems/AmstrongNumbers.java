package mathproblems;

/*
Check if a number is Armstrong Number or not
*/
public class AmstrongNumbers {

    public static void main(String[] args) {
        int n = 370;
        int temp = n;
        int sum = 0;
        while (temp > 0) {
            sum = sum + (int) Math.pow(temp % 10, 3);
            temp = temp/10;
        }
        if(sum == n){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }

}
