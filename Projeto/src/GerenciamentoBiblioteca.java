import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class GerenciamentoBiblioteca {
    
    private static Set<GerenciamentoBiblioteca> gerenciador = new HashSet<>();
    private Data emprestimo;
    private Aluno aluno;
    private Livro livro;

    public GerenciamentoBiblioteca(Data emprestimo, Aluno aluno, Livro livro) {
       
        this.emprestimo = emprestimo;
        this.aluno = aluno;
        this.livro = livro;

    }

    public static Aluno iniAluno() {

        Scanner sc = new Scanner(System.in);

        String nome, numeroMatricula;

        System.out.println("Informe o nome do aluno: ");
        nome = sc.nextLine();

        System.out.println("Informe o numero de matricula");
        numeroMatricula = sc.nextLine();

        sc.close();

        Aluno aluno = new Aluno(nome, numeroMatricula);

        return aluno;

    }

    public static Livro iniLivro() {

        Scanner sc = new Scanner(System.in);

        int codISBN;
        String titulo;

        System.out.println("Informe o codigo do livro: ");
        codISBN = sc.nextInt();

        System.out.println("Informe o titulo do livro");
        titulo = sc.nextLine();

        sc.close();

        Livro livro = new Livro(codISBN, titulo);

        return livro;

    }

    public static Data iniData() {

        Scanner sc = new Scanner(System.in);
        int dia, mes, ano;

        System.out.println("Informe a data:");
        dia = sc.nextInt();
        mes = sc.nextInt();
        ano = sc.nextInt();

        sc.close();

        Data data = new Data(dia, mes, ano);

        return data;

    }

    public static GerenciamentoBiblioteca criarEmprestimo() {

        GerenciamentoBiblioteca emp = new GerenciamentoBiblioteca(iniData(), iniAluno(), iniLivro());
        return emp;
    }

    public static void emprestar() {

        gerenciador.add(criarEmprestimo());

    }

    public static void printLivrosEmp() {

        for (GerenciamentoBiblioteca geren : gerenciador) {
            System.out.println(geren.toString());
        }

    }

    public GerenciamentoBiblioteca localizandoEmp(int codISBN) {
        for (GerenciamentoBiblioteca emp : gerenciador) {
            if (livro.getCodISBN() == codISBN) {
                return emp;
            }
        }
        return null;
    }

    public  void devolucao(int codISBN) {

        GerenciamentoBiblioteca emp = localizandoEmp(codISBN);

        if (livro != null) {
            gerenciador.remove(emp);
        } else {
            throw new IllegalArgumentException("Livro não encontrado!");
        }
    }

    @Override
    public String toString() {
        return "Data: " + emprestimo.toString() + "\nAluno: " + aluno.imprimirAluno() + "\nLivro: "
                + livro.imprimirLivro();
    }
}
