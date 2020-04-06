package collections;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        Set<Key> keys = new HashSet<>();
        keys.add(new Key(1));
        keys.add(new Key(2));
        System.out.println("keys = " + keys.size());
        keys.add(new Key(1));
        System.out.println("keys = " + keys.size());

    }

    private static class Key {
        int value;

        public Key(int value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Key key = (Key) o;
            return value == key.value;
        }

        @Override
        public int hashCode() {
            return Objects.hash(value);
        }
    }
}
