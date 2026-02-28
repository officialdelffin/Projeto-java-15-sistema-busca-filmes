package br.com.officialdelffin.ConsumptionAPI;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class MovieConsultation {


    // Atributos :

    String path ;


    // Metodos

    public void movieConsultation () throws IOException, InterruptedException {


        // Configurações dos atributos de API :

        HttpClient client = HttpClient.newHttpClient();


        HttpRequest request = HttpRequest.newBuilder()

                .uri(URI.create("https://www.omdbapi.com/?t=harry+potter&apikey=49ebfa25"))
                .build();


        HttpResponse<String> response = client

                .send(request , HttpResponse.BodyHandlers.ofString());


    }

}
