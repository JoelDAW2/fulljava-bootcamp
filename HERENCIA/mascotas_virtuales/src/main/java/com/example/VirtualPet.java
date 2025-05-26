package com.example;

public class VirtualPet {
    protected String name;
    protected int energy;
    protected int happiness;

    public VirtualPet(int energy, int happiness, String name) {
        this.energy = energy;
        this.happiness = happiness;
        this.name = name;
    }

    public void eat()
    {
        this.energy += 5;
    }

    public void play()
    {
        this.energy -= 5;
        this.happiness += 10;
    }

    public void showState()
    {
        System.out.println("Nombre: " + this.name);
        System.out.println("Nivel de energía: " + this.energy);
        System.out.println("Nivel de felicidad: " + this.happiness);
    }
}
