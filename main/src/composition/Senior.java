package composition;

public class Senior {
    private String name;
    private int salary;
    private int facePalmsPerDay;

    public Senior(String name, int salary, int facePalmsPerDay) {
        this.name = name;
        this.salary = salary;
        this.facePalmsPerDay = facePalmsPerDay;
    }

    public static void cringe() {
        System.out.println("Oh my lord...");
    }
}
