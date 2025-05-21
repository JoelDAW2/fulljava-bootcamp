package com.example;

public class Main {
    public static void main(String[] args) {
        // Persona 1
        Person person1 = new Person("Manolo", 32, "manolo56@gmail.com");
        System.out.println("-> PERSON <- " + person1.toString());
        System.out.println("Adult: " + person1.isAdult(person1.getAge()));
        System.out.println("Special char: " + person1.emailContainsSpecialChar(person1.getEmail()));
        System.err.println();
        // Persona 2
        Person person2 = new Person("Mauricio", 54, "mauricolme34gmail.com");
        System.out.println("-> PERSON <- " + person2.toString());
        System.out.println("Adult: " + person2.isAdult(person2.getAge()));
        System.out.println("Special char: " + person2.emailContainsSpecialChar(person2.getEmail()));
        System.err.println();
        // Persona 3
        Person person3 = new Person("Luisma", 15, "luismi2@gmail.com");
        System.out.println("-> PERSON <- " + person3.toString());
        System.out.println("Adult: " + person3.isAdult(person3.getAge()));
        System.out.println("Special char: " + person3.emailContainsSpecialChar(person3.getEmail()));
    }
}