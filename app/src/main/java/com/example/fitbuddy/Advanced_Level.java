package com.example.fitbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Advanced_Level extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced_level);
    }
    public void Mon1(View view) {
        Intent intent = new Intent(this, com.example.fitbuddy.Monday_Advanced.class);
        startActivity(intent);
        finish();

    }
    public void Tue1(View view) {
        Intent intent = new Intent(this, com.example.fitbuddy.Tuesday_Advanced.class);
        startActivity(intent);
        finish();

    }
    public void Wed1(View view) {
        Intent intent = new Intent(this, com.example.fitbuddy.Wednesday_Advanced.class);
        startActivity(intent);
        finish();

    }
    public void Thu1(View view) {
        Intent intent = new Intent(this, com.example.fitbuddy.Thursday_Intermediate.class);
        startActivity(intent);
        finish();

    }
    public void Fri1(View view) {
        Intent intent = new Intent(this, com.example.fitbuddy.Friday_Advanced.class);
        startActivity(intent);
        finish();

    }
    public void Sat1(View view) {
        Intent intent = new Intent(this, com.example.fitbuddy.Saturday_Advanced.class);
        startActivity(intent);
        finish();

    }
    public void Sun1(View view) {
        Intent intent = new Intent(this, com.example.fitbuddy.Sunday_Advanced.class);
        startActivity(intent);
        finish();

    }
}