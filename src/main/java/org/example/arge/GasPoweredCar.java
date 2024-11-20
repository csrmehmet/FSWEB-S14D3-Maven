package org.example.arge;

public class GasPoweredCar extends CarSkeleton{
    private double averageKmPerLitre;
    private int cylinders;

    @Override
    public String drive() {
        return "run from GasPowered car";
    }

    @Override
    public String startEngine() {
        runEngine(this);
        return getName()+"car starting";
    }

    public GasPoweredCar(String name, String description, int cylinders, double avgKmPerLitre) {
        super(name, description);
        this.cylinders = cylinders;
        this.averageKmPerLitre = avgKmPerLitre;
    }

    public double getAverageKmPerLiter() {
        return averageKmPerLitre;
    }

    public int getCylinders() {
        return cylinders;
    }
}
