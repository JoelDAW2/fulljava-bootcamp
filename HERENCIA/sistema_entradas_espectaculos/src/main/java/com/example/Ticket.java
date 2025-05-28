package com.example;

public abstract class Ticket {
    protected String eventName;
    protected double basePrice;

    public Ticket(double basePrice, String eventName) {
        this.basePrice = basePrice;
        this.eventName = eventName;
    }
    
    public abstract double calculateFinalPrice();

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }
}
