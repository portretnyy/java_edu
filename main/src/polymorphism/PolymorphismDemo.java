package polymorphism;

public class PolymorphismDemo {
    public static void main(String[] args) {
        Robot t1000 = new Robot("T1000");
        Dog k9 = new Dog("K9");


        Moveable[] army = {t1000, k9, new Robot("robocop"), new Dog("Bethoven"), new Robot("nyash-myash"), new Human()};
        moveArmy(army, 1);
    }


    public static void moveArmy(Moveable[] army, int direction){
        int i = 1;
        for (Moveable moveable : army) {
            if (i%2 == 0) {
                moveable.move(0);
            }
            else {
                moveable.move(direction);
            }
            i++;
        }
    }

}
