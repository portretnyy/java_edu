package tests1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ObjectMethods {

    private int one;
    private int two;

    public ObjectMethods(int x, int y) {
        this.one = x;
        this.two = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjectMethods that = (ObjectMethods) o;
        return one == that.one &&
                two == that.two;
    }

    @Override
    public int hashCode() {
        return Objects.hash(one, two);
    }

    public static void main(String[] args) {
        Object object = new Object();
        System.out.println(object.getClass());
        System.out.println(object.toString());

        String string = new String("Hello!");
        System.out.println(string.getClass());
        System.out.println(string.hashCode());
        System.out.println(string.toString()); // Не целесообразен

        List<Integer> integerList = new ArrayList<>(1);
        integerList.add(5);
        System.out.println(integerList.toString());

        ObjectMethods example0 = new ObjectMethods(5, 5);
        ObjectMethods example1 = new ObjectMethods(5, 5);

        System.out.println(example0.equals(example1));
        System.out.println(example0.hashCode());
        System.out.println(example1.hashCode());
    }
}
