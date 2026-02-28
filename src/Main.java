// Projeto : Sitema Busca Filme em java :

/* Aplicação Java desenvolvida para consolidar conhecimentos em consumo de APIs REST. O sistema realiza requisições HTTP para busca de filmes e exibe os dados processados diretamente no terminal.
Explora o uso de HttpClient, HttpRequest e HttpResponse, focando na integração entre sistemas e manipulação de respostas externas. */


// Importações
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


// Classe princial do sismtea :
public class Main {


    // Metodo de execução pricipal do sistema :
    public static void main(String[] args) throws IOException, InterruptedException {


        // Criando o agent de request :
        HttpClient client = HttpClient.newHttpClient();


        // Criando e definindo a rota de uma request :
        HttpRequest request = HttpRequest.newBuilder()

                .uri(URI.create("https://www.omdbapi.com/?t=harry+potter&apikey=49ebfa25"))
                .build();


        // Criando o objeto que vai armazenar o response :
        HttpResponse<String> response = client


                // Enviando uma request e convertendo a resposta que vem em bits para String :
                .send(request , HttpResponse.BodyHandlers.ofString());


    }


}