package inheritance;

public class GamingConsole extends Computer {

    public GamingConsole(String brand, double cpuClock, int cores, Ram ram, int powerSupply, boolean integratedVideoCard) {
        super(brand, cpuClock, cores, ram, powerSupply, integratedVideoCard);
    }

    @Override
    public void showSpecs() {
        System.out.println("test");
    }

}
