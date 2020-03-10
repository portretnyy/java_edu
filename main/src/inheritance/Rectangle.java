package inheritance;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    protected int getLength() {
        return length;
    }

    protected int getWidth() {
        return width;
    }

    public int getArea() {
        return length * width;
    }

    public int getPerimeter() {
        return 2 *(length + width);
    }
}
