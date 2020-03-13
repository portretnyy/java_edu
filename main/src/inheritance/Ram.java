package inheritance;

/**
 * random access memory
 */
public final class Ram {
    private double ramClock; // мегаГерц
    private int ramCapacity; // Гигабайт

    public Ram(double ramClock, int ramCapacity) {
        this.ramClock = ramClock;
        this.ramCapacity = ramCapacity;
    }

    public double getRamClock() {
        return ramClock;
    }

    public int getRamCapacity() {
        return ramCapacity;
    }
}
