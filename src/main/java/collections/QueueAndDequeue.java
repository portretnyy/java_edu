package collections;

import java.util.*;

public class QueueAndDequeue {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        List<String> people = new ArrayList<>();

        people.add("Jack");
        people.add("Mary");
        people.add("Josh");
        people.add("Sarah");
        people.add("Natalie");
        people.add("Mark");
        people.add("Anna");
        people.add("Max");
        people.add("George");

        for (int i = 0; i < people.size(); i++) {
            if (queue.size() <= 3) {
                queue.offer(people.get(i));
            } else {
                queue.poll();
                --i;
            }
        }

        System.out.println(queue);


    }
}
