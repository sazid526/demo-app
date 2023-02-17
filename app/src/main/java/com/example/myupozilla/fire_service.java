package com.example.myupozilla;

import android.content.Intent;
import android.os.Bundle;
import android.provider.CallLog;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class fire_service extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fire_service);
    }
    public void callButtonClicked(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, CallLog.Calls.CONTENT_URI);
        startActivity(intent);
    }
}