package problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Слова называются анаграммами друг друга, если одно из них можно получить перестановкой букв в другом. Например, слово «eat» можно получить перестановкой букв слова «tea»,
 * поэтому эти слова являются анаграммами друг друга. Даны пары слов, проверьте для каждой из них, являются ли слова этой пары анаграммами друг друга.
 *
 * Указание
 * Один из способов проверки того, являются ли слова анаграммами друг друга, заключается в следующем.
 * Для каждого слова с помощью словаря подсчитаем, сколько раз в нём встречается каждая буква. Если для обоих слов эти словари равны
 */
public class Anagrams2 {
    public static boolean isAnagram(String word1, String word2) {
        if (word1 == null || word2 == null) return false;
        if (word1.length() != word2.length()) return false;
        if (word1.equals(word2)) return true;

        Map<Character, Integer>  wordMap1 = stringToMap(word1);
        Map<Character, Integer>  wordMap2 = stringToMap(word2);

        return wordMap1.equals(wordMap2);
    }

    private static Map<Character, Integer> stringToMap(String word) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            map.put(word.charAt(i), map.getOrDefault(word.charAt(i),0) + 1);
        }
        return map;
    }
}
