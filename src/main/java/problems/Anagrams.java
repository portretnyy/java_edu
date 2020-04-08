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
        if (word1.length() == word2.length()) {                 //Если кол-во символов в первом слове не
                                                                //совпадает с кол-вом во втором -> false
            Map<Character, Integer> dict1 = new HashMap<>();
            Map<Character, Integer> dict2 = new HashMap<>();

            for (int i = 0; i < word1.length(); i++) {          //Составляем первый словарь
                if (!dict1.containsKey(word1.charAt(i))) {
                    dict1.put(word1.charAt(i), 1);
                } else {
                    incrValueByKey(dict1, word1, i);
                }
            }

            for (int i = 0; i < word2.length(); i++) {          //Состваляем второй словарь.
                if (!dict2.containsKey(word2.charAt(i))) {      //Если символа (ключа) нет,
                    dict2.put(word2.charAt(i), 1);              //добавляем его и значение 1.
                } else {                                        //Если уже есть такой символ (ключ),
                    incrValueByKey(dict2, word2, i);            //инкрементируем счетчик кол-ва.
                }
            }
            System.out.println(dict1);
            System.out.println(dict2);
            return dict1.equals(dict2);                         //Сравниваем оба словаря
        }
        return false;
    }

    // Метод инкрементирует значение на 1, согласно подставленным ключу и Map. Примитив j нужен для итерации
    public static void incrValueByKey(Map<Character, Integer> map, String word, int j) {
        int temp = map.get(word.charAt(j));
        temp += 1;
        map.put(word.charAt(j), temp);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram2("ратификация", "тарификация"));
    }
}
