package com.example.myapplication1.controler;

import android.app.Activity;
import android.content.Intent;
import android.widget.EditText;
import com.example.myapplication1.R;
import com.example.myapplication1.model.vo.Endereco;

public class EnderecoControl {
    private Activity activity;
    private EditText editCep;
    private EditText editCidade;

    public EnderecoControl(Activity activity){
        this.activity=activity;
        initComponents();
        carregarForm()
    }

    private void initComponents() {
        editCep= activity.findViewById(R.id.edit_cep);
        editCidade= activity.findViewById(R.id.edit_cidade);
    }

    public  void carregarForm(){
        Endereco e=(Endereco)activity.getIntent().getSerializableExtra(Constants.Parametros.ENDERECO);
        editCep.setText(e.getCep());
        editCidade.setText(e.getCidade());
    }
    private Endereco getDadosForm(){
        Endereco e =new Endereco();
        e.setCep(editCep.getText().toString());
        e.setCidade(editCidade.getText().toString());
        return e;
    }
    public void enviaAction(){
        Endereco e =getDadosForm();
        if(valida(e)){
            Intent it =new Intent();
        }
    }

    private boolean valida(Endereco e) {
        return true;
    }


}
