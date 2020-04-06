package generics;


import javax.security.auth.login.AccountLockedException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class GenericDemo2 {

    public static void main(String[] args) {
        Verdict verdict = Verdict.ACCEPT;
        Verdict otherVerdict = Verdict.DENY;

        Verdict verdict1 = analyze("test", 1);
        Verdict verdict2 = analyze(new Struct("test", 1), 2);
    }


    public static void example() {
        List<String> list = new ArrayList<>();
        List<Login> logins = new ArrayList<>();
        List<Password> passwords = new ArrayList<>();
        Password password = new Password("12345678");
//        logins.add(password); not working!
//        DataHolder<Password> passwordDataHolder = new DataHolder<Password>(new Login[0]);//not working


    }


    public static class Login {
        private String data;

        public Login(String data) {
            this.data = data;
        }

        public String getData() {
            return data;
        }
    }

    public static class Password {
        private String data;

        public Password(String data) {
            this.data = data;
        }

        public String getData() {
            return data;
        }
    }


    public static <T extends CharSequence> Verdict analyze(T s, Integer i) {
        if (s.length() == i){
            return Verdict.NEUTRAL;
        }
        if (s.length() > i) {
            return Verdict.ACCEPT;
        }
        return Verdict.DENY;
    }

    public static class Struct implements CharSequence {
        String name;
        int length;

        public Struct(String name, int length) {
            this.name = name;
            this.length = length;
        }

        @Override
        public int length() {
            return length;
        }

        @Override
        public char charAt(int index) {
            return 0;
        }

        @Override
        public CharSequence subSequence(int start, int end) {
            return null;
        }

        @Override
        public IntStream chars() {
            return null;
        }

        @Override
        public IntStream codePoints() {
            return null;
        }
    }



    public static enum Verdict {
        DENY, NEUTRAL, ACCEPT
    }
}
