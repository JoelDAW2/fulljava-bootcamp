package com.example;

public class StandardTicket extends Ticket{

    public StandardTicket(double basePrice, String eventName) {
        super(basePrice, eventName);
    }

    @Override
    public double calculateFinalPrice() {
        return this.basePrice;
    }
}
