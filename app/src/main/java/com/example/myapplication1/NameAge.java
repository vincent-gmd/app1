package com.example.myapplication1;

import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public interface NameAge {
    public EditText getAgeField();

    public EditText getNameField();

    public TextView getViewField();
}