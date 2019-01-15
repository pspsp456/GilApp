package com.example.pspsp.gilapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MealManagerActivity extends AppCompatActivity {

    EditText kcalText;
    EditText kgText;
    EditText fatText;
    EditText muscleText;

    Button kcalButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meal_manager);

        kcalText = (EditText)findViewById(R.id.foodKcal);
        kgText = (EditText)findViewById(R.id.kgTextID);
        fatText = (EditText)findViewById(R.id.fatTextID);
        muscleText = (EditText)findViewById(R.id.muscleTextID);

        kcalButton = (Button)findViewById(R.id.kcalButton);
    }

    public void kcalOnClick(View v)
    {
        Intent mainIntent = new Intent(MealManagerActivity.this, MainActivity.class);

        Log.d(kcalText.getText().toString(), "값이 어떻게 나오니?");
        mainIntent.putExtra("kcal", kcalText.getText().toString());
        mainIntent.putExtra("kg", kgText.getText().toString());
        mainIntent.putExtra("fat", fatText.getText().toString());
        mainIntent.putExtra("muscle", muscleText.getText().toString());

        MealManagerActivity.this.startActivity(mainIntent);
    }

}
