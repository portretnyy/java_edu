package inheritance;

public class Tablet extends Computer {
    private boolean touchScreen;
    private int screenDiag;

    public Tablet(String brand, double cpuClock, int cores, double ramClock, int ramCapacity,
                  int powerSupply, boolean touchScreen, int screenDiag) {
        super(brand, cpuClock, cores, ramClock, ramCapacity, powerSupply, true);
        this.touchScreen = touchScreen;
        this.screenDiag = screenDiag;
    }

    public boolean isTouchScreen() {
        return touchScreen;
    }

    public int getScreenDiag() {
        return screenDiag;
    }

    @Override
    public void showSpecs() {
        System.out.println("Brand: " + getBrand() + ";\n" +
                "CPU Clock: " + getCpuClock() + " GHz;\n" +
                "Number of cores: " + getCores() + ";\n" +
                "RAM Clock " + getRamClock() + " MHz;\n" +
                "RAM capacity: " + getRamCapacity() + " Gb;\n" +
                "Power supply: " + getPowerSupply() + "W;\n" +
                "Reference video card: " + isIntegratedVideoCard() + ";\n" +
                "Touch screen: " + isTouchScreen() + ";\n" +
                "Screen diagonal: " + getScreenDiag() + " inches;\n");
    }

}
