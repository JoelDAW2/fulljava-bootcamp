package com.example;

public class Person {
    private String name;
    private int age;
    private String email;

    public Person(String name, int age, String email)
    {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    // Getters
    public String getName()
    {
        return this.name;
    }

    public int getAge()
    {
        return this.age;
    }

    public String getEmail()
    {
        return this.email;
    }

    // Setters
    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public boolean isAdult(int age)
    {
        if(age >= 18)
        {
            return true;
        }
        return false;
    }

    public boolean emailContainsSpecialChar(String email)
    {
        for (int i = 0; i < email.length(); i++) {
            if(email.charAt(i) == '@')
            {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString()
    {
        return "\nName: " + name + ", " + "\nAge: " + age + ", " + "\nEmail: " + email; 
    }
}
