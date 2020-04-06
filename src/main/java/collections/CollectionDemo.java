package collections;

import java.util.*;

public class CollectionDemo {

    public static final int SIZE = 40;

    public static void main(String[] args) {
        Collection<Integer> integers = Arrays.asList(1,2,3,4,6);
        Collection<String> strings = Arrays.asList("abc", "cbd", "xyz");

        Integer value;
        for (Iterator<Integer> iterator = integers.iterator();
            iterator.hasNext(); value = iterator.next()){
        }

        for (int i = 0; i < SIZE; i++) {

        }

        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String valueS = iterator.next();
            System.out.println(valueS);

        }

        for (Integer integer : integers) {

        }

        IterableString is = new IterableString();

//        for (Character i : is) {
//            System.out.println("*".repeat(10));
//        }

        String s= "test";

        List<String> stringList = new ArrayList<>();
        stringList.add("abr");
        stringList.add("ttt");
        stringList.add("test");
        stringList.add("eth");

        System.out.println(stringList.size());
/*        for (int i = stringList.size()-1; i >= 0; i--) {
            System.out.println(stringList + " : i = " + i);
            stringList.remove(i);
        }*/

        Iterator<String> it = stringList.iterator();
        for (;it.hasNext();)
        {
            System.out.println(it.next());
            it.remove();
        }
        System.out.println(stringList.size());

    }

    private static class IterableString implements Iterable<Character> {
        @Override
        public Iterator<Character> iterator() {
            System.out.println("I am here");
            return null;
        }
    }
}
