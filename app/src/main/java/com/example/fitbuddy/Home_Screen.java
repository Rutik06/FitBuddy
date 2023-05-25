package com.example.fitbuddy;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


//public class Home_Screen extends AppCompatActivity {
//
//    FirebaseAuth auth;
//    TextView textView;
//    FirebaseUser user;
//    ImageButton logout;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_home_screen);
//
//        auth =FirebaseAuth.getInstance();
//        logout = findViewById(R.id.imageButton);
//        user = auth.getCurrentUser();
//        if (user==null){
//            Intent intent = new Intent(getApplicationContext(), Login.class);
//            startActivity(intent);
//            finish();
//        }
//        else{
//            textView.setText(user.getEmail());
//        }
//        logout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                FirebaseAuth.getInstance().signOut();
//                Intent intent = new Intent(getApplicationContext(), Login.class);
//                startActivity(intent);
//                finish();
//            }
//        });
//    }


public class Home_Screen extends AppCompatActivity {

    private ImageButton logoutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        logoutButton = findViewById(R.id.imageButton);
        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Perform logout operation here
                Toast.makeText(Home_Screen.this, "Logging out", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Home_Screen.this, Login.class);
                startActivity(intent);
                finish();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (logoutButton == null) {
            Log.e("HomeScreenActivity", "Logout button is null in onResume()");
            return;
        }
        logoutButton.setEnabled(true);
    }


    public void GuestBMI(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void WorkoutPlans(View view) {
        Intent intent = new Intent(this, com.example.fitbuddy.Workout_Plans.class);
        startActivity(intent);
    }
    public void MealPlan(View view) {
        Intent intent = new Intent(this, com.example.fitbuddy.Meal_Plan.class);
        startActivity(intent);
    }
    public void HealthTips(View view) {
        Intent intent = new Intent(this, com.example.fitbuddy.Health_Tips.class);
        startActivity(intent);
    }
    public void CalorieCounter(View view) {
        Intent intent = new Intent(this, com.example.fitbuddy.Calorie_Counter.class);
        startActivity(intent);
    }

}