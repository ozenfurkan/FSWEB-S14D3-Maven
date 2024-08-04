package org.example.company;

public class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        String message = "Mitsubishi's engine is starting";
        System.out.println(getClass().getSimpleName() + ": " + message);
        return message;
    }

    @Override
    public String accelerate() {
        String message = "Mitsubishi is accelerating";
        System.out.println(getClass().getSimpleName() + ": " + message);
        return message;
    }

    @Override
    public String brake() {
        String message = "Mitsubishi is braking";
        System.out.println(getClass().getSimpleName() + ": " + message);
        return message;
    }
}
