package com.example.myapplication1;

import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication1.model.bo.PessoaBO;
import com.example.myapplication1.model.vo.Pessoa;

public class MainControl {
    private  EditText textName;
    private  EditText textAge;
    private  TextView textView;
    private Activity activity;
    private PessoaBO pBO = new PessoaBO();
    public MainControl(Activity activity){

        this.activity =activity;
        initComponents();


    }

    private void initComponents() {
        this.textName = activity.findViewById(R.id.textName);
        this.textAge = activity.findViewById(R.id.textAge);
        this.textView = activity.findViewById(R.id.textView);

    }

    public void saveAction(View view) {
        
    }

    public void salvarAction() {
        Pessoa p = new Pessoa();
        p.setNome(textName.getText().toString());

        try{
            Integer idade=Integer.parseInt(textAge.getText().toString());
            p.setIdade(idade);
        }catch (NumberFormatException e){
            textAge.setError(activity.getString(R.string.erro_idade_invalida));
            Toast.makeText(
                    activity,
                    R.string.erro_idade_invalida,
                    Toast.LENGTH_SHORT).show();
            return;
        }
        if(!PessoaBO.validaIdade(p)){
            textAge.setError(activity.getString(R.string.erro_idade_invalida));
            Toast.makeText(
                    activity,
                    R.string.erro_idade_invalida,
                    Toast.LENGTH_SHORT).show();
            return;
        }


         //Saída estática
        textView.setText(pBO.toString(p));

         //Saída dinâmica
        // TextView tvNewResultado = new TextView(activity);
        // tvNewResultado.setText(pBO.toString());
        // layoutResultado.addView(tvNewResultado);
    }









    public void eraseForm(){
        textName.setText("");
        textAge.setText("");
        textName.requestFocus();
    }
    public void eraseAction(View view) {
        eraseForm();
        textView.setText("");
    }
}
