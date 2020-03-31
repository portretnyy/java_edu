package collections;

import java.util.*;
public class Maps {
    public static void main(String[] args) {
        Map<WrongKey, String> wrongMap = new HashMap<>();
        WrongKey testWrongKey = new WrongKey("test", 1);
        wrongMap.put(testWrongKey, "abc");
        wrongMap.put(new WrongKey("foo", 2), "bar");
        wrongMap.put(new WrongKey("test2", 2), "qwe");
        System.out.println("wrongMap.size() = " + wrongMap.size());

        String test = wrongMap.get(testWrongKey);
        System.out.println("test = " + test);
        WrongKey key1 = new WrongKey("test", 1);
        WrongKey key2 = new WrongKey("test", 1);
        System.out.println("key1 = " + key1.hashCode());
        System.out.println("key2 = " + key2.hashCode());
        //-***********************

        Map<RightKey, String> rightMap = new HashMap<>();

        rightMap.put(new RightKey("test",1 , "bar"), "test");
        rightMap.put(new RightKey("foo", 2, "bac"), "bar");
        String test1 = rightMap.get(new RightKey("test", 1, "bar"));
        System.out.println("test1 = " + test1);

    }

    private static class WrongKey {
        String name;
        int value;

        public WrongKey(String name, int value) {
            this.name = name;
            this.value = value;
        }
    }

    private static class RightKey {
        String name;
        int value;
        String data;
        public RightKey(String name, int value, String data) {
            this.name = name;
            this.value = value;
            this.data = data;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            RightKey rightKey = (RightKey) o;
            return value == rightKey.value &&
                    Objects.equals(name, rightKey.name) &&
                    Objects.equals(data, rightKey.data);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, value, data);
        }
    }

}
