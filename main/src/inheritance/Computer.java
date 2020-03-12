package inheritance;

public class Computer {
    private String brand;
    private double cpuClock; // мегаГерц
    private int cores; // Число физических ядер
    private double ramClock; // мегаГерц
    private int ramCapacity; // Гигабайт
    private int powerSupply; // Мощность блока питания (Ватт)
    private boolean refVideoCard; // Наличие референсной видеокарты

    public Computer(String brand, double cpuClock, int cores, double ramClock,
              int ramCapacity, int powerSupply, boolean refVideoCard) {
        this.brand = brand;
        this.cpuClock = cpuClock;
        this.cores = cores;
        this.ramClock = ramClock;
        this.ramCapacity = ramCapacity;
        this.powerSupply = powerSupply;
        this.refVideoCard = refVideoCard;
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

    public boolean isRefVideoCard() {
        return refVideoCard;
    }
}
