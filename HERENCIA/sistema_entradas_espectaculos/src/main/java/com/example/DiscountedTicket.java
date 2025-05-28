package com.example;

public class DiscountedTicket extends Ticket{
    private double discountPercentage;

    public DiscountedTicket(double basePrice, String eventName, double discountPercentage) {
        super(basePrice, eventName);
        this.discountPercentage = discountPercentage;
    }
    
    public double getDiscountPercentage() {
        return discountPercentage;
    }
    
    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }
    
    @Override
    public double calculateFinalPrice() {
        // return this.basePrice - (this.basePrice * this.discountPercentage);
        return this.basePrice - ((this.basePrice * this.discountPercentage) / 100);
    }
}
