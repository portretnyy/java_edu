package polymorphism;

public class Robot implements Exterminator, Moveable {
    private String robotModel;

    public Robot(String robotModel) {
        this.robotModel = robotModel;
    }

    @Override
    public void move(int direction) {
        System.out.println(String.format("robot moves towards %s", Moveable.getDirectionString(direction)));//"robot move towards " + dString
    }

    @Override
    public void exterminate(String who) {

    }
}
