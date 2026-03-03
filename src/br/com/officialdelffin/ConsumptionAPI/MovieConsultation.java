
// Pacotes :
package br.com.officialdelffin.ConsumptionAPI;


// Importações :
import br.com.officialdelffin.Movies.Movies;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


// Classe responsável por buscar filmes na API da OMDB :
public class MovieConsultation {


    // Atributos :

    private String path ;
    private String response;


    // Instancias :

    Gson converterJsonObject = new Gson();
    Movies movie = new Movies();


    // Metodos

    // Executa uma busca ne filme de um web service :
    public void movieConsultation (String pathP) throws IOException, InterruptedException {


        // Armazenando parametro no atributos :
        this.path = pathP;


        // Configurações dos atributos de API :

        // Definindo o Agent que vai fazer a request :
        HttpClient client = HttpClient.newHttpClient();


        // Definindo o caminho da request
        HttpRequest request = HttpRequest.newBuilder()

                .uri(URI.create(path))
                .build();


        // Armazenando a busca do Agent
        HttpResponse<String> responseJson = client


                // Fazendo a request e passando a response para String :
                .send(request , HttpResponse.BodyHandlers.ofString());


        // Armazenando o response com o body em uma variavel :
        response = responseJson.body();


        // O movie vai chamar o converter e atribuir o response aos atributos de Movies
        movie = converterJsonObject.fromJson(response , Movies.class);


        // Exibindo o objeto filme para o usuário :
        System.out.println(movie);


    }


}
