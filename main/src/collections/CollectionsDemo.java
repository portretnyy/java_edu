package collections;

import java.util.*;

public class CollectionsDemo {

    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<String>();


        String st = "string";
        String notS = "this is not string";
        collection.add(st);
        collection.add(notS);


        System.out.println("collection.size() = " + collection.size());

        for (String s : collection) {
            System.out.println(s);
        }

        List<String> list = new ArrayList<>();
        System.out.println("list.size() = " + list.size());
        list.add("test_string");
        list.add("foo");
        list.add("bar");
        String foo = "foo";
        list.add(foo);
        list.add(foo);
        System.out.println("list.get(2) = " + list.get(2));
        System.out.println("list.size() = " + list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println("list.get("+ i + ") = " + list.get(i));
        }

        int[] arr = {1,0,56,34,-1};
        System.out.println("******************************************************************************************");
        Set<String> set = new TreeSet<>();
        set.add("string1");
        set.add("string2");
        set.add("foo_bar");
        System.out.println("set.add(\"abc\") = " + set.add("abc"));
        System.out.println("set.add(\"abc\") = " + set.add("abc"));
        System.out.println("set.size() = " + set.size());

        System.out.print("set = {");
        for (String s : set) {
            System.out.print(s + "\t");
        }
        System.out.println("}");
        int a = 10;
        Integer x = a;

        List<Long> longList = new ArrayList<>();


        longList.add(10L);

        System.out.println("foo.hashCode() = " + foo.hashCode());


        Map<String, Integer> prices = new HashMap<>();

        prices.put("гречка", 70);
        prices.put("рис", 60);
        prices.put("хлеб", 30);

        Integer hleb = prices.get("хлеб");
        System.out.println("hleb = " + hleb);

        System.out.println("prices.get(\"спагетти\") = " + prices.get("спагетти"));

        if (prices.containsKey("гречка")) {
            prices.put("гречка", 100);
        }


    }
}
