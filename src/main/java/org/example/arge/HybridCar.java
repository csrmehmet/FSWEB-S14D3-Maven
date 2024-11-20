package org.example.arge;

public class HybridCar extends CarSkeleton {
    private double avgKmPerLiter;
    private  int batterySize;
    private  int cylinders;

    public HybridCar(String name, String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(name, description);
        this.avgKmPerLiter = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLiter() {
        return avgKmPerLiter;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getBatterySize() {
        return batterySize;
    }

    @Override
    public String drive() {
        return "run from Hybrid car";
    }

    @Override
    public String startEngine() {
        runEngine(this);
        return getName()+"car starting";
    }
}
