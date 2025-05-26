package com.example;

public class Bird extends Animal{
    public Bird(int age, String name) {
        super(age, name);
    }

    @Override
    public String reproduceSound() {
        return "¡Pío, pío!";
    }
}
