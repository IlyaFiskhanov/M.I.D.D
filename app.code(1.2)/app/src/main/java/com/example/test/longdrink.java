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

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;


public class longdrink extends AppCompatActivity implements AdapterView.OnItemSelectedListener{


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
        setContentView(R.layout.activity_longdrink);
        //Инициализируем элемент Spinner:
        Spinner spinner9 = (Spinner) findViewById(R.id.spinner9);
        Spinner spinner10 = (Spinner) findViewById(R.id.spinner10);
        Spinner spinner11 = (Spinner) findViewById(R.id.spinner11);
        Spinner spinner12 = (Spinner) findViewById(R.id.spinner12);
        Spinner spinner13 = (Spinner) findViewById(R.id.spinner13);
        Spinner spinner14 = (Spinner) findViewById(R.id.spinner14);




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
        spinner9.setAdapter(dataAdapter);
        spinner10.setAdapter(dataAdapter);
        spinner11.setAdapter(dataAdapter);
        spinner12.setAdapter(dataAdapter);
        spinner13.setAdapter(dataAdapter);
        spinner14.setAdapter(dataAdapter);


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
                Spinner spinner9 = (Spinner) findViewById(R.id.spinner9);
                Spinner spinner10 = (Spinner) findViewById(R.id.spinner10);
                Spinner spinner11 = (Spinner) findViewById(R.id.spinner11);
                Spinner spinner12 = (Spinner) findViewById(R.id.spinner12);
                Spinner spinner13 = (Spinner) findViewById(R.id.spinner13);
                Spinner spinner14 = (Spinner) findViewById(R.id.spinner14);
                EditText text = (EditText) findViewById(R.id.editTextTextPersonName3);

                String message = "ЛОНГ ДРИНК"+"%0A";

                if ((text.getText().toString()) != "Ваше имя?"){
                    message = message + (text.getText().toString()) + "%0A";
                }
                if (spinner9.getItemAtPosition(spinner9.getSelectedItemPosition()).toString() != "ничего"){
                    message = message+spinner9.getItemAtPosition(spinner9.getSelectedItemPosition()).toString()+"%0A";

                }
                if (spinner10.getItemAtPosition(spinner10.getSelectedItemPosition()).toString() != "ничего"){
                    message = message+spinner10.getItemAtPosition(spinner10.getSelectedItemPosition()).toString()+"%0A";
                }
                if (spinner11.getItemAtPosition(spinner11.getSelectedItemPosition()).toString() != "ничего"){
                    message = message+spinner11.getItemAtPosition(spinner11.getSelectedItemPosition()).toString()+"%0A";
                }
                if (spinner12.getItemAtPosition(spinner12.getSelectedItemPosition()).toString() != "ничего"){
                    message = message+spinner12.getItemAtPosition(spinner12.getSelectedItemPosition()).toString()+"%0A";
                }
                if (spinner13.getItemAtPosition(spinner13.getSelectedItemPosition()).toString() != "ничего"){
                    message = message+spinner13.getItemAtPosition(spinner13.getSelectedItemPosition()).toString()+"%0A";
                }
                if (spinner14.getItemAtPosition(spinner14.getSelectedItemPosition()).toString() != "ничего"){
                    message = message+spinner14.getItemAtPosition(spinner14.getSelectedItemPosition()).toString()+"%0A";
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