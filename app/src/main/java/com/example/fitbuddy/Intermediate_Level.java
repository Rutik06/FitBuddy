package com.example.fitbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Intermediate_Level extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intermediate_level);
    }
    public void Mon(View view) {
        Intent intent = new Intent(this, com.example.fitbuddy.Monday_Intermediate.class);
        startActivity(intent);
        finish();
    }
    public void Tue(View view) {
        Intent intent = new Intent(this, com.example.fitbuddy.Tuseday_Intermediate.class);
        startActivity(intent);
        finish();

    }
    public void Wed(View view) {
        Intent intent = new Intent(this, com.example.fitbuddy.Wednesday_Intermediate.class);
        startActivity(intent);
        finish();

    }
    public void Thu(View view) {
        Intent intent = new Intent(this, com.example.fitbuddy.Thursday_Intermediate.class);
        startActivity(intent);
        finish();

    }
    public void Fri(View view) {
        Intent intent = new Intent(this, com.example.fitbuddy.Friday_Intermediate.class);
        startActivity(intent);
        finish();

    }
    public void Sat(View view) {
        Intent intent = new Intent(this, com.example.fitbuddy.Saturday_Intermediate.class);
        startActivity(intent);
        finish();

    }
    public void Sun(View view) {
        Intent intent = new Intent(this, com.example.fitbuddy.Sunday_Intermediate.class);
        startActivity(intent);
        finish();

    }
}