package algo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class sortComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1<o2) return 1;
        else if(o1>o2) return -1;
        else return 0;
    }
}

public class SortingMethods {

    public static void main(String[] args) {
        List<Integer> sortList = new ArrayList<>();
        sortList.add(1);
        sortList.add(5);
        sortList.add(3);
        sortList.sort(new sortComparator());
        for (Integer a:sortList) {
            System.out.println(a);
        }
    }

}
