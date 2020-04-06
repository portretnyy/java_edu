package polymorphism;

public class Player implements Moveable, Digging, Sneaking {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public void move(int direction) {
        System.out.println(name + " is going to " + Moveable.getDirectionString(direction) + ".");
    }

    @Override
    public void dig() {
        System.out.println(name + " is searching for ore.");
    }

    @Override
    public void sneak() {
        System.out.println(name + " is moving silently.");
    }
}
