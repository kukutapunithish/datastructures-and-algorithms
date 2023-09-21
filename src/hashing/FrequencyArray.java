package hashing;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FrequencyArray {

    void frequency() {
        int[] arr = {3, 2, 2, 2, 1};
        int N = 5;
        int P = 3;
        int[] hashArray = new int[N];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= N) hashArray[arr[i] - 1]++;
        }
        for (int i = 0; i < N; i++) {
            arr[i] = hashArray[i];
        }
        for (int a : arr) {
            System.out.println(a);
        }
    }

    Map secondFrequency() {
        int arr[] = {10, 5, 10, 15, 10, 5};
        HashMap<Integer, Integer> map = new HashMap();
        //Pre-compute
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());

        }
        return map;
    }


    public static void main(String[] args) {
        FrequencyArray f = new FrequencyArray();
        long start = System.currentTimeMillis();
        Map map = f.secondFrequency();
        int max = (int) Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getValue();
        int min = (int) Collections.min(map.entrySet(), Map.Entry.comparingByValue()).getValue();
        System.out.println("Max: " + max + " min: " + min);
        long end = System.currentTimeMillis();
        System.out.println((end-start)/1000.0);
    }
}
