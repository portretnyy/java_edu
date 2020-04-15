package problems;

import java.util.Deque;
import java.util.LinkedList;

/**
 * задачи с на проверку валидности скобок
 */
public class Braces2 {

    /**
     * входная строка должна состоять из двух видов символов '(' и ')'
     *
     * @param input входная строка
     * @throws IllegalArgumentException если присутствуют иные символы
     */
    public static boolean isValidOneType(String input) throws IllegalArgumentException {
        Deque<Character> braces = new LinkedList<>();
        if (input == null) return false;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '(') {
                braces.push(c);
            } else if (c == ')') {
                if (braces.isEmpty() || braces.pop() != '(') {
                    return false;
                }
            } else {
                throw new IllegalArgumentException("input should contain only ( and )");
            }
        }
        return braces.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValidOneType("(())"));
    }
}