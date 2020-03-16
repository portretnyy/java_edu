package misc;

//example abba
//aca, bbbbbb
//not polindrome abc, ttttttttett
public class Palindrome {
    public static boolean isPalindrome(String s){
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            //i chars.length - (i + 1)
            //0 chars.length - 1
            //1 chars.length - 2
            //2 chars.length - 3
            //....
            int tail = chars.length - (i + 1);
            if (chars[i] != chars[tail]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean f = isPalindrome("tesat");
        System.out.println("isPalindrome(\"abbbba\") = " + isPalindrome("abbbba"));
        System.out.println("isPalindrome(\"test\") = " + isPalindrome("test"));
        System.out.println("isPalindrome(\"abcba\") = " + isPalindrome("abcba"));
    }
}
