package polymorphism;

public interface Moveable {

    void move(int direction);

    public static String getDirectionString(int direction) {
        String dString;
        switch (direction) {
            case 0:
                dString = "NORTH";
                break;
            case 1:
                dString = "EAST";
                break;
            case 2:
                dString = "SOUTH";
                break;
            case 3:
                dString = "WEST";
                break;
            default:
                dString = "UNKNOWN";
        }
        return dString;
    }
}
