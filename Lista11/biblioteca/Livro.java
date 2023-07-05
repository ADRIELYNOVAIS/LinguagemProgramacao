package Lista11.biblioteca;

public class Livro implements ItemBiblioteca{
   private String titulo, autor;
   private int nroPaginas, anoEdicao;
   
   public Livro( String titulo, String autor, int nroPaginas, int anoEdicao){
        this.titulo = titulo;
        this.autor = autor;
        this.nroPaginas = nroPaginas;
        this.anoEdicao = anoEdicao;
   }

   public String getTitulo(){
        return this.titulo;
   }

   public String getAutor(){
        return this.autor;
   }

   @Override
   public String toString(){
       return "Titulo: " + getTitulo() + "Autor " + getAutor() + "Numero de Paginas:" + nroPaginas + "Ano Edicao:"+ anoEdicao;
   }

   public boolean emprestado(){
        return true;
   }

    public void emprestar(){
        if(!emprestado()){
            
        }
    }

    public void devolver(){
        if(emprestado()){

        }
    }

    public String localizacao(){
        return "alguma coisa";
    }

    public String descricaoSumario(){
        return "text";
    }

}
