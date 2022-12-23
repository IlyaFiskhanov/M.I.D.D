package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void starsaperol(View v){
        Intent intent = new Intent(this, Pina.class);
        startActivity(intent);
    }

    public void starsMary(View v){
        Intent intent = new Intent(this, mary.class);
        startActivity(intent);
    }

    public void starsMargarita(View v){
        Intent intent = new Intent(this, margarita.class);
        startActivity(intent);
    }

    public void starsSunrise(View v){
        Intent intent = new Intent(this, sunrise.class);
        startActivity(intent);
    }

    public void starsLong(View v){
        Intent intent = new Intent(this, longay.class);
        startActivity(intent);
    }
    public void starsMoxito(View v){
        Intent intent = new Intent(this, moxito.class);
        startActivity(intent);
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