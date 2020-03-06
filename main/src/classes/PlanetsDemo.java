package classes;
import java.util.Scanner;

//Объявляем и инициализируем объекты
public class PlanetsDemo {
    static Planet earth = new Planet("Earth", "Terrestrial", 1d, 7913,
            91.3, 0, false, 365, 1);

    static Planet venus = new Planet("Venus", "Terrestrial", 0.815d, 7600,
            66.7, 25, false, 225, 0);

    static Planet saturn = new Planet("Saturn", "Gas giant", 95.2d, 71500,
            837, 744, true, 10767, 82);

    static Planet mercury = new Planet("Mercury", "Terrestrial", 0.055d, 2900,
            28.6, 50, false, 88, 0);

    static Planet mars = new Planet("Mars", "Terrestrial", 0.1d, 4200,
            128.3, 35, false, 693, 2);

    static Planet jupiter = new Planet("Jupiter", "Gas giant", 317.8d, 86800,
            459.9, 367, false, 4343, 79);

    static Planet uranus = new Planet("Uranus", "Ice giant", 14.54d, 29400,
            1699, 1606, false, 30660, 27);

    static Planet neptune = new Planet("Neptune", "Ice giant", 17.1d, 28000,
            2770, 2677, false, 60225, 14);

    static Scanner input = new Scanner(System.in);

    //Запрос выбора
    public static int choosePlanet() {
        System.out.println("Greetings!\nPlease, choose a planet you want to discover!\n" +
                "Current measurement system:\n" + "Distance: millions of miles.\t" +
                "Mass: value 1 is the Earth's mass.\t" + "Diameter: miles.\t" +
                "Period of revolution: days.\n" +
                "1. Earth\t2. Venus\t3. Saturn\n4. Mercury\t5. Mars\t 6. Jupiter\n" +
                "7. Uranus\t8. Neptune");
        int choice = input.nextInt();
        return choice;
    }

    //Ниже методы вывода информации о планетах на основе введенного значения
    public static void showEarth() {
        System.out.println("Name: " + earth.getName() + "\n" + "Type: " + earth.getType() +
                "\n" + "Mass: " + earth.getMass() + "\n" + "Diameter: " +
                earth.getDiameter() + "\n" + "Minimal distance from the Sun: " +
                earth.getDistanceFromSun() + "\n" + "Distance from the Earth: " +
                earth.getDistanceFromEarth() + "\n" + "Orbital rings: " +
                earth.isHaveRings() + "\n" + "Period of revolution: " +
                earth.getPeriodOfRev() + "\n" + "Number of Satellites: " +
                earth.getNumOfSat());
        System.out.println("------------------------\nChange some dynamic values: ");
        System.out.println("Distance from the Sun: ");
            earth.setDistanceFromSun(input.nextInt());
        System.out.println("Get the updated data: \n" + "Distance from the Sun: " +
            earth.getDistanceFromSun());
    }

    public static void showVenus() {
        System.out.println("Name: " + venus.getName() + "\n" + "Type: " + venus.getType() +
                "\n" + "Mass: " + venus.getMass() + "\n" + "Diameter: " +
                venus.getDiameter() + "\n" + "Minimal distance from the Sun: " +
                venus.getDistanceFromSun() + "\n" + "Distance from the Earth: " +
                venus.getDistanceFromEarth() + "\n" + "Orbital rings: " +
                venus.isHaveRings() + "\n" + "Period of revolution: " +
                venus.getPeriodOfRev() + "\n" + "Number of Satellites: " +
                venus.getNumOfSat());
        System.out.println("------------------------\nChange some dynamic values: ");
        System.out.println("Distance from the Sun: ");
        venus.setDistanceFromSun(input.nextInt());
        System.out.println("Distance from the Earth: ");
        venus.setDistanceFromEarth(input.nextInt());
        System.out.println("Get the updated data: \n" + "Distance from the Sun: " +
                venus.getDistanceFromSun() + "\n" + "Distance from the Earth: " +
                venus.getDistanceFromEarth());
    }

    public static void showSaturn() {
        System.out.println("Name: " + saturn.getName() + "\n" + "Type: " + saturn.getType() +
                "\n" + "Mass: " + saturn.getMass() + "\n" + "Diameter: " +
                saturn.getDiameter() + "\n" + "Minimal distance from the Sun: " +
                saturn.getDistanceFromSun() + "\n" + "Distance from the Earth: " +
                saturn.getDistanceFromEarth() + "\n" + "Orbital rings: " +
                saturn.isHaveRings() + "\n" + "Period of revolution: " +
                saturn.getPeriodOfRev() + "\n" + "Number of Satellites: " +
                saturn.getNumOfSat());
        System.out.println("------------------------\nChange some dynamic values: ");
        System.out.println("Distance from the Sun: ");
        saturn.setDistanceFromSun(input.nextInt());
        System.out.println("Distance from the Earth: ");
        saturn.setDistanceFromEarth(input.nextInt());
        System.out.println("Get the updated data: \n" + "Distance from the Sun: " +
                saturn.getDistanceFromSun() + "\n" + "Distance from the Earth: " +
                saturn.getDistanceFromEarth());
    }

