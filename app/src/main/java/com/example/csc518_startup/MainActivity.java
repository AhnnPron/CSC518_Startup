package com.example.csc518_startup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onButtonAddCardPressed(View v)
    {
        Intent i = new Intent(this, AddCard_Page.class);
        this.startActivity(i);
    }

    public void onButtonAddLoyaltyPressed(View v)
    {
        Intent i = new Intent(this, AddLoyalty_Page.class);
        this.startActivity(i);
    }
}
