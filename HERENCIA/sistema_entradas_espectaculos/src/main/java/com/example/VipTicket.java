package com.example;

public class VipTicket extends  Ticket{
    private double surcharge;

    public VipTicket(double surcharge, double basePrice, String eventName) {
        super(basePrice, eventName);
        this.surcharge = surcharge;
    }
    
    public double getSurcharge() {
        return surcharge;
    }
    
    public void setSurcharge(double surcharge) {
        this.surcharge = surcharge;
    }

    @Override
    public double calculateFinalPrice() {
        // return this.basePrice + (this.basePrice * this.surcharge);
        return this.basePrice + (this.basePrice * this.surcharge / 100);
    }
}
