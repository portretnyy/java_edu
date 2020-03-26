package collections;
import java.util.*;

public class CollectionsTesting {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<String> blocks = new ArrayList<>();
        blocks.add("Cobblestone");
        blocks.add("Snow");
        blocks.add("Oak log");
        blocks.add("Pine log");
        blocks.add("Obsidian");

        List<Integer> numbers = Arrays.asList(1, 5, 10, 5, 6, 11);
        List<Integer> numbers1 = Arrays.asList(4, 5, 6, 33, 1);


        showAllList(blocks);
        addNewBlock(blocks);
        System.out.println("------------");

        showAllList(blocks);
        System.out.println("------------");

        System.out.println(getBlockByIdx(blocks));

        System.out.println(blocks.size());
        removeBlockByIdx(blocks);
        showAllList(blocks);
        System.out.println(blocks.size());

        numbers.addAll(numbers1);
        showAllList(numbers);
    }

    public static void addNewBlock(ArrayList<String> list) {
        String s = scan.nextLine();
        list.add(s);
    }


    public static void addNewBlock(ArrayList<String> list, int i) {
        String s = scan.nextLine();
        list.add(i, s);
    }

    public static void showAllList(Collection<String> list) {
        for (String s : list) {
            System.out.println(s + ";\t");
        }
    }

    public static void showAllList(List<Integer> list) {
        for (int s : list) {
            System.out.println(s + ";\t");
        }
    }

    public static String getBlockByIdx(ArrayList<String> list) {
        return list.get(scan.nextInt());
    }

    public static void removeBlockByIdx(ArrayList<String> list) {
        list.remove(scan.nextInt());
    }
}
