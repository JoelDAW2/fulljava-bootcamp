package com.example;

public class VipTicket extends  Ticket{
    private double surcharge;

    public double calculateFinalPrice() {
        return this.basePrice + (this.basePrice * this.surcharge);
    }
}
