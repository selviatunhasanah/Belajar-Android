package com.example.brandapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] Brands = {"Biskuit","indomie","seleraku","sedap"};
    Spinner spinner;
    String[] jenis = {"Food", "Drink","Snaks"};
    AutoCompleteTextView autoCompleteTextView;
    String[] auto = {"soto","bakso","pentol"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.List_brand);
        ArrayAdapter adapter = new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,Brands);
        listView.setAdapter(adapter);

//        even on click
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "ini adalah brand "+adapterView.getItemAtPosition(i)+" PT Samsul", Toast.LENGTH_SHORT).show();
            }
        });
        spinner = findViewById(R.id.Spiner_category);
        ArrayAdapter Sadapter = new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,jenis);
        spinner.setAdapter(Sadapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "Ini Kategori nya "+adapterView.getItemAtPosition(i), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        autoCompleteTextView = findViewById(R.id.auto);
        ArrayAdapter aAdapter = new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,auto);
        autoCompleteTextView.setAdapter(aAdapter);
        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "new product PT samsul sejahter" +adapterView.getItemAtPosition(i), Toast.LENGTH_SHORT).show();
            }
        });

    }
}