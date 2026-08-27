package com.example.ApiClima.service;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class Service {

    private static final String BASE_URL_BH = "https://api.open-meteo.com/v1/forecast?latitude=-19.9167&longitude=-43.9345&current=temperature_2m";
    private static final String BASE_URL = "https://geocoding-api.open-meteo.com/v1/search?name=";

    private String consultarURL(String apiUrl){
        String dados = "";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(apiUrl, String.class);
        if (responseEntity.getStatusCode().is2xxSuccessful()) {
            dados = responseEntity.getBody();
        } else {
            dados = "Falha ao obter dados. Código de status: " + responseEntity.getStatusCode();
        }
        return dados;
    }

    public String consultarTemperaturaBH() {
        return consultarURL(BASE_URL_BH);
    }
    public String consultarTemperatura(String cidade) {
        return consultarURL(BASE_URL + cidade + "&count=1&language=pt&format=json");
    }
}