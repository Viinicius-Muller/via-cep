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
    private String ddd;

    @Override
    public String toString() {
        return "Cep{" +
                "cep='" + cep + '\'' +
                ", rua='" + rua + '\'' +
                ", complemento='" + complemento + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                ", uf='" + uf + '\'' +
                ", ddd='" + ddd + '\'' +
                '}';
    }
}
