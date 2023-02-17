package com.example.myupozilla;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class video_page extends AppCompatActivity {

    LinearLayout video1, video2, video4, video3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video_page);

        video1 = findViewById(R.id.video1);
        video2 = findViewById(R.id.video2);
        video4 = findViewById(R.id.video4);
        video3 = findViewById(R.id.video3);

        video4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                web_view.video_url = "https://www.youtube.com/embed/2UejY-afFw";
                Intent myIntent = new Intent(video_page.this, web_view.class);
                startActivity(myIntent);
            }
        });
        video3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                web_view.video_url = "https://www.youtube.com/embed/ou3R2C-2X48";
                Intent myIntent = new Intent(video_page.this, web_view.class);
                startActivity(myIntent);
            }
        });
        video2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                web_view.video_url = "https://www.youtube.com/embed/ou3R2C-2X48";
                Intent myIntent = new Intent(video_page.this, web_view.class);
                startActivity(myIntent);
            }
        });
        video1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                web_view.video_url = "https://www.youtube.com/embed/ou3R2C-2X48";
                Intent myIntent = new Intent(video_page.this, web_view.class);
                startActivity(myIntent);
            }
        });
    }
}