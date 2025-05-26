package com.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();

        Car car = new Car("Audi", 2002);
        Motorbike motorbike = new Motorbike("Kawasaki", 2018);
        Bike bike = new Bike("Rockrider", 2014);

        vehicles.add(car);
        vehicles.add(motorbike);
        vehicles.add(bike);

        System.out.println("\n<<< SIMULADOR DE VEHICULOS >>>\n");
    
        for (Vehicle vehicle : vehicles) {
            vehicle.startEngine();
            vehicle.stopEngine();
            System.out.println();
        }
    }
}