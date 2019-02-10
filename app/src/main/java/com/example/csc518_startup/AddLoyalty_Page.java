package com.example.csc518_startup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AddLoyalty_Page extends AppCompatActivity
{
    private EditText Name, Bank, CurrentBalance;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_loyalty__page);

        this.Name = (EditText)this.findViewById(R.id.Name);
        this.Bank = (EditText)this.findViewById(R.id.Bank);
        this.CurrentBalance = (EditText)this.findViewById(R.id.CurrentBalence);
    }

    public void onSummitLoyaltyButtonPressed(View v)
    {
        String name = this.Name.getText().toString();
        String bank = this.Bank.getText().toString();
        int currBalance = Integer.parseInt(this.CurrentBalance.getText().toString());
        LoyaltyProg l = new LoyaltyProg(name, bank, currBalance);
        l.displayProg();
    }
}
