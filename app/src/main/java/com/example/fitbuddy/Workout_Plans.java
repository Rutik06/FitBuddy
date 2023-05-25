package com.example.fitbuddy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;



public class Workout_Plans extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_plans);
    }
    public void Beginner(View view) {
        Intent intent = new Intent(this, com.example.fitbuddy.Beginner_Level.class);
        startActivity(intent);
    }
    public void Intermediate(View view) {
        Intent intent = new Intent(this, com.example.fitbuddy.Intermediate_Level.class);
        startActivity(intent);
    }
    public void Advanced(View view) {
        Intent intent = new Intent(this, com.example.fitbuddy.Advanced_Level.class);
        startActivity(intent);
    }

}