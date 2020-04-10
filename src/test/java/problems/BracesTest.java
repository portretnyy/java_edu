package problems;


import org.testng.annotations.Test;

import static org.testng.Assert.*;
import static problems.Braces.isValidOneType;


public class BracesTest {

    private static final String REPEATED_BRACES = ")" + "()".repeat(500000);


    @Test
    public void testOneType() {
        assertTrue(isValidOneType("(())"));
        assertTrue(isValidOneType("()()"));
        assertTrue(isValidOneType("()()"));
        assertTrue(isValidOneType("()()()()()()"));
        assertTrue(isValidOneType("()".repeat(100)));
        assertTrue(isValidOneType("(((((())))))"));
        assertTrue(isValidOneType("(())"));
        assertTrue(isValidOneType(""));

        assertFalse(isValidOneType(null));
        assertFalse(isValidOneType("(()))"));
        assertFalse(isValidOneType(")))"));
        assertFalse(isValidOneType("("));
        assertFalse(isValidOneType("(((((("));
        assertFalse(isValidOneType("(".repeat(100) + ")".repeat(99)));
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testOneTypeShouldThrowException() {
        isValidOneType("(test)");
    }

    @Test
    public void testOneTypeSpeed() {
        final long start = System.nanoTime();

        isValidOneType(REPEATED_BRACES);

        final long end = System.nanoTime();
        System.out.println(end - start);
        assertTrue(end - start < 10_000_000);
    }
}