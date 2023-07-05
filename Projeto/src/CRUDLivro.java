import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class CRUDLivro extends Livro implements InterfacesLivro {

    private static Set<Livro> LivroVetor = new HashSet<>();

    public CRUDLivro(int codISBN, String titulo, String autor, int numeroPaginas) {
        super(codISBN, titulo, autor, numeroPaginas);
    }

    public Livro iniLivro() {

        Scanner sc = new Scanner(System.in);

        String titulo, autor;
        int codISBN, numeroPaginas;

        System.out.println("Informe o titulo: ");
        titulo = sc.nextLine();

        System.out.println("Informe o nome do autor:");
        autor = sc.nextLine();

        System.out.println("Informe o ISBN");
        codISBN = sc.nextInt();

        System.out.println("Informe o numero de paginas:");
        numeroPaginas = sc.nextInt();

        sc.close();

        Livro Livro = new Livro(codISBN, titulo, autor, numeroPaginas);

        return Livro;

    }

    public void createLivro() {

        Livro Livro = iniLivro();
        LivroVetor.add(Livro);

    }

    public Livro readLivro(int codISBN) {
        for (Livro livro : LivroVetor) {
            if (livro.getCodISBN() == codISBN) {
                return livro;
            }
        }
        return null;
    }

    public void upLivro(int codISBN, String titulo, String autor, int numeroPaginas) {
        Livro livro = readLivro(codISBN);
        livro.setTitulo(titulo);
        livro.setAutor(autor);
        livro.setNumeroPaginas(numeroPaginas);

    }

    public void deleteLivro(int codISBN) {
        Livro livro = readLivro(codISBN);

        if (livro != null) {
            LivroVetor.remove(livro);
        } else {
            throw new IllegalArgumentException("Livro não encontrado!");
        }
    }

    public void printLivros() {
        for (Livro livro : LivroVetor) {
            System.out.println(livro.toString());
        }
    }
    
}
