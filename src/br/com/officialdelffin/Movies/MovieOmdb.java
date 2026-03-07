
// Pacotes :
package br.com.officialdelffin.Movies;


// Um record feito para atribuir e guardar as informações do Json dentro dos atributos :
public record MovieOmdb(String title, String year , String released, String runtime, String genre, String director, String writer, String plot ) {


    // Sobreescrevendo metodo toString :
    @Override
    public String toString() {


        // Atributo para formatação de texto :
        String textFormatting;
        String textFormattiongFinal;


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
