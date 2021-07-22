package com.example.apnidukaan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class ViewData_Activity extends AppCompatActivity{
    ListView list ;
    ArrayAdapter adapter;
    CardView sort, filter;
    String[] data = {"apple","guava","mango","pineapple","orange","banana","grapes","apple","guava",
            "mango","pineapple","orange","banana","grapes","apple","guava","mango","pineapple","orange","banana","grapes"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewdata);

        sort = findViewById(R.id.sortCard);
        list = findViewById(R.id.listView);
        //list adapter here
        showData();

        sort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SortBottomDialogue sortBottomDialogue = new SortBottomDialogue();
                sortBottomDialogue.show(getSupportFragmentManager(),"bottom sheet");
            }
        });

    }

    public void showData(){
        Arrays.sort(data);
        adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.support_simple_spinner_dropdown_item, data);
        list.setAdapter(adapter);
    }

}