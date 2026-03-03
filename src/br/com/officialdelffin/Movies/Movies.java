
// Pacotes :
package br.com.officialdelffin.Movies;


// Classe resposável por criar objetos de filmes :
public class Movies {


    // Atributos :

    private String title;
    private String year;
    private String released;
    private String runtime;
    private String genre;
    private String director;
    private String writer;
    private String plot;

    private String textFormatting;


    // Métodos :

    // Sobreescrevendo metodo toString :
    @Override
    public String toString() {


        textFormatting = """
                
                Nome : %s
                
                Ano de Lançamento : %s
                
                Lançamento : %s
                
                Tempo de filme : %s
                
                Gênero : %s
                
                Diretor : %s
                
                Escritor : %s
                
                Trama : %s
                
                """ ;


        return textFormatting;


    }


}
