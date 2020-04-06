package collections;

import java.util.*;

public class Sets2 {

    public static void main(String[] args) {
        Set<SetItem> set = new TreeSet<>();
        set.add(new SetItem());
    }

    public static void hashSets(String[] args) {
        Set<SetItem> set = new HashSet<>();

        set.add(new SetItem());
        set.add(new SetItem(0, "test"));
        set.add(new SetItem(1, "test"));

        System.out.println(set);
        System.out.println("set.size() = " + set.size());//??

        Set<String> randoms = new HashSet<>();
        Random random = new Random();
        for (int i = 0; i < 100_000; i++) {
            randoms.add(String.valueOf(random.nextLong()));
        }
        System.out.println("randoms.size() = " + randoms.size());
    }

    private static class SetItem {
        private int value = 0;
        private String stringValue = "test";

        public SetItem(int value, String stringValue) {
            this.value = value;
            this.stringValue = stringValue;
        }

        public SetItem() {
        }


        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (this.getClass() == obj.getClass()) {
                SetItem that = (SetItem) obj;
                return this.value == that.value &&
                        Objects.equals(this.stringValue, that.stringValue);
            }
            return false;
        }

        @Override
        public String toString() {
            return "SetItem{" +
                    "value=" + value +
                    ", stringValue='" + stringValue + '\'' +
                    '}';
        }
    }
}
