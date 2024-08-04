package org.example.company;

public class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        String message = "Ford's engine is starting";
        System.out.println(getClass().getSimpleName() + ": " + message);
        return message;
    }

    @Override
    public String accelerate() {
        String message = "Ford is accelerating";
        System.out.println(getClass().getSimpleName() + ": " + message);
        return message;
    }

    @Override
    public String brake() {
        String message = "Ford is braking";
        System.out.println(getClass().getSimpleName() + ": " + message);
        return message;
    }
}
