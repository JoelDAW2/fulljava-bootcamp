package com.example;

public class VirtualDog extends VirtualPet{

    public VirtualDog(int energy, int happiness, String name) {
        super(energy, happiness, name);
    }

    @Override
    public void play() {
        super.play();
        this.happiness += 10;
    }
    
}
