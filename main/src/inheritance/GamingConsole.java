package inheritance;

public class GamingConsole extends Computer {

    public GamingConsole(String brand, double cpuClock, int cores, double ramClock, int ramCapacity, int powerSupply, boolean integratedVideoCard) {
        super(brand, cpuClock, cores, ramClock, ramCapacity, powerSupply, integratedVideoCard);
        System.out.println(10);
    }

    @Override
    public void showSpecs() {
        System.out.println("test");
    }

}
