package com.example.myapplication1.model.vo;

import java.io.Serializable;

public class Endereco implements Serializable {
    private String cep;
    private String cidade;

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString(){
        return "CEP: "+cep +"\n" +
                "Cidsade: "+cidade;
    }

}
