package com.example.fitbuddy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;



public class Beginner_Level extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beginner_level);
    }
    public void Chest(View view) {
        Intent intent = new Intent(this, com.example.fitbuddy.Chest_Workout.class);
        startActivity(intent);
        finish();
    }
    public void Back(View view) {
        Intent intent = new Intent(this, com.example.fitbuddy.Back_Workout.class);
        startActivity(intent);
        finish();
    }
    public void Shoulder(View view) {
        Intent intent = new Intent(this, com.example.fitbuddy.Shoulder_Workout.class);
        startActivity(intent);
        finish();
    }
    public void Bicep(View view) {
        Intent intent = new Intent(this, com.example.fitbuddy.Bicep_Workout.class);
        startActivity(intent);
        finish();
    }
    public void Tricep(View view) {
        Intent intent = new Intent(this, com.example.fitbuddy.Tricep_Workout.class);
        startActivity(intent);
        finish();
    }
    public void Leg(View view) {
        Intent intent = new Intent(this, com.example.fitbuddy.Legs_Workout.class);
        startActivity(intent);
        finish();
    }
}