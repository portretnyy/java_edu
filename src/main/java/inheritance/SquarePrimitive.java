package inheritance;

public class SquarePrimitive {
    private int length;

    public SquarePrimitive(int length) {
        this.length = length;
    }

    public int getArea() {
        return length* length;
    }

    public int getPerimeter() {
        return length * 4;
    }
}
