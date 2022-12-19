package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class moxito extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moxito);
    }
    public void backToList(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void settings(View v){
        Intent intent = new Intent(this, settings.class);
        startActivity(intent);
    }
    public void createnewone(View v){
        Intent intent = new Intent(this, createnewone.class);
        startActivity(intent);
    }
}