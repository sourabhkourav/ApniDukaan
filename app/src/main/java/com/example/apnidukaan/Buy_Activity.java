package com.example.apnidukaan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.niwattep.materialslidedatepicker.SlideDatePickerDialog;
import com.niwattep.materialslidedatepicker.SlideDatePickerDialogCallback;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Buy_Activity extends AppCompatActivity implements SlideDatePickerDialogCallback {
    Button dateButton;
    EditText textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy);

        dateButton = findViewById(R.id.date_button);
        textView = findViewById(R.id.seller_textView);

        dateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DateSelector dateSelector = new DateSelector(getResources(),getSupportFragmentManager());
                dateSelector.showDateDialogue();

            }
        });

    }

    @Override
    public void onPositiveClick(int i, int i1, int i2, Calendar calendar) {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
        textView.setText(format.format(calendar.getTime()));
    }
}