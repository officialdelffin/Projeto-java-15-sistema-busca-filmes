
// Pacotes :
package br.com.officialdelffin.ConsoleUI;


// Importações :
import java.util.Scanner;


// Classe responsável por getenciar as escolhas e interações com o usuário :
public class MenuHandler {


    // Atributos :

    private String name;
    private String path;


    // Faz a inteção do usuário dentro do sistema :
    public void interactWithUser () {


        // Intancias :

        var inputUser = new Scanner(System.in);


        // Recebe e armazena qual filme o usuário quer :
        System.out.println("Digite o nome do filme que você deseja consultar :");
        name = inputUser.nextLine();





    }


    // Cria a rota para o metodo movieConsultion buscar os dados :
    public void definingRote (String nameP) {


        // Armazenando os paramentros para os atributos :
        this.name = nameP;


        // Criando rota :
        path = "https://www.omdbapi.com/?t=" + name + "&apikey=49ebfa25";


    }


}
