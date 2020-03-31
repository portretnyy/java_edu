package collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapsAndSets {
    public static void main(String[] args) {
        Map<String, String> dict = new HashMap<>();
        dict.put("one", "odin");
        dict.put("two", "dva");
        dict.put("three", "tree");
        dict.putIfAbsent("one", "edenica");
        dict.putIfAbsent("four", "cheture");
        //#1
        //dict.keySet().for
        for (String key: dict.keySet()) {
            String value = dict.get(key);

            System.out.println("key = " + key + "; value = " + value);
        }
        System.out.println("#".repeat(80));
        //#2
        //dict.entrySet().for
        for (Map.Entry<String, String> entry: dict.entrySet()) {
            System.out.println("key = " + entry.getKey() + "; value = " + entry.getValue());
        }


        Set<Integer> integerSet = new HashSet<>();
        System.out.println("integerSet.add(1) = " + integerSet.add(1));
        System.out.println("integerSet.add(1) = " + integerSet.add(1));
        System.out.println("integerSet.add(1) = " + integerSet.add(1));
        System.out.println("integerSet.contains(1) = " + integerSet.contains(1));
    }
}
