package com.example;

public class Cat extends Animal{
    public Cat(int age, String name) {
        super(age, name);
    }

    @Override
    public String reproduceSound() {
        return "¡Miau!";
    }
}
