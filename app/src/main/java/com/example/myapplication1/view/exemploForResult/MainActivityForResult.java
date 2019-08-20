package com.example.myapplication1.view.exemploForResult;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.myapplication1.R;
import com.example.myapplication1.controler.MainControlForResult;

public class MainActivityForResult extends AppCompatActivity {
private MainControlForResult control;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_for_result);
        control=new MainControlForResult(this);
    }
    public void telaDadoPessoais (View view){

    }
    public void telaEndereco (View view){

    }
    public void telaResultado (View view){

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

    }
}
