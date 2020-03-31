package problems.synonyms;

import util.Assert;

import java.util.*;

public class SynonymsTest {


    private final static String PROGRAM = "program";
    private final static String CODE = "code";
    private final static String CIPHER = "cipher";
    private static List<Runnable> tests = Arrays.asList(SynonymsTest::test1, SynonymsTest::test2);//можно добавить свои тесты!

    public static void main(String[] args) {
        tests.forEach(Runnable::run);
    }


    private static Synonyms getEmptySynonyms() {
        return new SynonymsImpl();
    }

    public static void test1() {
        Synonyms synonyms = getEmptySynonyms();
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

    public static void test2() {
        Synonyms synonyms = getEmptySynonyms();

        boolean added;
        added = synonyms.add(PROGRAM, CODE);
        Assert.assertTrue(added);
        added = synonyms.add(CODE, PROGRAM);
        Assert.assertFalse(added);
    }


}
