package com.example;

public class Motorbike extends Vehicle{

    public Motorbike(String brand, int year) {
        super(brand, year);
    }

    @Override
    public void startEngine()
    {
        System.out.println("Moto lista para rodar.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Deteniendo la moto de la marca " + this.brand);
    }
}
