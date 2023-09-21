package arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IntersectionArray {


    /*
    1,2,3,3,4,5     =>arr1
    1,2,2,3,3       =>arr2
    1,2,3,3         =>res
    */
    List<Integer> intersectionArray(int[] arr1, int[] arr2) {
        List<Integer> res = new ArrayList<>();
        int countIndex = -1;
        int i = 0, j = 0;
        int n1 = arr1.length, n2 = arr2.length;
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                if(arr1[i] == arr2[j]) {
                    res.add(arr1[i]);
                    j++;
                }
                i++;
            }
            else{
                j++;
            }
        }
        return res;
    }

    void printArray(List<Integer> arr) {
        Iterator i = arr.iterator();
        while (i.hasNext()) {
            System.out.print(i.next() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        IntersectionArray i = new IntersectionArray();
        int[] arr1 = {1, 2, 3, 3, 4, 5};
        int[] arr2 = {1, 2, 2, 3, 3};
        List<Integer> res = i.intersectionArray(arr1, arr2);
        i.printArray(res);
    }

}
