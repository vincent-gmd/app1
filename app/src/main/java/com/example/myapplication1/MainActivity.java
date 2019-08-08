package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
private MainControl control;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        control=new MainControl(this);
    }

    public void save(View view) {
        control.saveAction(view);
    }

    public void erase(View view) {
        control.eraseAction(view);

    }
}
