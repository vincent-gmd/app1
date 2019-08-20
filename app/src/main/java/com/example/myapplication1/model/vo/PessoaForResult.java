package com.example.myapplication1.model.vo;

import java.io.Serializable;

public class PessoaForResult implements Serializable {
    private DadoPessoal dadoPessoal;
    private Endereco endereco;
    public PessoaForResult(){
        dadoPessoal=new DadoPessoal();
        endereco=new Endereco();
    }
    public PessoaForResult(DadoPessoal dadoPessoal,Endereco endereco){
        this.dadoPessoal=dadoPessoal;
        this.endereco=endereco;
    }

    public DadoPessoal getDadoPessoal() {
        return dadoPessoal;
    }

    public void setDadoPessoal(DadoPessoal dadoPessoal) {
        this.dadoPessoal = dadoPessoal;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    @Override
    public String toString(){
        return dadoPessoal.toString()+"\n" +
                ""+endereco.toString();
    }

}
