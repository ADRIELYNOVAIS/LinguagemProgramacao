package Lista09;

public class Livro {

    private String titulo, autor;
    private Data anoPublicacao;
    private int numeroPagina;

    Livro( Data data,String titulo, String autor, int numeroPagina ) {

        data = anoPublicacao; // tem que ser a primeira atribuicao
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPagina = numeroPagina;
        
        //this.nomeFeriado = (nomeFeriado != null && !nomeFeriado.trim().isEmpty()) ? nomeFeriado : "Sem nome";

    }

    public static Livro livroMaisVelho(Livro livro1, Livro livro2) {
        //data de publicacao de livro1 e anterior a data de publicacao de livro2
        if (livro1.anoPublicacao.isMaisAntiga(livro2.anoPublicacao)) {
            return livro1;
        } else {
            return livro2;
        }
    } 
    
    @Override
    public String toString(){
        //delegar a responsabilidade da impressao da data para a classe data
        return  "Ano de publicacao: "+ anoPublicacao.toStringLong()+" Titulo Livro: "+ titulo +" Autor: " + autor + "Numero de Pagina :" + numeroPagina;
    }

}
