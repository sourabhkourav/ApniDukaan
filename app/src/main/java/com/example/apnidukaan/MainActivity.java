package com.example.apnidukaan;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button buyButton, sellButton, viewDataButton, transactionButton ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buyButton = findViewById(R.id.buy_button);
        sellButton = findViewById(R.id.sell_button);
        viewDataButton = findViewById(R.id.viewdata_button);
        transactionButton = findViewById(R.id.transaction_button);

        buyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Button Pressed =>> ","buy button");
                Intent intent = new Intent(getApplicationContext(), Buy_Activity.class);
                startActivity(intent);
            }
        });

        sellButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Button Pressed =>> ","sell button");
                Intent intent = new Intent(getApplicationContext(), Sell_Activity.class);
                startActivity(intent);
            }
        });

        viewDataButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Button Pressed =>> ","view data button");
                Intent intent = new Intent(getApplicationContext(), ViewData_Activity.class);
                startActivity(intent);
            }
        });

        transactionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Button Pressed =>> ","transaction button");
                Intent intent = new Intent(getApplicationContext(), Transaction_Activity.class);
                startActivity(intent);
            }
        });
    }
}