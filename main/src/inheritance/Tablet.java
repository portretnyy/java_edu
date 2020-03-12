package inheritance;

public class Tablet extends Computer {
    private boolean touchScreen;
    private int screenDiag;

    public Tablet(String brand, double cpuClock, int cores, double ramClock, int ramCapacity,
                  int powerSupply, boolean refVideoCard, boolean touchScreen, int screenDiag) {
        super(brand, cpuClock, cores, ramClock, ramCapacity, powerSupply, refVideoCard);
    }
}
