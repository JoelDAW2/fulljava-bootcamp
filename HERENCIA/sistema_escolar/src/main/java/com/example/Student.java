package com.example;

public class Student extends Person{
    private String degree;

    public Student(String degree, int age, String name) {
        super(age, name);
        this.degree = degree;
    }
}
