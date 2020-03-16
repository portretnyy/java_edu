package inheritance;
import java.util.Random;
import java.util.Scanner;

public class ComputerDemo {
   static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Tablet apple = null;//new Tablet("Apple", 1100, 4, 1800, 6,
//                12, true, 10);

        PC myPC = new PC("No name", 4900, 8, new Ram(3200, 16),
                650, true, "RGB", 6);
        Smartphone samsung = null;//new Smartphone("Samsung", 1000, 8, 1700, 8,
//                15, 5, true);

        System.out.println("apple.getPowerSupply() = " + apple.getPowerSupply());
        System.out.println("samsung.getPowerSupply() = " + samsung.getPowerSupply());
        Computer someComputer = samsung;
        System.out.println("someComputer.getPowerSupply() = " + someComputer.getPowerSupply());
        switch (choose()) {
            case 1:
                apple.showSpecs();
                break;
            case 2:
                myPC.showSpecs();
                break;
            case 3:
                samsung.showSpecs();
                break;
        }
    }

    public static int choose(){
        System.out.println("Choose a device:\n--------------");
        System.out.println("1 - Apple tablet;\t2 - Custom PC;\t 3 - Samsung smartphone;");
        int choice = in.nextInt();
        System.out.println("--------------");
        return choice;
    }
}
