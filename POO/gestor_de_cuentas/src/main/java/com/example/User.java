package com.example;

public class User {
    private String name;
    private String password;

    public User(String name, String password)
    {
        this.name = name;
        this.password = password;
    }

    // Getters
    public String getName()
    {
        return this.name;
    }

    public String getPassword()
    {
        return this.password;
    }

    // Setters
    public void setName(String name)
    {
        this.name = name;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }
}
