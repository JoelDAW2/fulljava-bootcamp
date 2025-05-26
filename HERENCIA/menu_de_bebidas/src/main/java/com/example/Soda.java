package com.example;

public class Soda extends Drink{
    private boolean withGas;

    public Soda(boolean withGas, String name, String size) {
        super(name, size);
        this.withGas = withGas;
    }

    @Override
    protected String getDescription() {
        return "DESCRIPCIÓN: " + this.name + ", " + this.size + ", " + (this.withGas == true ? "Con gas" : "Sin gas");
    }
}
