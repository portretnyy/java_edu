package security.p1;

public class Test2 {
    private void doSomething() {
        Test1 test1 = new Test1();
        test1.packageLocal();
        test1.protectedMethod();
    }
}
