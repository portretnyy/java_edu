package inheritance;
import java.util.Scanner;

public class ComputerDemo {
   static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Tablet apple = new Tablet("Apple", 1100, 4, 1800, 6,
                12, false, true, 10);
        PC myPC = new PC("No name", 4900, 8, 3200, 16,
                650, true, "RGB", 6);
        Smartphone samsung = new Smartphone("Samsung", 1000, 8, 1700, 8,
                15, false, 5, true);


    }
    public static int choose(){
        System.out.println("Choose a device:\n--------------");
        System.out.println("1 - Apple tablet;\t2 - Custom PC;\t 3 - Samsung smartphone;");
        int choice = in.nextInt();
        return choice;
    }
}
