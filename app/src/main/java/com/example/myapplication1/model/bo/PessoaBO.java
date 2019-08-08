package com.example.myapplication1.model.bo;

import com.example.myapplication1.model.vo.Pessoa;

public class PessoaBO {

    public static boolean validaIdade(Pessoa p){
        return p.getIdade()!=null && p.getIdade()>0;
    }
    public static boolean isMaioridade(Pessoa pessoa){
        return pessoa.getIdade()>=18;
    }
    public static String getTextoMaioridade(Pessoa pessoa){
        if(isMaioridade(pessoa))
            return "Sim";
        else
            return "Não";
    }
    public static String toString(Pessoa pessoa) {
        String res;
        res  = "Nome:  " + pessoa.getNome()+"\n";
        res += "Idade: " + pessoa.getIdade() + "\n";
        res += "Maioridade: " + getTextoMaioridade(pessoa);
        res += "Pode votar: " + getTextoPodeVotar(pessoa);

        return res;
    }
    public static boolean podeVotar(Pessoa pessoa){
        return pessoa.getIdade()>=16;
    }
    public static String getTextoPodeVotar(Pessoa pessoa){
        if(isMaioridade(pessoa))
            return "Sim";
        else
            return "Não";
    }

}
