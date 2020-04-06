package inheritance;

public class Smartphone extends Computer {
    private int numOfCams;
    private boolean fold;

    public Smartphone(String brand, double cpuClock, int cores, Ram ram, int powerSupply, boolean integratedVideoCard, int numOfCams, boolean fold) {
        super(brand, cpuClock, cores, ram, powerSupply, integratedVideoCard);
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
                "Power supply: " + getPowerSupply() + "W;\n" +
                "Reference video card: " + isIntegratedVideoCard() + ";\n" +
                "Number of cameras: " + getNumOfCams() + ";\n" +
                "Fold mechanism: " + isFold() + ";\n");
    }

}
