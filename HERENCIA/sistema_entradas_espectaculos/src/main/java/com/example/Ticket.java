package com.example;

public abstract class Ticket {
    protected String eventName;
    protected double basePrice;
    
    public abstract double calculateFinalPrice();
}
