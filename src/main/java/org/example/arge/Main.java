package org.example.arge;

public class Main {
    public static void main(String[] args) {
        CarSkeleton gasCar = new GasPoweredCar("Gas Car", "A car powered by gasoline", 15.5, 4);
        testCar(gasCar);

        CarSkeleton electricCar = new ElectricCar("Electric Car", "A car powered by electricity", 200, 100);
        testCar(electricCar);

        CarSkeleton hybridCar = new HybridCar("Hybrid Car", "A car powered by both gasoline and electricity", 20, 50, 4);
        testCar(hybridCar);
    }

    public static void testCar(CarSkeleton car) {
        System.out.println("Testing " + car.getClass().getSimpleName());
        car.startEngine();
        car.drive();
        System.out.println();
    }
}


