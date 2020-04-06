package collections;

import java.util.*;

public class Lists {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("test");//elementData = new Object[10]; elementData[0] = "test"
        strings.add("test1");
        strings.add("test3");//O(1)
        strings.add("test4");
        strings.add("test5");
        strings.add("test6");
        strings.add("test7");
        strings.add("test1");
        strings.add("test3");
        strings.add("test4");
        strings.add("test5");//elementDataTemp = Arrays.copyOf(elementData, 15) (there are new Object[15]), elementData = elementDataTemp
        strings.add("test6");
        strings.add("test7");
        strings.add(1, "bad element");//O(n)
        System.out.println(strings);
        strings.ensureCapacity(10000);
        System.out.println(strings);

        ///
        boolean exists = strings.contains("test7");//O(n)

        strings.get(0);//randomAccess almost the same as arr[0] // O(1)

        strings.remove("test5");//same asymptotic as contains O(n)
        strings.remove(0);//O(1)

        LinkedList<String> llist = new LinkedList<>();


//        llist.push();
//        llist.pop();
        Queue<String> queue = new LinkedList<>();

        queue.add("test"); // inserts into end
        queue.add("qwe");
        queue.add("foo");
        queue.add("bar");
        while(!queue.isEmpty()) {
            System.out.println("queue.poll() = " + queue.poll());
        }

        Deque<String> deque = null;
        //deque.push(); == deque.addLast();
        //deque.pop();
        //deque.peek() == deque.peekLast();
        //deque.peekFirst();
    }

    private static <E> boolean contains(ArrayList<E> list, E value){ //Реализация для ArrayList.contains
        return true;
    }
}
