/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
import java.lang.*;

public class Test {
    public static void main(String args[] ) throws Exception {

        //Write code here
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.nextLine();
        String a = sc.nextLine();
        String arr[] = a.split(" ");
        int[] num = new int[arr.length];
        int sum = 0;
        for(int i = 0; i < arr.length;i++){
            num[i] = Integer.parseInt(arr[i]);
            sum = sum + num[i];
        }
        System.out.println(sum);
        if(sum == 0 || sum < 0 ) {
            System.out.println(-1);
        }
        else {
            if(sum % 2 == 0) {
                System.out.println(sum - 1);
            }
            else {
                System.out.println(sum);
            }
        }

    }
}
