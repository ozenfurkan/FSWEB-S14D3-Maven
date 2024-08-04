package org.example.arge;

public class GasPoweredCar extends CarSkeleton {
    private double avgKmPerLiter;
    private int cylinders;

    public double getAvgKmPerLiter() {
        return avgKmPerLiter;
    }

    public void setAvgKmPerLiter(double avgKmPerLiter) {
        this.avgKmPerLiter = avgKmPerLiter;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public GasPoweredCar(String name, String description, double avgKmPerLiter, int cylinders) {
        super(name, description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }

    @Override
    protected void runEngine() {
        System.out.println("The Gas Powered engine is running");
    }

    @Override
    public void drive() {
        super.drive();
    }

    @Override
    public void startEngine() {
        System.out.println("The Gas Powered car's engine is starting");
    }


    public double getAverageKmPerLiter() {
        return avgKmPerLiter;
    }
}
