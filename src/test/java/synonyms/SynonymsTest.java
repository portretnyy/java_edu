package synonyms;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SynonymsTest {


    private final static String PROGRAM = "program";
    private final static String CODE = "code";
    private final static String CIPHER = "cipher";
    private Synonyms synonyms;

    @BeforeMethod
    public void setUp() {
//        synonyms = new SynonymsImpl();
        synonyms = new SynonymsV2Impl();
    }

    private static Synonyms getEmptySynonyms() {
        return new SynonymsImpl();
    }


    @Test
    public void test1() {
        Assert.assertNotNull(synonyms);



        synonyms.add(PROGRAM, CODE);
        synonyms.add(CODE, CIPHER);

        Assert.assertEquals(synonyms.count(PROGRAM), 1);
        Assert.assertEquals(synonyms.count(CODE), 2);
        Assert.assertEquals(synonyms.count(CIPHER), 1);
        Assert.assertTrue(synonyms.check(CODE, PROGRAM));
        Assert.assertFalse(synonyms.check(PROGRAM, CIPHER));
        Assert.assertEquals(synonyms.size(), 3);
    }

    @Test
    public static void test2() {
        Synonyms synonyms = getEmptySynonyms();

        boolean added;
        added = synonyms.add(PROGRAM, CODE);
        Assert.assertTrue(added);
        added = synonyms.add(CODE, PROGRAM);
        Assert.assertFalse(added);
    }
}
