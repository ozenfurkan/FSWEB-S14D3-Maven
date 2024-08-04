package org.example.arge;

public class HybridCar extends CarSkeleton {
    private double avgKmLiter;
    private int BatterySize;
    private int cylinders;

    public double getAvgKmLiter() {
        return avgKmLiter;
    }

    public void setAvgKmLiter(double avgKmLiter) {
        this.avgKmLiter = avgKmLiter;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public int getBatterySize() {
        return BatterySize;
    }

    public void setBatterySize(int batterySize) {
        BatterySize = batterySize;
    }

    public HybridCar(String name, String description, double avgKmLiter, int batterySize, int cylinders) {
        super(name, description);
        this.avgKmLiter = avgKmLiter;
        BatterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    protected void runEngine() {
        System.out.println("The Hybrid engine is running");
    }

    @Override
    public void drive() {
        super.drive();
    }

    @Override
    public void startEngine() {
        System.out.println("The Hybrid car's engine is starting");
    }

    public double getAvgKmPerLiter() {
        return avgKmLiter;
    }
}

