package problems;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AnagramsTest {
    private static String VERY_LONG_STRING = "?".repeat(100_000_000);

    @Test
    public void testCorrectness() {
        assertTrue(Anagrams.isAnagram("foo", "foo"));
        assertTrue(Anagrams.isAnagram("test", "estt"));
        assertTrue(Anagrams.isAnagram("home", "omeh"));
        assertTrue(Anagrams.isAnagram("tea", "eat"));
        assertTrue(Anagrams.isAnagram("сон", "нос"));
        assertTrue(Anagrams.isAnagram("ратификация", "тарификация"));
        assertTrue(Anagrams.isAnagram("старорежимность","нерасторжимость"));
        assertTrue(Anagrams.isAnagram("клоун",  "колун"));
        assertTrue(Anagrams.isAnagram("уклон", "кулон"));
        assertTrue(Anagrams.isAnagram("крона", "нарок"));


        assertFalse(Anagrams.isAnagram(null, null));
        assertFalse(Anagrams.isAnagram("test", null));
        assertFalse(Anagrams.isAnagram("", "estt"));
        assertFalse(Anagrams.isAnagram("attribute", "atribute"));
        assertFalse(Anagrams.isAnagram("Ратификация", "Тарификация"));
        assertFalse(Anagrams.isAnagram("Старорежимность","Нерасторжимость"));
    }

    @Test
    public void testSpeed() {
        long time = System.nanoTime();

        assertFalse(Anagrams.isAnagram(VERY_LONG_STRING, "test"));
        long range = System.nanoTime() - time;
        System.out.println(range);
        assertTrue(range < 40_000_000);
    }
}