package com.example.pspsp.gilapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    String kcal = MealManagerActivity.GetKcal();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.ExerciseList);

        List<String> data = new ArrayList<String>();

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data);

        listView.setAdapter(adapter);

        data.add("금일 현재까지 먹은 칼로리 수치는" + kcal + "kcal 입니다.");
        data.add("현재 부위별 운동 빈도");
        data.add("체중");
        data.add("지방");
        data.add("골격근량");

    }


}
