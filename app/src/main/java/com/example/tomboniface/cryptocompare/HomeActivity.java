package com.example.tomboniface.cryptocompare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class HomeActivity extends AppCompatActivity {
    private LinearLayout btcActivity, ethActivity;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btcActivity = (LinearLayout) findViewById(R.id.linear_btc);
        ethActivity = (LinearLayout) findViewById(R.id.linear_eth);

        btcActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(HomeActivity.this, ActivityBTC.class);
                startActivity(intent);
            }
        });

        ethActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(HomeActivity.this, ActivityETH.class);
                startActivity(intent);
            }
        });
    }
}
