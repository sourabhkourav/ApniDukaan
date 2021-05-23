package com.example.apnidukaan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Arrays;
import java.util.Collections;

public class ViewData_Activity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    ListView list ;
    String[] data = {"apple","guava","mango","pineapple","orange","banana","grapes","apple","guava",
            "mango","pineapple","orange","banana","grapes","apple","guava","mango","pineapple","orange","banana","grapes"};

    String[] sort = {"a to z","z to a","Quantity less first","Quantity high first"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewdata);

        list = findViewById(R.id.listView);
        //list adapter here
        showData();

        Spinner spin = (Spinner) findViewById(R.id.spinner);
        spin.setOnItemSelectedListener(this);

        //Creating the ArrayAdapter instance having the country list
        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,sort);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spin.setAdapter(aa);
    }

    public void showData(){
        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, data);
        list.setAdapter(adapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getApplicationContext(),sort[position] , Toast.LENGTH_LONG).show();
        switch (position){
            case 0:
                Arrays.sort(data);
                showData();
                break;
            case 1:Arrays.sort(data, Collections.reverseOrder());
                showData();
                break;
            default:
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}