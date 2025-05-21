package com.example;

public class Contact {
    private String name;
    private int phone;
    private String email;

    public Contact(String name, int phone, String email)
    {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    // Getters
    public String getName()
    {
        return this.name;
    }

    public int getPhone()
    {
        return this.phone;
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

    public void setPhone(int phone)
    {
        this.phone = phone;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }
}
