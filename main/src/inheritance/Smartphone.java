package inheritance;

public class Smartphone extends Computer {
    private int numOfCams;
    private boolean fold;

    public Smartphone(String brand, double cpuClock, int cores, double ramClock, int ramCapacity,
                      int powerSupply, int numOfCams, boolean fold) {
        super(brand, cpuClock, cores, ramClock, ramCapacity, powerSupply, true);
        this.numOfCams = numOfCams;
        this.fold = fold;
    }

    public int getNumOfCams() {
        return numOfCams;
    }

    public boolean isFold() {
        return fold;
    }

    public void showSpecs() {
        System.out.println("Brand: " + getBrand() + ";\n" +
                "CPU Clock: " + getCpuClock() + " GHz;\n" +
                "Number of cores: " + getCores() + ";\n" +
                "RAM Clock " + getRamClock() + " MHz;\n" +
                "RAM capacity: " + getRamCapacity() + " Gb;\n" +
                "Power supply: " + getPowerSupply() + "W;\n" +
                "Reference video card: " + isIntegratedVideoCard() + ";\n" +
                "Number of cameras: " + getNumOfCams() + ";\n" +
                "Fold mechanism: " + isFold() + ";\n");
    }
}
