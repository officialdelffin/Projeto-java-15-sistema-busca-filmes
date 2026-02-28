
// Pacotes :
package br.com.officialdelffin.ConsumptionAPI;


// Importações :
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


// Classe responsável por buscar filmes na API da OMDB :
public class MovieConsultation {


    // Atributos :

    String path ;




    // Metodos

    // Executa uma busca ne filme de um web service :
    public void movieConsultation () throws IOException, InterruptedException {


        // Configurações dos atributos de API :

        // Definindo o Agent que vai fazer a request :
        HttpClient client = HttpClient.newHttpClient();


        // Definindo o caminho da request
        HttpRequest request = HttpRequest.newBuilder()

                .uri(URI.create(path))
                .build();


        // Armazenando a busca do Agent
        HttpResponse<String> response = client


                // Fazendo a request e passando a response para String :
                .send(request , HttpResponse.BodyHandlers.ofString());


        // Exibindo o resultado da busca :
        System.out.println(response.body());
    }

}
