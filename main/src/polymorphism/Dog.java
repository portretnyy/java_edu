package polymorphism;

public class Dog implements Moveable {
    private String dogName;

    public Dog(String dogName) {
        this.dogName = dogName;
    }

    @Override
    public void move(int direction) {
        System.out.println("dog barks");
        System.out.println("dog runs to the SOUTH");
    }
}
