package Lista09;

public class LivroLivraria extends Livro {

    private float preco;
    private int estoque;

    LivroLivraria( Data data, String titulo, String autor , int numeroPagina , float preco, int estoque ){
        super( data, titulo, autor, numeroPagina );
        this.preco = preco;
        this.estoque = estoque;
    }

    public boolean venderLivro() {
        if(estoque > 0){
            estoque -= 1;
            return true;
        } return false;
    }

    @Override
    public String toString(){
        return super.toString() + " Preco: " + preco +" Estoque " + estoque;
    }

}