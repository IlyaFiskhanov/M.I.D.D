package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;
import java.net.*;

public class shortdrink extends AppCompatActivity implements AdapterView.OnItemSelectedListener {


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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shortdrink);
        //Инициализируем элемент Spinner:
        Spinner spinner4 = (Spinner) findViewById(R.id.spinner4);
        Spinner spinner5 = (Spinner) findViewById(R.id.spinner5);
        Spinner spinner6 = (Spinner) findViewById(R.id.spinner6);
        Spinner spinner7 = (Spinner) findViewById(R.id.spinner7);
        Spinner spinner8 = (Spinner) findViewById(R.id.spinner8);





        //Создаем массив элементов выпадающего списка:
        List<String> elements = new ArrayList<String>();
        elements.add("ничего");
        elements.add("водка");
        elements.add("текила");
        elements.add("ром");
        elements.add("трипл сек");
        elements.add("виски");
        elements.add("гринадин");
        elements.add("блю круасао");
        elements.add("кола");
        elements.add("клюквенный сок");
        elements.add("сах. сироп");
        elements.add("апельсиновый сок");
        elements.add("персиковый сок");
        elements.add("шампанское");



        //Создаем для spinner адаптер:
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, elements);

        //Настраиваем внешний вид выпадающего списка, используя готовый системный шаблон:
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //Присоединяем адаптер данных к spinner:
        spinner4.setAdapter(dataAdapter);
        spinner5.setAdapter(dataAdapter);
        spinner6.setAdapter(dataAdapter);
        spinner7.setAdapter(dataAdapter);
        spinner8.setAdapter(dataAdapter);


    }
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        //Выбираем элемент выпадающего списка:
        String item = parent.getItemAtPosition(position).toString();
        //Показываем выбранный элемент с помощью Toast сообщения:
        Toast.makeText(parent.getContext(), "Выбрано: " + item, Toast.LENGTH_LONG).show();
    }

    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub

    }
    public void button(View v){
        Thread thread = new Thread(new Runnable() {

            @Override
            public void run() {
                Spinner spinner4 = (Spinner) findViewById(R.id.spinner4);
                Spinner spinner5 = (Spinner) findViewById(R.id.spinner5);
                Spinner spinner6 = (Spinner) findViewById(R.id.spinner6);
                Spinner spinner7 = (Spinner) findViewById(R.id.spinner7);
                Spinner spinner8 = (Spinner) findViewById(R.id.spinner8);
                EditText text = (EditText) findViewById(R.id.editText2);

                String message = "ШОРТ ДРИНК"+"%0A";
                if ((text.getText().toString()) != "Ваше имя?"){
                    message = message + (text.getText().toString()) + "%0A";
                }

                if (spinner4.getItemAtPosition(spinner4.getSelectedItemPosition()).toString() != "ничего"){
                    message = message+spinner4.getItemAtPosition(spinner4.getSelectedItemPosition()).toString()+"%0A";

                }
                if (spinner5.getItemAtPosition(spinner5.getSelectedItemPosition()).toString() != "ничего"){
                    message = message+spinner5.getItemAtPosition(spinner5.getSelectedItemPosition()).toString()+"%0A";
                }
                if (spinner6.getItemAtPosition(spinner6.getSelectedItemPosition()).toString() != "ничего"){
                    message = message+spinner6.getItemAtPosition(spinner6.getSelectedItemPosition()).toString()+"%0A";
                }
                if (spinner7.getItemAtPosition(spinner7.getSelectedItemPosition()).toString() != "ничего"){
                    message = message+spinner7.getItemAtPosition(spinner7.getSelectedItemPosition()).toString()+"%0A";
                }
                if (spinner8.getItemAtPosition(spinner8.getSelectedItemPosition()).toString() != "ничего"){
                    message = message+spinner8.getItemAtPosition(spinner8.getSelectedItemPosition()).toString()+"%0A";
                }



                String path ="https://api.telegram.org/bot5952555020:AAFyOU3huPeU_QhKl9QygUxbaazA2VhrdSQ/sendMessage?chat_id=344748076&text=";
                path = path+message;
                try{

                    URL url = new URL(path);
                    HttpURLConnection con = (HttpURLConnection) url.openConnection();
                    con.setRequestMethod("GET");
                    con.getResponseCode();
                }catch (MalformedURLException e ) {
                }
                catch ( Exception e ) {;
                }
            }
        });

        thread.start();


    }
}