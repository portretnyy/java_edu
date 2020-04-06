package collections;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TreeWrongTest {

    @BeforeMethod
    public void setUp() {
    }

    @Test
    public void testTreeCreation() {
        TreeWrong treeWrong = new TreeWrong(10);
        treeWrong.addToRight(15);
        treeWrong.addToLeft(16);
        treeWrong.addToLeftRight(13);

        System.out.println();

    }
}