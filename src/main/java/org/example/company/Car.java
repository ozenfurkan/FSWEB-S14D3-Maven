package org.example.company;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.wheels = 4;
        this.cylinders = cylinders;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        return cylinders == car.cylinders && name.equals(car.name);
    }



    @Override
    public String toString() {
        return "Car{name='" + name + "', cylinders=" + cylinders + '}';
    }

    public String startEngine() {
        String message = "the car's engine is starting";
        System.out.println(getClass().getSimpleName() + ": " + message);
        return message;
    }

    public String accelerate() {
        String message = "the car is accelerating";
        System.out.println(getClass().getSimpleName() + ": " + message);
        return message;
    }

    public String brake() {
        String message = "the car is braking";
        System.out.println(getClass().getSimpleName() + ": " + message);
        return message;
    }
}
