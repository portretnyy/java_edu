package classes;
import java.util.Scanner;

public class Planets {

    Scanner input = new Scanner(System.in);

    private String name; //Имя
    private String type; //Тип
    private double mass; //Масса
    private int diameter; //Диаметр
    private double distanceFromSun; //Минимальная дистанция от Солнца
    private double distanceFromEarth; //Минимальная дистанция от Земли
    private boolean haveRings; //Имеет ли кольца
    private int periodOfRev; //Длина условного года
    private int numOfSat; //Число спутников

    //Начало конструктора
    public Planets(String name, String type, double mass, int diameter, double distanceFromSun,
                   double distanceFromEarth, boolean haveRings, int periodOfRev,
                   int numOfSat) {

        this.name = name;
        this.type = type;
        this.mass = mass;
        this.diameter = diameter;
        this.distanceFromSun = distanceFromSun;
        this.distanceFromEarth = distanceFromEarth;
        this.haveRings = haveRings;
        this.periodOfRev = periodOfRev;
        this.numOfSat = numOfSat;
    }
    //Конец конструктора

    //Методы, доступные к вызову извне
    public String getName() {
        return name;
    }

    public String getType() { return type; }

    public double getMass() { return mass; }

    public float getDiameter() {
        return diameter;
    }

    public double getDistanceFromSun() {
        return distanceFromSun;
    }

    public double getDistanceFromEarth() {
        return distanceFromEarth;
    }

    public boolean isHaveRings() {
        return haveRings;
    }

    public int getPeriodOfRev() {
        return periodOfRev;
    }

    public int getNumOfSat() { return numOfSat; }

    public void setDistanceFromSun(double distanceFromSun) {
        if (distanceFromSun < 28) {
            this.distanceFromSun = 28; //Минимальное расстояние, на которое способен
        } else {                       //приблизиться к Солнцу Меркурий
            this.distanceFromSun = distanceFromSun;
        }
    }

    public void setDistanceFromEarth(double distanceFromEarth) {
        if (distanceFromEarth < 25) {
            this.distanceFromEarth = 25;
        } else {
            this.distanceFromEarth = distanceFromEarth;
        }
    }
}

//Work in progress