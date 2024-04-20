package entities.api;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class NumerosSorteados {
    public static String sorteio() throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://loteriascaixa-api.herokuapp.com//api/megasena/latest")).build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());


        return response.body();
    }
}
