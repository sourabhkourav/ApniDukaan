package com.example.apnidukaan;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class SortBottomDialogue extends BottomSheetDialogFragment {
    RadioGroup radioGroup;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.sort_bottom_dialogue,container,false);
        radioGroup = v.findViewById(R.id.radio_group);
        radioGroup.setOnCheckedChangeListener(this::onCheckedChanged);
        return v;
    }
    public void onCheckedChanged (RadioGroup group,
                                  int checkedId){

        switch (checkedId){
            case R.id.radioButton1 : Toast.makeText(getContext(), "A to Z",Toast.LENGTH_SHORT).show();
                break;
            case R.id.radioButton2 : Toast.makeText(getContext(), "Z to A",Toast.LENGTH_SHORT).show();
                break;
//            case R.id.radioButton3 : Toast.makeText(getContext(), "Most available",Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.radioButton4 : Toast.makeText(getContext(), "Least available",Toast.LENGTH_SHORT).show();
//                break;
        }
        dismiss();
    }
}
