package com.example;

public class Drink {
    protected String name;
    protected String size;

    public Drink(String name, String size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    protected String getDescription()
    {
        return "DESCRIPCIÓN: " + this.name + ", " + this.size;
    }
}
