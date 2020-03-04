package classes;

public class Planets {
    private String name;
    private int diameter;
    private float distanceFromSun;
    private float distanceFromEarth;
    private boolean haveRings;
    private int periodOfRev;

    public Planets(String name, int diameter, float distanceFromSun,
                   float distanceFromEarth, boolean haveRings, int periodOfRev) {

        this.name = name;
        this.diameter = diameter;
        this.distanceFromSun = distanceFromSun;
        this.distanceFromEarth = distanceFromEarth;
        this.haveRings = haveRings;
        this.periodOfRev = periodOfRev;
    }

    public String getName() {
        return name;
    }

    public float getDiameter() {
        return diameter;
    }

    public float getDistanceFromSun() {
        return distanceFromSun;
    }

    public float getDistanceFromEarth() {
        return distanceFromEarth;
    }

    public boolean isHaveRings() {
        return haveRings;
    }

    public int getPeriodOfRev() {
        return periodOfRev;
    }
}

//Work in progress