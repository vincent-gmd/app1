package com.example.myapplication1.controler;

import android.app.Activity;
import android.content.Intent;
import android.widget.TextView;

import com.example.myapplication1.model.vo.DadoPessoal;
import com.example.myapplication1.model.vo.Endereco;
import com.example.myapplication1.model.vo.PessoaForResult;
import com.example.myapplication1.R;
import com.example.myapplication1.view.exemploForResult.DadoPessoalActivity;
import com.example.myapplication1.view.exemploForResult.EnderecoActivity;

public class MainControlForResult {
    private PessoaForResult pessoa;
    private Activity activity;
    private TextView textViewTeste;
    public MainControlForResult(Activity activity) {
        this.activity=activity;
        pessoa =new PessoaForResult();
        this.textViewTeste=activity.findViewById(R.id.textViewTeste);
    }

    public void telaEnderecoAction() {
        Intent it =new Intent(activity, EnderecoActivity.class);
        it.putExtra(Constants.Parametros.ENDERECO,pessoa.getEndereco());
        activity.startActivityForResult(it,Constants.Request.ENDERECO);

    }

    public void telaDadoPessoalAction() {
        Intent it =new Intent(activity, DadoPessoalActivity.class);
        it.putExtra(Constants.Parametros.DADO_PESSOAL,pessoa.getDadoPessoal());
        activity.startActivityForResult(it,Constants.Request.DADO_PESSOAL);
    }

    public void telsResultadoAction() {

    }

    public void onActivityResult(int requesrtCode, int resultCode, Intent data) {
        if (resultCode == activity.RESULT_OK) {
            switch (requesrtCode) {
                case Constants.Request.ENDERECO:
                    Endereco endereco = (Endereco) data.getSerializableExtra(Constants.Parametros.ENDERECO);
                    pessoa.setEndereco(endereco);
                    break;
                case Constants.Request.DADO_PESSOAL:
                    DadoPessoal dadoPessoal = (DadoPessoal) data.getSerializableExtra(Constants.Parametros.DADO_PESSOAL);
                    pessoa.setDadoPessoal(dadoPessoal);
                    break;
            }
        }else if (resultCode == activity.RESULT_CANCELED) {


        }
    }
}
