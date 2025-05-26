package com.example;

public class VirtualCat extends VirtualPet{

    public VirtualCat(int energy, int happiness, String name) {
        super(energy, happiness, name);
    }

    @Override
    public void eat() {
        super.eat();
        this.energy += 10;
    }
    
}
