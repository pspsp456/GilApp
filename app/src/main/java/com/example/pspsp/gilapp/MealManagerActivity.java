package com.example.pspsp.gilapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MealManagerActivity extends AppCompatActivity {

    static public String kcal;
    EditText kcalText;
    Button kcalButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meal_manager);

        kcalText = (EditText)findViewById(R.id.foodKcal);
        kcalButton = (Button)findViewById(R.id.kcalButton);
    }

    public void kcalOnClick(View v)
    {
        kcal = kcalText.getText().toString();

        Intent mainIntent = new Intent(MealManagerActivity.this, MainActivity.class);
        MealManagerActivity.this.startActivity(mainIntent);
    }

    static public String GetKcal()
    {
        return kcal;
    }
}
