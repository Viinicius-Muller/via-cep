package com.viacep.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.Type;

public class GsonDeserializer<T> {
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public T deserialization(String json, Class<T> tClass) {
        try {

            return gson.fromJson(json,tClass);
        } catch (Exception e) {
            System.out.println("Erro ao tentar deserializar JSON para a classe");
            return null;
        }
    }
}
