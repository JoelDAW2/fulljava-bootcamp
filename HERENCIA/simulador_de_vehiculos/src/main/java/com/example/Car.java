package com.example;

public class Car extends Vehicle{

    public Car(String brand, int year) {
        super(brand, year);
    }

    @Override
    public void startEngine()
    {
        System.out.println("Coche arrancando...");
    }

    @Override
    public void stopEngine() {
        System.out.println("Deteniendo el coche de la marca " + this.brand);
    }
}
