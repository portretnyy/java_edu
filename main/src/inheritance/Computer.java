package inheritance;

public class Computer {
    private String brand;
    private double cpuClock; // гигаГерц
    private int cores; // Число физических ядер
    private double ramClock; // мегаГерц
    private int ramCapacity; // Гигабайт
    private int powerSupply; // Мощность блока питания (Ватт)
    private boolean integratedVideoCard; // Наличие референсной видеокарты

    public Computer(String brand, double cpuClock, int cores, double ramClock,
              int ramCapacity, int powerSupply, boolean integratedVideoCard) {
        this.brand = brand;
        this.cpuClock = cpuClock;
        this.cores = cores;
        this.ramClock = ramClock;
        this.ramCapacity = ramCapacity;
        this.powerSupply = powerSupply;
        this.integratedVideoCard = integratedVideoCard;
    }

    public String getBrand() {
        return brand;
    }

    public double getCpuClock() {
        return cpuClock;
    }

    public int getCores() {
        return cores;
    }

    public double getRamClock() {
        return ramClock;
    }

    public int getRamCapacity() {
        return ramCapacity;
    }

    public int getPowerSupply() {
        return powerSupply;
    }

    public boolean isIntegratedVideoCard() {
        return integratedVideoCard;
    }
}
