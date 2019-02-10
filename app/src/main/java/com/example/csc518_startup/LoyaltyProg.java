package com.example.csc518_startup;

public class LoyaltyProg
{
    private String name;
    private String bank;
    private int currBalance;

    public LoyaltyProg(String name, String bank, int currBalance)
    {

        this.name = name;
        this.bank = bank;
        this.currBalance = currBalance;
    }

    public void displayProg()
    {
        System.out.println(this.name + this.bank + this.currBalance);
    }
}
