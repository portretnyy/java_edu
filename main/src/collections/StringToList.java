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
            if (iter.hasNext() && iter.next() == ',') {
                characterList
            } else {

            }
        }
    }
}
