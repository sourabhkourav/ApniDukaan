package com.example.apnidukaan;

import android.content.res.Resources;

import androidx.fragment.app.FragmentManager;

import com.niwattep.materialslidedatepicker.SlideDatePickerDialog;
import com.niwattep.materialslidedatepicker.SlideDatePickerDialogCallback;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class DateSelector {
    private final Resources resources;
    private final FragmentManager supportFragmentManager;

    public DateSelector(Resources resources, FragmentManager supportFragmentManager) {
        this.resources = resources;
        this.supportFragmentManager = supportFragmentManager;
    }

    public void showDateDialogue(){
        Calendar endDate = Calendar.getInstance();
        endDate.set(Calendar.YEAR, 2100);
        SlideDatePickerDialog.Builder builder = new SlideDatePickerDialog.Builder();
        builder.setEndDate(endDate);
        builder.setThemeColor(resources.getColor(R.color.app_color_primary_dark));
        builder.setHeaderTextColor(R.color.black);
        SlideDatePickerDialog dialog = builder.build();
        dialog.show(supportFragmentManager, "Dialog");

    }
}
