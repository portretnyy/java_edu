package problems;

import java.util.*;

/**
 * Слова называются анаграммами друг друга, если одно из них можно получить перестановкой букв в другом. Например, слово «eat» можно получить перестановкой букв слова «tea»,
 * поэтому эти слова являются анаграммами друг друга. Даны пары слов, проверьте для каждой из них, являются ли слова этой пары анаграммами друг друга.
 *
 * Указание
 * Один из способов проверки того, являются ли слова анаграммами друг друга, заключается в следующем.
 * Для каждого слова с помощью словаря подсчитаем, сколько раз в нём встречается каждая буква. Если для обоих слов эти словари равны
 */
public class Anagrams {
    public static boolean isAnagram2(String word1, String word2) {
        if (word1.length() == word2.length()) {
            char firstWord[] = word1.toCharArray();
            char secondWord[] = word2.toCharArray();
            //Здесь хотел попробовать отсортировать вышеуказанные массивы и сравнить их(в процессе)
            //По задумке анаграммы при сравнении после сортировки дадут идентичные значения
        }
        return false;
    }

    public static boolean isAnagram(String word1, String word2) {
        if (word1 != null && word2 != null) {

            if (word1.length() == word2.length()) {

                Map<Character, Integer> dict1 = new HashMap<>();
                Map<Character, Integer> dict2 = new HashMap<>();

                createDictionary(dict1, word1);
                createDictionary(dict2, word2);

                return dict1.equals(dict2);
            }
        }
        return false;
    }

    public static void incrValueByKey(Map<Character, Integer> map, String word, int j) {
        int temp = map.get(word.charAt(j));
        temp += 1;
        map.put(word.charAt(j), temp);
    }

    public static void createDictionary(Map<Character, Integer> map, String word) {
        for (int i = 0; i < word.length(); i++) {
            if (!map.containsKey(word.charAt(i))) {
                map.put(word.charAt(i), 1);
            } else {
                incrValueByKey(map, word, i);
            }
        }
    }
}
