package polymorphism;

public class Human implements Moveable {
    @Override
    public void move(int direction) {
        System.out.println("human moves");
    }
}
