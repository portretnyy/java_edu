package inheritance;

public class Tablet extends Computer {
    private boolean touchScreen;
    private int screenDiag;

    public Tablet(String brand, double cpuClock, int cores, Ram ram, int powerSupply, boolean integratedVideoCard, boolean touchScreen, int screenDiag) {
        super(brand, cpuClock, cores, ram, powerSupply, integratedVideoCard);
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
                "Power supply: " + getPowerSupply() + "W;\n" +
                "Reference video card: " + isIntegratedVideoCard() + ";\n" +
                "Touch screen: " + isTouchScreen() + ";\n" +
                "Screen diagonal: " + getScreenDiag() + " inches;\n");
    }

}
