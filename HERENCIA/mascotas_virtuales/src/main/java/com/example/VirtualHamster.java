package com.example;

public class VirtualHamster extends VirtualPet{

    public VirtualHamster(int energy, int happiness, String name) {
        super(energy, happiness, name);
    }

    @Override
    public void play() {
        super.play();
        this.energy -= 10;
    }
    
}
