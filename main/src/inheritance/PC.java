package inheritance;

public final class PC extends Computer {
    private String ledColour;
    private int numOfFans;

    public PC(String brand, double cpuClock, int cores, Ram ram, int powerSupply, boolean integratedVideoCard, String ledColour, int numOfFans) {
        super(brand, cpuClock, cores, ram, powerSupply, integratedVideoCard);
        this.ledColour = ledColour;
        this.numOfFans = numOfFans;
    }

    public String getLedColour() {
        return ledColour;
    }

    public int getNumOfFans() {
        return numOfFans;
    }

    public void showSpecs() {
        System.out.println("Brand: " + getBrand() + ";\n" +
                "CPU Clock: " + getCpuClock() + " GHz;\n" +
                "Number of cores: " + getCores() + ";\n" +
                "RAM Clock " + getRamClock() + " MHz;\n" +
                "RAM capacity: " + getRamCapacity() + " Gb;\n" +
                "Power supply: " + getPowerSupply() + "W;\n" +
                "Reference video card: " + isIntegratedVideoCard() + ";\n" +
                "LED Colour: " + getLedColour() + ";\n" +
                "Number of fans: " + getNumOfFans() + ";\n");
    }

}
