package com.viacep;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.viacep.domain.Cep;
import com.viacep.util.ApiGet;
import com.viacep.util.CepCreator;
import com.viacep.util.GsonDeserializer;

import java.net.Socket;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Client {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws URISyntaxException {
        System.out.print("Insira o CEP a ser verificado: ");
        String userCep = scanner.nextLine();

        Cep cep = CepCreator.createCep(userCep);
        if (cep != null) System.out.println(cep);

        scanner.close();
    }
}
