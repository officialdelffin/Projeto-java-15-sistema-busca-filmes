
// Pacotes :
package br.com.officialdelffin.Movies;


import com.google.gson.annotations.SerializedName;

// Classe resposável por criar objetos de filmes :
public class Movies {


    // Atributos :

    // Atributos de filmes :]

    @SerializedName("Title")
    private String title;

    @SerializedName("")
    private String year;

    @SerializedName("")
    private String released;

    @SerializedName("")
    private String runtime;

    @SerializedName("")
    private String genre;

    @SerializedName("")
    private String director;

    @SerializedName("")
    private String writer;

    @SerializedName("")
    private String plot;


    // Atributo para formatação de texto :
    private String textFormatting;
    private String textFormattiongFinal;


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

        textFormattiongFinal = String.format(textFormatting, title, year, released, runtime, genre, director, writer , plot);


        return textFormattiongFinal;


    }


}
