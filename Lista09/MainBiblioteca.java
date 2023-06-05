package Lista09;

public class MainBiblioteca {
    public static void main(String []args){

        Data anoPublicacao = new Data(17, 02, 1937); //1937
        Data dataDevolucao = new Data(02, 06, 2023);
        LivroBiblioteca livro = new LivroBiblioteca(anoPublicacao, "Capitaes de Areia", "Jorge Amado", 280, dataDevolucao);
       
        System.out.println("Informacoes do Livro: "+ livro.toString());
    }
}
