package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "@@@ MainActicity";
    private static final String EXTRA_TEXT = "message";

    private TextView settings;
    private String state;
    private Counter counter;
    private TextView button0;
    private TextView answer;
    private TextView button1;
    private TextView button2;
    private TextView button3;
    private TextView button4;
    private TextView button5;
    private TextView button6;
    private TextView button7;
    private TextView button8;
    private TextView button9;
    private TextView button_plus;
    private TextView button_minus;
    private TextView button_multiply;
    private TextView button_divide;
    private TextView button_equally;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.settings).setOnClickListener(v -> {
            Intent intent = new Intent(this, SettingsActivity.class);
            startActivity(intent);
        });

        if (getIntent().hasExtra(SettingsActivity.MESSAGE_EXTRA_KEY)) {
            answer = findViewById(R.id.answer);
            answer.setText(getIntent().getStringExtra(SettingsActivity.MESSAGE_EXTRA_KEY));
        }

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button_plus = (Button) findViewById(R.id.button_plus);
        button_minus = (Button) findViewById(R.id.button_minus);
        button_multiply = (Button) findViewById(R.id.button_multiply);
        button_divide = (Button) findViewById(R.id.button_divide);
        button_equally = (Button) findViewById(R.id.button_equally);

        button0.setOnClickListener(v -> {
//            Log.d(TAG, counter.getState());
            // Не могу понять, почему происходит ошибка Counter.getState()' on a null object reference
            if (counter.getState().equals("")) {
                counter.setState(button0.getText().toString());
                Log.d(TAG, "Записали");
            }
        });
    }
}