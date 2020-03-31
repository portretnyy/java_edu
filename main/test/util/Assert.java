package util;

import problems.synonyms.Synonyms;

import java.util.Objects;

public class Assert {

    public static void assertTrue(boolean condition) {
        if (!condition) {
            throw new RuntimeException("assertTrue");
        }
    }

    public static void assertFalse(boolean condition) {
        if (condition) {
            throw new RuntimeException("assertFalse");
        }
    }

    public static <T> void assertEquals(T o1, T o2) {
        if (!Objects.equals(o1, o2)) {
            throw new RuntimeException("assertEquals, but :" + o1 + " != " + o2);
        }
    }

    public static <T> void assertNotEquals(T o1, T o2) {
        if (Objects.equals(o1, o2)) {
            throw new RuntimeException("assertNotEquals, but :" + o1 + " == " + o2);
        }
    }

    public static void assertNotNull(Object obj) {
        if (obj == null) {
            throw new RuntimeException("assertNotNull");
        }
    }

    public static void assertNull(Object obj) {
        if (obj != null) {
            throw new RuntimeException("assertNull");
        }
    }
}
