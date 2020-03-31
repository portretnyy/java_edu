package collections;

import java.util.*;

public class StringToList {

    public static void main(String[] args) {

        String str = new String("Value0,Value1,Value2,Value3");
        List<Character> characterList = new ArrayList<>();
        List<String> stringList = new ArrayList<>();
        Iterator<Character> iter = characterList.iterator();
        for (int i = 0; i < str.length(); i++) {
            characterList.add(str.charAt(i));
        }
        for (int i = 0; i < characterList.size(); i++) {
//            if (iter.hasNext() && iter.next() == ',') {
//                characterList
//            } else {
//
//            }
        }

        String s  = "test,abc,hello";
        int begin = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ',') {
                end = i;
                stringList.add(s.substring(begin, end));
                begin = end + 1;
            }
        }
        stringList.add(s.substring(begin));

        System.out.println(stringList);

        String problem2 = "key1=value1;key2=value2;key3=value3;keyN=valueM";
        System.out.println(toMap(problem2));
    }

    String problem2 = "key1=value1;key2=value2;key3=value3;keyN=valueM";
    //---->
    Map<String, String> dictionary;

    public static Map<String, String> toMap(String s) {
        int begin = 0;
        int equals = 0;
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '=') equals = i;
            else if (s.charAt(i) == ';') {
                map.put(s.substring(begin, equals), s.substring(equals + 1, i));
                begin = i + 1;
            }
        }
        map.put(s.substring(begin, equals), s.substring(equals + 1, s.length()));
        return map;
    }
}
