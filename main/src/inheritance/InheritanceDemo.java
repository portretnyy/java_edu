package inheritance;

public class InheritanceDemo {
    public static void main(String[] args) {
        boolean t = false;
        if (t) {
            Rectangle rectangle1 = new Rectangle(12,10);
            Rectangle rectangle2 = new Rectangle(4,5);
            SquarePrimitive squarePrimitive = new SquarePrimitive(6);
            Square square = new Square(60);

            Rectangle[] rectanglesWrong = {rectangle1, rectangle2};
            SquarePrimitive[] squarePrimitives = {squarePrimitive};

            Rectangle[] rectangles = {rectangle1, rectangle2, square};

            Rectangle thisIsSquare = new Square(10);

            System.out.println("rectangle1.getArea() =" + rectangle1.getArea() + " rectangle1.getPerimeter() = " +  rectangle1.getPerimeter());

            System.out.println("getWholeArea(rectangles) = " + getWholeArea(rectangles));
        }
    }

    public static int getWholeArea(Rectangle[] rectangles, SquarePrimitive[] squarePrimitives) {
        int area = 0;
        for (int i = 0; i < rectangles.length; i++) {
            area += rectangles[i].getArea();
        }
        for (int i = 0; i < squarePrimitives.length; i++) {
            area += squarePrimitives[i].getArea();
        }

        return area;
    }

    public static int getWholeArea(Rectangle[] rectangles) {
        int area = 0;
        for (Rectangle rectangle : rectangles) {
            area += rectangle.getArea();
        }
        return area;
    }
}
