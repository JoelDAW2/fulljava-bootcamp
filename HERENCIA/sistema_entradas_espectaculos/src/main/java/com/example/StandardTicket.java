package com.example;

public class StandardTicket extends Ticket{

    @Override
    public double calculateFinalPrice() {
        return this.basePrice;
    }
}
