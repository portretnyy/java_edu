package polymorphism;

public class Monsters implements Sneaking, Moveable, Explode {
    private String difficulty;

    public Monsters(String difficulty) {
        this.difficulty = difficulty;
    }

    @Override
    public void kaBoom(int creeperAmount) {
        if (creeperAmount >= 3) {
            System.out.println("Shhhhhhh... BANG!");
        } else {
            sneak();
        }
    }

    @Override
    public void move(int direction) {

    }

    @Override
    public void sneak() {
        System.out.println("Player: I guess I hear something...");
    }

    public String getDifficulty() {
        return difficulty;
    }
}
