package tests;

import java.util.HashMap;
import java.util.Map;

public class Test3 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();

        map.forEach();

    }

    public static class Alpha {
        protected void doS() {

        }
    }

    public  static class Beta extends Alpha {
        @Override
        public void doS() {
            super.doS();
        }
    }
}
