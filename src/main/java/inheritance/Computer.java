package inheritance;

public abstract class Computer {
    private String brand;
    private double cpuClock; // гигаГерц
    private int cores; // Число физических ядер
    private Ram ram;
    private int powerSupply; // Мощность блока питания (Ватт)
    private boolean integratedVideoCard; // Наличие референсной видеокарты

    public Computer(String brand, double cpuClock, int cores, Ram ram, int powerSupply, boolean integratedVideoCard) {
        this.brand = brand;
        this.cpuClock = cpuClock;
        this.cores = cores;
        this.ram = ram;
        this.powerSupply = powerSupply;
        this.integratedVideoCard = integratedVideoCard;
    }


    public Computer() {
    }

    public String getBrand() {
        return brand;
    }

    public double getCpuClock() {
        return cpuClock;
    }

    public int getCores() { return cores; }

    public Ram getRam() { return ram; }

    public final int getPowerSupply() {
        return powerSupply;
    }

    public boolean isIntegratedVideoCard() {
        return integratedVideoCard;
    }

    public abstract void showSpecs();

}
