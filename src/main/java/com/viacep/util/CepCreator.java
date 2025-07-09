package com.viacep.util;

import com.viacep.domain.Cep;

public class CepCreator {
    static GsonDeserializer<Cep> cepGsonDeserializer = new GsonDeserializer<>();

    public static Cep createCep(String insertedCep) {
        String apiURI = "https://viacep.com.br/ws/"+insertedCep+"/json/";
        String json = ApiGet.getJson(apiURI);

        return cepGsonDeserializer.deserialization(json, Cep.class);
    }
}
