package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Problem Statement: Given an array, print all the elements which are leaders.
A Leader is an element that is greater than all of the elements on its right side in the array.
 arr = [10, 22, 12, 3, 0, 6]
Output:

 22 12 6
Explanation:

 6 is a leader.
 In addition to that, 12 is greater than all the elements in its right side (3, 0, 6), also 22 is greater than 12, 3, 0, 6.
*/
public class LeaderElements {

    List<Integer> getLeaderElements(int[] arr) {
        int maxElement = Integer.MIN_VALUE;
        List<Integer> result = new ArrayList<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            if(arr[i] >= maxElement) {
                maxElement = arr[i];
                result.add(arr[i]);
            }
        }
        Collections.reverse(result);
        return result;
    }

    public static void main(String[] args) {
        LeaderElements obj = new LeaderElements();
        int[] arr = {61, 61, 17};
        List result = obj.getLeaderElements(arr);
        System.out.println("Leader elements of the array are: " + result);
    }
}
