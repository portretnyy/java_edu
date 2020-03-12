package inheritance;

public class Smartphone extends Computer {
    private int numOfCams;
    private boolean fold;

    public Smartphone(String brand, double cpuClock, int cores, double ramClock, int ramCapacity,
                      int powerSupply, boolean refVideoCard, int numOfCams, boolean fold) {
        super(brand, cpuClock, cores, ramClock, ramCapacity, powerSupply, refVideoCard);
    }
}
