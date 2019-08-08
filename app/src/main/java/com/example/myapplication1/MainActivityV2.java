package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication1.controler.MainControl;

public class MainActivityV2 extends AppCompatActivity implements NameAge {
    private MainControl control;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_v2);
        control=new MainControl(this);
    }
    public EditText getAgeField(){
        return this.findViewById(R.id.textAge);
    }
    public EditText getNameField(){
        return this.findViewById(R.id.textName);
    }
    public TextView getViewField(){
        return this.findViewById(R.id.textView);
    }
    public void save(View view) {control.saveAction();}

    public void erase(View view) {control.eraseAction();}

}
