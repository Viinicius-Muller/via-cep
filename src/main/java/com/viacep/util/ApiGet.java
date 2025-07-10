package com.viacep.util;

import com.viacep.exceptions.APIException;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiGet {
    public static String getJson(String api) {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI(api))
                    .GET()
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.body().contains("\"erro\": \"true\"")) { //Failed to find CEP
                throw new APIException("CEP não encontrado");
            }
            if (response.statusCode() == 200) return response.body();

            System.out.println("Erro | CEP inválido: " + response.statusCode());

        } catch (APIException e) {
            System.out.println("Erro: "+e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro durante a requisição HTTP: "+e.getMessage());
        }

        return null;
    }
}
