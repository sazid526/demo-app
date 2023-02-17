package com.example.myupozilla;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        video = findViewById(R.id.video);



        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               
                Intent myIntent = new Intent(MainActivity.this,video_page.class);
                startActivity(myIntent);
            }
        });
    }
}