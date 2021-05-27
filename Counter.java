package com.example.calculator;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Counter extends AppCompatActivity {

    private int result = 0;
    public String state = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        

    }

    public void setState(String num){
        state = state + num;
        System.out.println(state);
    }

    public String getState(){
        return state;
    }

    public int increment(int num1, int num2){
        return num1 + num2;
    }
}