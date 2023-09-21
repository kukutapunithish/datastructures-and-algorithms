package containers;

import java.util.*;

public class PairPractice {

    public static void main(String[] args) {

        Vector<Integer> numbers = new Vector<>();
        numbers.add(1);
        numbers.add(2);
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(1);
        deque.addFirst(2);
        deque.addLast(4);
        deque.push(7);
        deque.pop();

        Iterator a = deque.iterator();
        while (a.hasNext()) {
            System.out.println(a.next());
        }

        System.out.println("End of Deque");

        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        stack.push(7);
        stack.pop();
        Iterator b = stack.iterator();
        while (b.hasNext()) {
            System.out.println(b.next());
        }

        System.out.println("End of the Stack");

        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(5);
        queue.add(1);
        queue.add(3);

        Iterator c = queue.iterator();
        while (c.hasNext()) {
            System.out.println(c.next());
        }

        System.out.println("End of the Queue");

        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(1);
        set.add(6);
        set.add(3);

        Iterator d = set.iterator();

        while (d.hasNext()) {
            System.out.println(d.next());
        }

        System.out.println("End of Set");

        Map<Integer, String> mapStudent = new HashMap<>();
        mapStudent.put(1, "Student 1");
        mapStudent.put(2, "Student 2");
        mapStudent.put(3, "Student 3");

        Iterator mapStudentIterator = mapStudent.entrySet().iterator();

        while (mapStudentIterator.hasNext()) {
            Map.Entry mapEntry = (Map.Entry) mapStudentIterator.next();
            System.out.println("Key is: " + mapEntry.getKey() + ", Value is: " + mapEntry.getValue());
        }

    }

}