    public static void showMercury() {
        System.out.println("Name: " + mercury.getName() + "\n" + "Type: " + mercury.getType() +
                "\n" + "Mass: " + mercury.getMass() + "\n" + "Diameter: " +
                mercury.getDiameter() + "\n" + "Minimal distance from the Sun: " +
                mercury.getDistanceFromSun() + "\n" + "Distance from the Earth: " +
                mercury.getDistanceFromEarth() + "\n" + "Orbital rings: " +
                mercury.isHaveRings() + "\n" + "Period of revolution: " +
                mercury.getPeriodOfRev() + "\n" + "Number of Satellites: " +
                mercury.getNumOfSat());
        System.out.println("------------------------\nChange some dynamic values: ");
        System.out.println("Distance from the Sun: ");
        mercury.setDistanceFromSun(input.nextInt());
        System.out.println("Distance from the Earth: ");
        mercury.setDistanceFromEarth(input.nextInt());
        System.out.println("Get the updated data: \n" + "Distance from the Sun: " +
                mercury.getDistanceFromSun() + "\n" + "Distance from the Earth: " +
                mercury.getDistanceFromEarth());
    }

    public static void showMars() {
        System.out.println("Name: " + mars.getName() + "\n" + "Type: " + mars.getType() +
                "\n" + "Mass: " + mars.getMass() + "\n" + "Diameter: " +
                mars.getDiameter() + "\n" + "Minimal distance from the Sun: " +
                mars.getDistanceFromSun() + "\n" + "Distance from the Earth: " +
                mars.getDistanceFromEarth() + "\n" + "Orbital rings: " +
                mars.isHaveRings() + "\n" + "Period of revolution: " +
                mars.getPeriodOfRev() + "\n" + "Number of Satellites: " +
                mars.getNumOfSat());
        System.out.println("------------------------\nChange some dynamic values: ");
        System.out.println("Distance from the Sun: ");
        mars.setDistanceFromSun(input.nextInt());
        System.out.println("Distance from the Earth: ");
        mars.setDistanceFromEarth(input.nextInt());
        System.out.println("Get the updated data: \n" + "Distance from the Sun: " +
                mars.getDistanceFromSun() + "\n" + "Distance from the Earth: " +
                mars.getDistanceFromEarth());
    }

    public static void showJupiter() {
        System.out.println("Name: " + jupiter.getName() + "\n" + "Type: " + jupiter.getType() +
                "\n" + "Mass: " + jupiter.getMass() + "\n" + "Diameter: " +
                jupiter.getDiameter() + "\n" + "Minimal distance from the Sun: " +
                jupiter.getDistanceFromSun() + "\n" + "Distance from the Earth: " +
                jupiter.getDistanceFromEarth() + "\n" + "Orbital rings: " +
                jupiter.isHaveRings() + "\n" + "Period of revolution: " +
                jupiter.getPeriodOfRev() + "\n" + "Number of Satellites: " +
                jupiter.getNumOfSat());
        System.out.println("------------------------\nChange some dynamic values: ");
        System.out.println("Distance from the Sun: ");
        jupiter.setDistanceFromSun(input.nextInt());
        System.out.println("Distance from the Earth: ");
        jupiter.setDistanceFromEarth(input.nextInt());
        System.out.println("Get the updated data: \n" + "Distance from the Sun: " +
                jupiter.getDistanceFromSun() + "\n" + "Distance from the Earth: " +
                jupiter.getDistanceFromEarth());
    }

    public static void showUranus() {
        System.out.println("Name: " + uranus.getName() + "\n" + "Type: " + uranus.getType() +
                "\n" + "Mass: " + uranus.getMass() + "\n" + "Diameter: " +
                uranus.getDiameter() + "\n" + "Minimal distance from the Sun: " +
                uranus.getDistanceFromSun() + "\n" + "Distance from the Earth: " +
                uranus.getDistanceFromEarth() + "\n" + "Orbital rings: " +
                uranus.isHaveRings() + "\n" + "Period of revolution: " +
                uranus.getPeriodOfRev() + "\n" + "Number of Satellites: " +
                uranus.getNumOfSat());
        System.out.println("------------------------\nChange some dynamic values: ");
        System.out.println("Distance from the Sun: ");
        uranus.setDistanceFromSun(input.nextInt());
        System.out.println("Distance from the Earth: ");
        uranus.setDistanceFromEarth(input.nextInt());
        System.out.println("Get the updated data: \n" + "Distance from the Sun: " +
                uranus.getDistanceFromSun() + "\n" + "Distance from the Earth: " +
                uranus.getDistanceFromEarth());
    }

