
package com.example;

public class Animal {

    private String name;
    private int age;

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String reproduceSound()
    {
        return "El animal hace sonido";
    }
}
