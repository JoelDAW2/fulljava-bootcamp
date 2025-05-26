package com.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();

        Dog dog = new Dog(13, "Pluto");
        Cat cat = new Cat(2, "Doraemon");
        Bird bird = new Bird(5, "Piolín");

        animals.add(dog);
        animals.add(cat);
        animals.add(bird);

        System.out.println("<<< ZOOLÓGICO VIRTUAL >>>\n");

        for (Animal animal : animals) {
            System.out.println("-> Soy " + animal.getName() + " y hago: " + animal.reproduceSound() + "\n");
            animal.reproduceSound();
        }
    }
}