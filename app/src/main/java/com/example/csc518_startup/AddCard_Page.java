package com.example.csc518_startup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AddCard_Page extends AppCompatActivity
{
    private EditText Name, StartDate, MinSpend, RewardsPoints;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_card__page);

        this.Name = (EditText)this.findViewById(R.id.Name);
        this.StartDate = (EditText)this.findViewById(R.id.StartDate);
        this.MinSpend = (EditText)this.findViewById(R.id.MinSpend);
        this.RewardsPoints = (EditText)this.findViewById(R.id.RewardsPoints);
    }

    public void onSubmitCardButtonPressed(View v)
    {
        String name = this.Name.getText().toString();
        String startDate = this.StartDate.getText().toString();
        int minSpend = Integer.parseInt(this.MinSpend.getText().toString()); //parsing the integer into a string
        int rewardsPoints = Integer.parseInt(this.RewardsPoints.getText().toString()); //parsing the integer into a string
        CreditCard c = new CreditCard(name, startDate, minSpend, rewardsPoints);
        c.displayCard();
    }
}
