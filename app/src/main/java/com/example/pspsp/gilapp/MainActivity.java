package com.example.pspsp.gilapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();

        listView = (ListView)findViewById(R.id.ExerciseList);
        textView = (TextView)findViewById(R.id.MainText);

        textView.setText("당신은 운동" + dayCount() + "일 차입니다");


        List<String> data = new ArrayList<String>();

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data);

        listView.setAdapter(adapter);

        data.add("금일 현재까지 먹은 칼로리 수치는" + intent.getStringExtra("kcal") + "kcal 입니다.");
        data.add("현재 부위별 운동 빈도");
        data.add("체중: " + intent.getStringExtra("kg"));
        data.add("지방: " + intent.getStringExtra("fat"));
        data.add("골격근량: " + intent.getStringExtra("muscle"));

    }

    private long dayCount()
    {
        long firstTime = 0;
        long time = System.currentTimeMillis();

        time = (time - firstTime) /(1000 * 3600 * 24 * 365);

        return time;
    }

}
