package inheritance;

public class PC extends Computer {
    private String ledColour;
    private int numOfFans;

    public PC(String brand, double cpuClock, int cores, double ramClock, int ramCapacity,
              int powerSupply, boolean refVideoCard, String ledColour, int numOfFans) {
        super(brand, cpuClock, cores, ramClock, ramCapacity, powerSupply, refVideoCard);
    }
}
