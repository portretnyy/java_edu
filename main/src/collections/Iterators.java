package collections;

import java.util.*;

public class Iterators {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        LinkedList<String> stringLinkedList = new LinkedList<>();
        HashSet<String> stringHashSet = new HashSet<>();
        Collection<String> collection = stringArrayList;
        Iterator<String> iterator = collection.iterator();
        System.out.println(iterator.getClass());
        collection = stringHashSet;
        System.out.println(collection.iterator().getClass());
    }
}
