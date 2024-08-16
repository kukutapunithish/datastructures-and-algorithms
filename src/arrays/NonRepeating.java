package arrays;

import java.util.*;

// Given a non-empty array of integers arr, every element appears twice except for one. Find that single one.
public class NonRepeating {

    int nonRepeatingNumberBruteForce(int[] elements) {
        for(int i = 0; i < elements.length; i++) {
            int count = 1;
            for (int j = 0; j < elements.length; j++) {
                if(i != j) {
                    if(elements[i] == elements[j]) {
                        count += 1;
                    }
                }
            }
            if(count == 1) {
                return elements[i];
            }
        }
        return -1;
    } 

    int nonRepeatingNumberSortApproach(int[] elements) {
        Arrays.sort(elements);
        System.out.println(Arrays.toString(elements));
        int count = 1;
        int element = elements[0];
        for(int i = 1; i < elements.length; i++) {
            if(elements[i] != element) {
                if(count == 1) {
                    return element;
                }
                element = elements[i];
                count = 1;
            }
            else {
                count += 1;
            }
        }
        if(count == 1) {
            return element;
        }

        return -1;
    }

    Map hashElements(int[] elements) {
        HashMap<Integer,Integer> freqArray = new HashMap<>();
        for (int i = 0; i < elements.length; i++) {
            if(freqArray.containsKey(elements[i])) {
                freqArray.put(elements[i],freqArray.get(elements[i]) + 1);
            }
            else {
                freqArray.put(elements[i],  1);
            }
        }
        return freqArray;
    }

    int nonRepeatingNumberHashApproach(Map hashedElements) {
        Object[] ele = hashedElements.keySet().toArray();
        for (int i = 0; i < ele.length; i++) {
            if((int)hashedElements.get(ele[i]) == 1) {
                return (int) ele[i];
            }
        }
        return -1;
    }

//    use XOR
    int nonRepeatingXORApproach(int[] elements) {
        int xorVal = 0;
        for (int i = 0; i < elements.length; i++) {
            xorVal = xorVal ^ elements[i];
        }
        return xorVal;
    }

    public static void main(String[] args) {
        NonRepeating non = new NonRepeating();
        int[] elements = {4,1,2,1,2};
        System.out.println(Arrays.toString(elements));
        int result = non.nonRepeatingNumberBruteForce(elements);
        System.out.println("Result: " + result);
        int resultWithSortingApproach = non.nonRepeatingNumberSortApproach(elements);
        System.out.println("Result: " + resultWithSortingApproach);
        Map freqArray = non.hashElements(elements);
        int resultWithHashMap = non.nonRepeatingNumberHashApproach(freqArray);
        System.out.println("Result: " + resultWithHashMap);
        int resultWithXOR = non.nonRepeatingXORApproach(elements);
        System.out.println("Result: "+ resultWithXOR);

    }
    
}
