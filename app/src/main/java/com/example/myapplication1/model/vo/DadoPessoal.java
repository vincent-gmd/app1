package com.example.myapplication1.model.vo;

import java.io.Serializable;

public class DadoPessoal implements Serializable {
    private String nome;
    private Integer idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    public void setIdade(String idade) {
        try {
            this.idade =Integer.parseInt( idade);
        }catch (NumberFormatException e){
            this.idade = null;
        }

    }

    @Override
    public String toString(){
        return "nome: "+nome+"\n" +
                "idade: "idade;
    }

}
