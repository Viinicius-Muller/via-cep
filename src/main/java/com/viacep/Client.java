package com.viacep;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.viacep.domain.Cep;
import com.viacep.util.ApiGet;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Client {
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public static void main(String[] args) throws URISyntaxException {

    }
}
