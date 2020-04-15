package enums;

public enum Color {
    RED(10, "Красный"),
    GREEN(11, "Зеленый"),
    BLUE(20, "Синий"),
    BLACK(12, "Черный"),
    WHITE(100, "Белый"),
    GREY("Серый");

    private int code;
    private String russianName;

    Color(int code, String russianName) {
        this.code = code;
        this.russianName = russianName;
    }

    Color(String russianName) {
        this.russianName = russianName;
        code = 0;
    }
    public int getCode() {
        return code;
    }

    public String getRussianName() {
        return russianName;
    }
}
