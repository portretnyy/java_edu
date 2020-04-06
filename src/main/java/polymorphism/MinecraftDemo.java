package polymorphism;
import java.util.Random;

public class MinecraftDemo {

    static Random r = new Random();
    public static void monstersRoute () {
        Moveable.getDirectionString(r.nextInt(3));
    }

    public static void main(String[] args) {
        Player steve = new Player("Steve");
        Monsters creeper = new Monsters("hardcore");
        Monsters zombie = new Monsters("hardcore");
        Monsters enderman = new Monsters("hardcore");

        Moveable[] nightmare = {creeper, enderman, zombie};
        Digging[] player = {steve};


    }
}
