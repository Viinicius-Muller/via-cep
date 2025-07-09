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

    public Cep(String cep, String rua, String complemento, String bairro, String cidade, String estado, String uf) {
        this.cep = cep;
        this.rua = rua;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public String getRua() {
        return rua;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getUf() {
        return uf;
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
