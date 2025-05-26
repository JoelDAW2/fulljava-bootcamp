package com.example;

public class Teacher extends Person{
    private String specialty;

    public Teacher(String specialty, int age, String name) {
        super(age, name);
        this.specialty = specialty;
    }
}
