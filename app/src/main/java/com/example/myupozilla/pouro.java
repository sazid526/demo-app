package com.example.myupozilla;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.myupozilla.R.id;

public class pouro extends AppCompatActivity {
    LinearLayout meyor,clickmeyor,clickcouncilor,councilor,official,clickofficial;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pouro);

        meyor = findViewById(R.id.meyor);
        clickmeyor = findViewById(R.id.clickmeyor);
        clickcouncilor = findViewById(id.clickcouncilor);
        councilor = findViewById(R.id.councilor);
        official = findViewById(R.id.official);
        clickofficial = findViewById(id.clickofficial);




        clickmeyor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (meyor.getVisibility() == View.GONE){
                    meyor.setVisibility(View.VISIBLE);
                    councilor.setVisibility(View.GONE);
                    official.setVisibility(View.GONE);
                }else{
                    meyor.setVisibility(View.GONE);
                }

            }
        });

        clickcouncilor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (councilor.getVisibility() == View.GONE){
                    councilor.setVisibility(View.VISIBLE);
                    meyor.setVisibility(View.GONE);
                    official.setVisibility(View.GONE);
                }else{
                    councilor.setVisibility(View.GONE);
                }
            }
        });

        clickofficial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (official.getVisibility() == View.GONE){
                    official.setVisibility(View.VISIBLE);
                    councilor.setVisibility(View.GONE);
                    meyor.setVisibility(View.GONE);
                }else{
                    official.setVisibility(View.GONE);
                }
            }
        });

    }
}