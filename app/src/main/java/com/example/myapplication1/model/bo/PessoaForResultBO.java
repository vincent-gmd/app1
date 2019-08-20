package com.example.myapplication1.model.bo;

import com.example.myapplication1.model.vo.PessoaForResult;

public class PessoaForResultBO {
    public static boolean validaNome(PessoaForResult p){
        return p.getDadoPessoal().getNome()!=null&& !p.getDadoPessoal().getNome().isEmpty();
    }
    public static boolean validaIdade(PessoaForResult p){
        return p.getDadoPessoal().getIdade()!=null&& p.getDadoPessoal().getIdade()>=0;
    }
    public static boolean validaCep(PessoaForResult p){
        return p.getEndereco().getCep()!=null&& p.getEndereco().getCep().length()==9;
    }
    public static boolean validaCidade(PessoaForResult p){
        return p.getEndereco().getCidade()!=null&& !p.getEndereco().getCidade().isEmpty();
    }

}
