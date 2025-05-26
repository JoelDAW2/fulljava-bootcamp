package com.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<Drink> drinks = new ArrayList<>();

        Soda soda = new Soda(true, "Cocacola", "XL");
        Juice juice = new Juice("Naranja", "Zumo de naranja", "S");
        Water water = new Water(true, "Agua Viladrau", "X");

        drinks.add(soda);
        drinks.add(juice);
        drinks.add(water);

        System.out.println("\n<<< MENÚ DE BEBIDAS >>>\n");

        for (Drink drink : drinks) {
            System.out.println("-> " + drink.getDescription() + "\n");
        }
    }
}