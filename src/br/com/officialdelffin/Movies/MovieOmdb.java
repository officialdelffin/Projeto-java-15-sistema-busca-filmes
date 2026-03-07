
// Pacotes :
package br.com.officialdelffin.Movies;


// Um record feito para atribuir e guardar as informações do Json dentro dos atributos :
public record MovieOmdb(String title, String year , String released, String runtime, String genre, String director, String writer, String plot ) {}
