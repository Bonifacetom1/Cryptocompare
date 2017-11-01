package com.example.tomboniface.cryptocompare;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class EthToCurrency extends Activity {

    private TextView coinTitle;
    private TextView coinsub;
    private TextView coinOutputName;
    private TextView tvOutputRate;
    private EditText etInput;
    private String nameOfCurrency;
    private Double currencyRate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eth_to_currency);

        coinTitle = (TextView) findViewById(R.id.cointitle);
        coinsub = (TextView) findViewById(R.id.coinrate);
        coinOutputName = (TextView) findViewById(R.id.coin_name_output);
        tvOutputRate = (TextView) findViewById(R.id.coin_rate_output);
        etInput = (EditText) findViewById(R.id.coin_input);


        Intent myIntent = getIntent();
        nameOfCurrency = myIntent.getStringExtra("name_of_currency");
        currencyRate = myIntent.getDoubleExtra("rate_of_currency", 0);

        coinTitle.setText("ETH to " + nameOfCurrency.toUpperCase());
        coinsub.setText("Rate 1:" + currencyRate);
        coinOutputName.setText(nameOfCurrency.toUpperCase() + ": ");


        etInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (etInput.getText().toString().isEmpty()) {
                    tvOutputRate.setText("noting to convert ");
                }

                coincalculate();


            }

            @Override
            public void afterTextChanged(Editable editable) {
//                if (TextUtils.isEmpty(editable.toString().trim())) {
//
//                } else {
//
//                }
            }


        });
    }

    public void coincalculate() {
        if (etInput.getText().toString().length() == 0) {
            return;
        }
        double coinInput;
        coinInput = Double.parseDouble(etInput.getText().toString());
        double coinOutput = coinInput * currencyRate;
        java.text.DecimalFormat coinDecimalFormat = new java.text.DecimalFormat("#,###,###");
        tvOutputRate.setText(coinDecimalFormat.format(coinOutput));

    }
}
