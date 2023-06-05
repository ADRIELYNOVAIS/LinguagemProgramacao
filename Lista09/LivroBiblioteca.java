package Lista09;

public class LivroBiblioteca extends Livro {

    private boolean emprestado = true;
    private Data dataDevolucao;

    LivroBiblioteca( Data data, String titulo, String autor, int numeroPagina, Data dataDevolucao ){
        super( data, titulo, autor, numeroPagina );
        this.dataDevolucao = dataDevolucao;        
    }

    private boolean livroDisponivel(){
        if(emprestado){
            return true;
        } return false;
    }

    private boolean emprestarLivro(){
        if(livroDisponivel()){
            return true;
        } return false;
    }

    @Override
    public String toString(){
        if( emprestarLivro() ){
            return super.toString() + "Data de devolucao: "+ dataDevolucao.toStringLong() ;
        } else {
            return super.toString();
        }  
       
    }
}