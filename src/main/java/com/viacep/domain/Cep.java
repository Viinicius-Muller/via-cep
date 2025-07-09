package com.viacep.domain;

import com.google.gson.annotations.SerializedName;

public class Cep {
    private String cep;
    @SerializedName("logradouro")
    private String rua;
    private String complemento;
    private String bairro;
    @SerializedName("localidade")
    private String cidade;
    private String estado;
    private String uf;

    public String getCep() {
        return cep == null ? "Não encontrado" : cep;
    }

    public String getRua() {
        return rua == null ? "Não encontrado" : rua;
    }

    public String getComplemento() {
        return complemento == null ? "Não encontrado" : complemento;
    }

    public String getBairro() {
        return bairro == null ? "Não encontrado" : bairro;
    }

    public String getCidade() {
        return cidade == null ? "Não encontrado" : cidade;
    }

    public String getEstado() {
        return estado == null ? "Não encontrado" : estado;
    }

    public String getUf() {
        return uf == null ? "Não encontrado" : uf;
    }

    @Override
    public String toString() {
        return "CEP: "+getCep()+"\n"+
                "Rua: "+getRua()+"\n"+
                "Complemento: "+getComplemento()+"\n"+
                "Bairro: "+getBairro()+"\n"+
                "Cidade: "+getCidade()+"\n"+
                "Estado: "+getEstado()+"\n"+
                "UF: "+getUf();
    }
}
