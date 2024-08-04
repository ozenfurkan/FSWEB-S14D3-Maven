package org.example.company;

public class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        String message = "Holden's engine is starting";
        System.out.println(getClass().getSimpleName() + ": " + message);
        return message;
    }

    @Override
    public String accelerate() {
        String message = "Holden is accelerating";
        System.out.println(getClass().getSimpleName() + ": " + message);
        return message;
    }

    @Override
    public String brake() {
        String message = "Holden is braking";
        System.out.println(getClass().getSimpleName() + ": " + message);
        return message;
    }
}