    public static void showNeptune() {
        System.out.println("Name: " + neptune.getName() + "\n" + "Type: " + neptune.getType() +
                "\n" + "Mass: " + neptune.getMass() + "\n" + "Diameter: " +
                neptune.getDiameter() + "\n" + "Minimal distance from the Sun: " +
                neptune.getDistanceFromSun() + "\n" + "Distance from the Earth: " +
                neptune.getDistanceFromEarth() + "\n" + "Orbital rings: " +
                neptune.isHaveRings() + "\n" + "Period of revolution: " +
                neptune.getPeriodOfRev() + "\n" + "Number of Satellites: " +
                neptune.getNumOfSat());
        System.out.println("------------------------\nChange some dynamic values: ");
        System.out.println("Distance from the Sun: ");
            neptune.setDistanceFromSun(input.nextInt());
        System.out.println("Distance from the Earth: ");
            neptune.setDistanceFromEarth(input.nextInt());
        System.out.println("Get the updated data: \n" + "Distance from the Sun: " +
                neptune.getDistanceFromSun() + "\n" + "Distance from the Earth: " +
                neptune.getDistanceFromEarth());
    }

    //Механизм ветвления на основе введенных данных
    public static void result() {
        switch (choosePlanet()) {
            case 1:
                showEarth();
                break;
            case 2:
                showVenus();
                break;
            case 3:
                showSaturn();
                break;
            case 4:
                showMercury();
                break;
            case 5:
                showMars();
                break;
            case 6:
                showJupiter();
                break;
            case 7:
                showUranus();
                break;
            case 8:
                showNeptune();
                break;
            default: System.out.println("You did not choose a planet.");
        }
    }

    //Метод, расчитывающий возраст, согласно разной длительности года на планетах
    public static void altAge() {
        System.out.println("Now you can find out your age according to" +
                "another planets' period of revolution.\nPlease enter your age:\n");
        double age = input.nextInt();
        System.out.println("Choose a planet for an experiment:\n" +
                "1. Earth\t2. Venus\t3. Saturn\n4. Mercury\t5. Mars\t6. Jupiter\n" +
                "7. Uranus\t8. Neptune");
        int planet = input.nextInt();
        switch (planet){
            case 1:
                age = (age * 365) / earth.getPeriodOfRev();
                System.out.println("Your age on Earth is: " + age);
                break;
            case 2:
                age = (age * 365) / venus.getPeriodOfRev();
                System.out.println("Your age on Venus is: " + age);
                break;
            case 3:
                age = (age * 365) / saturn.getPeriodOfRev();
                System.out.println("Your age on Saturn is: " + age);
                break;
            case 4:
                age = (age * 365) / mercury.getPeriodOfRev();
                System.out.println("Your age on Mercury is: " + age);
                break;
            case 5:
                age = (age * 365) / mars.getPeriodOfRev();
                System.out.println("Your age on Mars is: " + age);
                break;
            case 6:
                age = (age * 365) / jupiter.getPeriodOfRev();
                System.out.println("Your age on Jupiter is: " + age);
                break;
            case 7:
                age = (age * 365) / uranus.getPeriodOfRev();
                System.out.println("Your age on Uranus is: " + age);
                break;
            case 8:
                age = (age * 365) / neptune.getPeriodOfRev();
                System.out.println("Your age on Neptune is: " + age);
                break;
            default: System.out.println("You did not choose the parameters.");
        }
    }

    public static void compareMass() {
        System.out.println("Let's compare the mass of two different planets!\n" +
                "Please, choose the first planet: ");
        System.out.println("1. Earth\t2. Venus\t3. Saturn\n4. Mercury\t5. Mars\t 6. Jupiter\n" +
                "7. Uranus\t8. Neptune");
        int first = input.nextInt();
        System.out.println("Please, choose the second planet: ");
        int second = input.nextInt();
        double one = 0;
        double two = 0;
        switch (first) {
            case 1:
                one = earth.getMass();
                break;
            case 2:
                one = venus.getMass();
                break;
            case 3:
                one = saturn.getMass();
                break;
            case 4:
                one = mercury.getMass();
                break;
            case 5:
                one = mars.getMass();
                break;
            case 6:
                one = jupiter.getMass();
                break;
            case 7:
                one = uranus.getMass();
                break;
            case 8:
                one = neptune.getMass();
                break;
        }
        switch (second) {
            case 1:
                two = earth.getMass();
                break;
            case 2:
                two = venus.getMass();
                break;
            case 3:
                two = saturn.getMass();
                break;
            case 4:
                two = mercury.getMass();
                break;
            case 5:
                two = mars.getMass();
                break;
            case 6:
                two = jupiter.getMass();
                break;
            case 7:
                two = uranus.getMass();
                break;
            case 8:
                two = neptune.getMass();
                break;
        }
        System.out.println("The mass difference between these planets is: " + Math.abs(one - two));
    }

    //Main метод
    public static void main(String[] args) {
        result();
        altAge();
        compareMass();
    }
}

//Work in progress