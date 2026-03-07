
// Pacotes :
package br.com.officialdelffin.Movies;


// Importações :
import com.google.gson.annotations.SerializedName;


// Classe resposável por criar objetos de filmes :
public class Movies {


    // Construtores :
    public Movies (String titleP, String yearP, String releasedP , String runtimeP, String genreP, String directorP, String writerP, String plotP) {


        this.title = titleP;
        this.year = yearP;
        this.released = releasedP;
        this.runtime = runtimeP;
        this.genre = genreP;
        this.director = directorP;
        this.writer = writerP;
        this.plot = plotP;


    }


    // Atributos :

    // Atributos de filmes :]

    private String title;
    private String year;
    private String released;
    private String runtime;
    private String genre;
    private String director;
    private String writer;
    private String plot;


    // Atributo para formatação de texto :
    private String textFormatting;
    private String textFormattiongFinal;


    // Métodos :

    // Sobreescrevendo metodo toString :
    @Override
    public String toString() {


        // Definindo a formatação do texto :
        textFormatting = """
                
                Nome : %s
                
                Ano de Lançamento : %s
                
                Lançamento : %s
                
                Tempo de filme : %s
                
                Gênero : %s
                
                Diretor : %s
                
                Escritor : %s
                
                Trama : %s
                
                """;

        // Armazenando a formatação do texto em uma variavel :
        textFormattiongFinal = String.format(textFormatting, title, year, released, runtime, genre, director, writer, plot);


        // Retornando o texto formatado :
        return textFormattiongFinal;


    }


}
