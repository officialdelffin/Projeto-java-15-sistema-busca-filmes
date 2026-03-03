
// Pacotes :
package br.com.officialdelffin.Movies;


// Importações :
import com.google.gson.annotations.SerializedName;


// Classe resposável por criar objetos de filmes :
public class Movies {


    // Atributos :

    // Atributos de filmes :]

    @SerializedName("Title")
    private String title;

    @SerializedName("Year")
    private String year;

    @SerializedName("Released")
    private String released;

    @SerializedName("Runtime")
    private String runtime;

    @SerializedName("Genre")
    private String genre;

    @SerializedName("Director")
    private String director;

    @SerializedName("Writer")
    private String writer;

    @SerializedName("Plot")
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
