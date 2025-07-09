package com.viacep;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.viacep.domain.Cep;
import com.viacep.util.ApiGet;
import com.viacep.util.GsonDeserializer;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Client {
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws URISyntaxException {
        System.out.print("Insira o cep a ser testado: ");
        String insertedCep = scanner.nextLine();

        String apiURI = "https://viacep.com.br/ws/"+insertedCep+"/json/";

        GsonDeserializer<Cep> cepGsonDeserializer = new GsonDeserializer<>();

        String json = ApiGet.getJson(apiURI);
        Cep cep = cepGsonDeserializer.deserialization(json, Cep.class);
        System.out.println(cep);
    }
}
