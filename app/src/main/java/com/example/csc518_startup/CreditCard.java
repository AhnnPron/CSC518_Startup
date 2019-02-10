package com.example.csc518_startup;

public class CreditCard
{
    private String name;
    private String startDate;
    private int minSpend;
    private int rewardsPoints;


    public CreditCard(String name, String startDate, int minSpend, int rewardsPoints)
        {
            this.name = name;
            this.startDate = startDate;
            this.minSpend = minSpend;
            this.rewardsPoints = rewardsPoints;
        }
    public void displayCard()
    {
        System.out.println(this.name + "" + this.startDate + this.minSpend + this.rewardsPoints);
    }
}

