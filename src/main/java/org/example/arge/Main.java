package org.example.arge;

import org.example.company.Car;

public class Main {
    public static void main(String[] args) {
        CarSkeleton electricCar = new ElectricCar("tesla","tesla desc",7000,2000);
        CarSkeleton hybridCar = new HybridCar("toyota","toyota desc",500,3000,4);
        CarSkeleton gasPowderCar = new GasPoweredCar("mercedes","mercedes cls",6,1000);
        startEngine(electricCar);
        startEngine(hybridCar);
        startEngine(gasPowderCar);


    }
public static void startEngine(CarSkeleton carSkeleton){
    System.out.println(carSkeleton.startEngine());
}
}
