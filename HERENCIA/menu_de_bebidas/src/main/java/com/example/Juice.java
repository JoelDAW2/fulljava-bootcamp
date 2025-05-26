package com.example;

public class Juice extends Drink{
    private String fruit;

    public Juice(String fruit, String name, String size) {
        super(name, size);
        this.fruit = fruit;
    }

    @Override
    protected String getDescription() {
        return "DESCRIPCIÓN: " + this.name + ", " + this.size + ", " + this.fruit;
    }
}
