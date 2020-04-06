package polymorphism;


public class PolymorphismDemo {
    public static void main(String[] args) {
        Robot t1000 = new Robot("T1000");
        Dog k9 = new Dog("K9");


        Robot robocop = new Robot("robocop");
        Robot nyashka = new Robot("nyash-myash");
        Moveable[] army = {t1000, k9, robocop, new Dog("Bethoven"), nyashka, new Human()};

        Exterminator[] battleArmy = {t1000, robocop, nyashka};
        moveArmy(army, 1);
        attack(battleArmy, "Cyclop");
        Robot robot = new Robot("test");
        new Robot("test1");

        Moveable moveableRobot = new Robot("test_not");

        moveableRobot = new Human();


        Moveable m = new Moveable() {
            @Override
            public void move(int direction) {
                System.out.println("move");
            }
        };

        Robot robot1 = new Robot("test") {
            @Override
            public void move(int direction) {
                super.move(direction);
            }
        };

        m.move(1);

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

    public static void attack(Exterminator[] army, String enemy) {
        for (Exterminator exterminator : army) {
            exterminator.exterminate(enemy);
        }
    }

}
