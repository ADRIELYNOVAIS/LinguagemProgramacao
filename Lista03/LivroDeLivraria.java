public class LivroDeLivraria extends Livro {
    private int quantidadeEmEstoque;

    public void inicializarLivraria( String autor, String titulo, int ISBN, int edicao, int anoPublicacao, int quantidadeEmEstoque) {
        // nao esta trazendo os valores da classe Livro ( ver isso )
        if( validation( quantidadeEmEstoque )){
          this.quantidadeEmEstoque = quantidadeEmEstoque;
          autor = autor;
          titulo = titulo;
          ISBN = ISBN;
          edicao = edicao;
          anoPublicacao = anoPublicacao;
        }else{
            autor = "";
            titulo = "";
            ISBN = 0;
            edicao = 0;
            anoPublicacao = 0;
            quantidadeEmEstoque =0;
        }

    }

    private boolean validation( int quantidade ){
        if(quantidade>0){
            return true;
        } return false;
    }
    
    public void renovarEstoque( int quantidade ) {
        if(validation(quantidade)){
        quantidadeEmEstoque += quantidade;
    }
    }

    public void retirar( int quantidade ) {
        if(validation(quantidade)){
        quantidadeEmEstoque -= quantidade;
    }
    }

    public void venderLivro( int quantidade ) {

        if(validation(quantidade)){
        if ( quantidade <= quantidadeEmEstoque ) {
            retirar( quantidade );
        } }
    }

    public void mostrar() {
        super.mostrarLivro();
        System.out.println("\nQuantidade em estoque: " + quantidadeEmEstoque);
    }
    
    
}
