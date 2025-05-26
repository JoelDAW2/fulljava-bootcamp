package com.example;

public class Vehicle {
    protected String brand;
    protected int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void startEngine()
    {
        System.out.println("Arrancando el vehiculo");
    }

    public void stopEngine()
    {
        System.out.println("Deteniendo el vehiculo");
    }
}
