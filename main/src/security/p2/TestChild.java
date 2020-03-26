package security.p2;

import security.p1.Test1;

public class TestChild extends Test1 {

    private void doSomething() {
        super.protectedMethod();
    }

}
