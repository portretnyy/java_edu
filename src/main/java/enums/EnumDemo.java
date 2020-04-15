package enums;

public class EnumDemo {
    public static void main(String[] args) {
        Color color = Color.GREEN;
        printColor(color);
        printColorv2(color);
    }

    public static void printColor(Color color) {
        switch (color) {
            case RED:
                System.out.println("Красный");
                break;
            case GREEN:
                System.out.println("Зеленый");
                break;
            case BLUE:
                System.out.println("Синий");
                break;
            case BLACK:
                System.out.println("Черный");
                break;
            case WHITE:
                System.out.println("Белый");
        }
    }

    public static void printColorv2(Color color) {
        System.out.println(color.getRussianName());
    }

}
