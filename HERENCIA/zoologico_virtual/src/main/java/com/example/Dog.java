package com.example;

public class Dog extends Animal{

    public Dog(int age, String name) {
        super(age, name);
    }

    @Override
    public String reproduceSound() {
        return "¡Guau, guau!";
    }
}
