package arrays;

import java.util.*;

public class UnionArray {

    List<Integer> unionArrayOne(int[] arr1, int[] arr2) {
        Set<Integer> res = new TreeSet();
        List<Integer> li = new ArrayList<>();
        for (int a : arr1) {
            res.add(a);
        }
        for (int a : arr2) {
            res.add(a);
        }
        res.stream().forEach(it -> li.add(it));
        return li;
    }

    List<Integer> unionArrayTwo(int[] arr1, int[] arr2) {
        List<Integer> res = new ArrayList<>();
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i = 0;
        int j = 0;
        int countIndex = -1;
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                if (res.size() == 0 || arr1[i] != res.get(countIndex)) {
                    res.add(arr1[i]);
                    countIndex++;
                }
                i++;
            } else {
                if (res.size() == 0 || arr2[j] != res.get(countIndex)) {
                    res.add(arr2[j]);
                    countIndex++;
                }
                j++;
            }
        }
        while (i < n1) {
            if (res.size() == 0 || arr1[i] != res.get(countIndex)) {
                res.add(arr1[i]);
                countIndex++;
            }
            i++;
        }
        while (j < n2) {
            if (res.size() == 0 || arr2[j] != res.get(countIndex)) {
                res.add(arr2[j]);
                countIndex++;
            }
            j++;
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
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3};
        UnionArray u = new UnionArray();
        List<Integer> resArray = u.unionArrayTwo(arr1, arr2);
        u.printArray(resArray);
    }
}
