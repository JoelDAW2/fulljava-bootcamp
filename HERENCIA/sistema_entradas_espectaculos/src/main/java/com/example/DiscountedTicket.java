package com.example;

public class DiscountedTicket extends Ticket{
    private double discountPercentage;

    public double calculateFinalPrice() {
        return this.basePrice - (this.basePrice * this.discountPercentage);
    }
}
