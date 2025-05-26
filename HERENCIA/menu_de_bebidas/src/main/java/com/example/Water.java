package com.example;

public class Water extends Drink{
    private boolean mineral;

    public Water(boolean mineral, String name, String size) {
        super(name, size);
        this.mineral = mineral;
    }

    @Override
    protected String getDescription() {
        return "DESCRIPCIÓN: " + this.name + ", " + this.size + ", " + (this.mineral == true ? "Con minerales" : "Sin minerales");
    }
}
