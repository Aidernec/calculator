package com.example.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SettingsActivity extends AppCompatActivity {
    public static final String MESSAGE_EXTRA_KEY = "message";
    private RadioButton dark_button;
    private RadioButton light_button;
    private Button submit;
    private String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        dark_button = findViewById(R.id.dark);
        light_button = findViewById(R.id.light);
        submit = findViewById(R.id.submit);

        submit.setOnClickListener(v -> {
            if(dark_button.isSelected()){
                message = "dark";
            }
            if(light_button.isSelected()){
                message = "light";
            }
            Intent intent = new Intent(this, MainActivity.class);
            intent.putExtra(MESSAGE_EXTRA_KEY, message);
            sendBroadcast(intent);
            startActivity(intent);
        });

    }
}