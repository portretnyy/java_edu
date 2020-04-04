package collections;

import java.util.*;

public class x2dList {

    public static void main(String[] args) {
        String[][] strings = {{"test"}, {"test2"}};

        List<List<String>> list2d = new ArrayList<>();
        list2d.add(new ArrayList<>());
        list2d.get(0).add("test");

        list2d.add(new ArrayList<>());
        list2d.get(1).add("test2");
        System.out.println(list2d);

        Map<String, ArrayList<String>> synonims = new HashMap<>();
        synonims.put("Ball", new ArrayList<String>(Arrays.asList("Football")));
        synonims.putIfAbsent("Ball", new ArrayList<String>(Arrays.asList("Basketball")));
        synonims.putIfAbsent("Moon", new ArrayList<String>(Arrays.asList("Sphere")));
        System.out.println(synonims);
        synonims.get("Moon").add("String");
        System.out.println(synonims);
        System.out.println(synonims.put("Ball", new ArrayList<String>(Arrays.asList("Football"))));
    }
}
