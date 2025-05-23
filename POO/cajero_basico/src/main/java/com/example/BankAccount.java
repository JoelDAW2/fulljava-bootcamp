package com.example;

public class BankAccount {

    private String holder;
    private int balance;

    public BankAccount(String holder, int balance)
    {
        this.holder = holder;
        this.balance = balance;
    }

    public void addBalance(int balance)
    {
        this.balance += balance;
    }

    public void substractBalance(int balance)
    {
        if ((this.balance - balance) >= 0) {
            this.balance -= balance;
        }
        else
        {
            System.out.println("\n** ERROR: Imposible retirar este importe **");
        }
    }

    public int getBalance()
    {
        return this.balance;
    }
}
