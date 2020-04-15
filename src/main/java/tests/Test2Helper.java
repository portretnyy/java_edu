package tests;

public class Test2Helper {
    public static String test = initTest();
    static {
        System.out.println("3");
    }

    {
        System.out.println("4");
    }

    public Test2Helper() {
        System.out.println("2");
    }


    public static String initTest() {
        System.out.println("initTest");
        return "test";
    }
    public static void main(String[] args) {
        System.out.println("1");
        new Test2Helper();
    }
}
