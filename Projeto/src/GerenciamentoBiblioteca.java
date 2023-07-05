import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class GerenciamentoBiblioteca {
    
    private  Set<GerenciamentoBiblioteca> gerenciador = new HashSet<>();
    private Data emprestimo;
    private Aluno aluno;
    private Livro livro;

    public GerenciamentoBiblioteca(Data emprestimo, Aluno aluno, Livro livro) {
        this.emprestimo = emprestimo;
        this.aluno = aluno;
        this.livro = livro;
    }

    public GerenciamentoBiblioteca(){
        
    }

    public Aluno iniAluno() {
        Scanner sc = new Scanner(System.in);
        String nome, numeroMatricula;

        System.out.println("Informe o nome do aluno: ");
        nome = sc.nextLine();

        System.out.println("Informe o número de matrícula: ");
        numeroMatricula = sc.nextLine();

        Aluno aluno = new Aluno(nome, numeroMatricula);
        return aluno;
    }

    public  Livro iniLivro() {
        Scanner sc = new Scanner(System.in);
        int codISBN;
        String titulo;

        System.out.println("Informe o código do livro: ");
        codISBN = sc.nextInt();

        System.out.println("Informe o título do livro: ");
        titulo = sc.nextLine();

        Livro livro = new Livro(codISBN, titulo);
        return livro;
    }

    public Data iniData() {
        Scanner sc = new Scanner(System.in);
        int dia, mes, ano;

        System.out.println("Informe a data: ");
        dia = sc.nextInt();
        mes = sc.nextInt();
        ano = sc.nextInt();

        Data data = new Data(dia, mes, ano);
        return data;
    }

    public  GerenciamentoBiblioteca criarEmprestimo() {
        GerenciamentoBiblioteca emp = new GerenciamentoBiblioteca(iniData(), iniAluno(), iniLivro());
        return emp;
    }

    public void emprestar() {
        gerenciador.add(criarEmprestimo());
    }

    public  void printLivrosEmp() {
        for (GerenciamentoBiblioteca geren : gerenciador) {
            System.out.println(geren.toString());
        }
    }

    public GerenciamentoBiblioteca localizarEmprestimo(int codISBN) {
        for (GerenciamentoBiblioteca emp : gerenciador) {
            if (livro.getCodISBN() == codISBN) {
                return emp;
            }
        }
        return null;
    }

    public void devolucao() {
        int codISBN;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o código do livro: ");
        codISBN = sc.nextInt();
        GerenciamentoBiblioteca emp = localizarEmprestimo(codISBN);
        if (emp != null) {
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
