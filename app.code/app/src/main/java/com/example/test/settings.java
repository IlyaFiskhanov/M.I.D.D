package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
    }
    public void backToList(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void settings(View v){
        Intent intent = new Intent(this, settings.class);
        startActivity(intent);
    }
    public void permission(View v){
        Intent intent = new Intent(this, permission.class);
        startActivity(intent);
    }

    public void about(View v){
        Intent intent = new Intent(this, about.class);
        startActivity(intent);
    }

    public void feedback(View v){
        Intent intent = new Intent(this, feedback.class);
        startActivity(intent);
    }
    public void createnewone(View v){
        Intent intent = new Intent(this, createnewone.class);
        startActivity(intent);
    }


}