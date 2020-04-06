package misc;

public class OverridingDemo {
    public static void main(String[] args) {
        boolean f = false;
        String s = TestClass.getTestString();
        if (f) {
            s = TestClass.getTestString();
        }
    }

}
