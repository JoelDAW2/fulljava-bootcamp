package com.example;

public class Bike extends Vehicle{

    public Bike(String brand, int year) {
        super(brand, year);
    }

    @Override
    public void startEngine()
    {
        System.out.println("No necesita arrancar");
    }

    @Override
    public void stopEngine() {
        System.out.println("Deteniendo la bicicleta de la marca " + this.brand);
    }
}
