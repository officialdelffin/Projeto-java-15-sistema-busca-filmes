
// Pacotes :
package br.com.officialdelffin.ConsoleUI;


// Importações :
import br.com.officialdelffin.ConsumptionAPI.MovieConsultation;
import java.io.IOException;
import java.util.Scanner;


// Classe responsável por getenciar as escolhas e interações com o usuário :
public class MenuHandler {


    // Atributos :

    private String name;
    private String path;


    // Faz a inteção do usuário dentro do sistema :
    public void interactWithUser () throws IOException, InterruptedException {


        // Intancias :

        var inputUser = new Scanner(System.in);
        var querySystem = new MovieConsultation();


        // Recebe e armazena qual filme o usuário quer :
        System.out.println("Digite o nome do filme que você deseja consultar :" + "\n");
        name = inputUser.nextLine();


        // Chamando o métodp que cria uma rota :
        definingRote(name);


        // Chamando sistema de consulta de filmes para buscar na API :
        querySystem.movieConsultation(path);


    }


    // Cria a rota para o metodo movieConsultion buscar os dados :
    public void definingRote (String nameP) {


        // Armazenando os paramentros para os atributos :
        this.name = nameP;


        // Criando rota :
        path = "https://www.omdbapi.com/?t=" + name + "&apikey=49ebfa25";


    }


}
