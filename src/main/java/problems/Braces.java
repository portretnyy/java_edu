package problems;


import java.util.*;

/**
 * задачи с на проверку валидности скобок
 */
public class Braces {

    /**
     * входная строка должна состоять из двух видов символов '(' и ')'
     *
     * @param input входная строка
     * @throws IllegalArgumentException если присутствуют иные символы
     */
    public static boolean isValidOneType(String input) throws IllegalArgumentException {

        if (input == null || input.length() % 2 != 0) {
            return false;
        }

        Deque<Character> braces = new LinkedList<>();
        char currentChar;
        for (int i = 0; i < input.length(); i++) {
            currentChar = input.charAt(i);
            if (currentChar != '(' && currentChar != ')') {
                throw new IllegalArgumentException("Wrong string!");
            } else braces.push(currentChar);
        }

        for (int i = 0; i < braces.size() / 2; i++) {
            if (braces.peekLast() == braces.peekFirst()) return false;
            else {
                braces.pollFirst();
                braces.pollLast();
            }
        }
        return true;
    }

    public static void main(String[] args) {
        isValidOneType("((()))");
    }
}
