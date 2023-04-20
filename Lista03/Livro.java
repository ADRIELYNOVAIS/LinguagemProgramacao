public class Livro {
    private String autor, titulo;
    private int ISBN, edicao, anoPublicacao; //ISBN é o id do livro, nao criar o setter para ele (qual a melhor forma de tratar id?)

    public void inicializar( String autor, String titulo, int ISBN, int edicao, int anoPublicacao ){
        
        if( validationLivro( edicao, anoPublicacao) ){
            this.autor = autor;
            this.titulo = titulo;
            this.ISBN = ISBN;
            this.edicao = edicao;
            this.anoPublicacao = anoPublicacao;
    } else{
            this.autor = "";
            this.titulo = "";
            this.ISBN = 0;
            this.edicao = 0;
            this.anoPublicacao = 0;
    }

    }

    private boolean validationLivro( int edicao, int anoPublicacao ){
        if( edicao >=0 && anoPublicacao > 0){
            return true;
        } return false;
    }

    public void mostrarLivro(){
        System.out.println("Autor:" +autor+"\nTitulo:"+titulo+"\nISBN:"+ISBN+"\nEdicao:"+edicao+"\nAno Publicacao:"+anoPublicacao);
    }




}
