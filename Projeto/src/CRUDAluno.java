import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class CRUDAluno extends Aluno implements InterfacesAluno {

    private static Set<Aluno> alunoVetor = new HashSet<>();

    public CRUDAluno(String nome, String email, String cpf, String telefone, String numeroMatricula) {
        super(nome, email, cpf, telefone, numeroMatricula);
    }

    public Aluno iniAluno() {
        Scanner sc = new Scanner(System.in);

        String nome, email, cpf, telefone, numeroMatricula;

        System.out.println("Informe o nome do aluno: ");
        nome = sc.nextLine();

        System.out.println("Informe o email: ");
        email = sc.nextLine();

        System.out.println("Informe o CPF: ");
        cpf = sc.nextLine();

        System.out.println("Informe o telefone: ");
        telefone = sc.nextLine();

        System.out.println("Informe o número de Matrícula: ");
        numeroMatricula = sc.nextLine();

        sc.close();

        Aluno aluno = new Aluno(nome, email, cpf, telefone, numeroMatricula);

        return aluno;

    }

    public void createAluno() {

        Aluno aluno = iniAluno();
        alunoVetor.add(aluno);

    }

    public Aluno readAluno(String numeroMatricula) {
        
        for (Aluno aluno : alunoVetor) {
            if (aluno.getMatricula().equals(numeroMatricula)) {
                return aluno;
            }
        }
        return null;
    }

    public void upAluno(String nome, String email, String cpf, String telefone, String numeroMatricula) {
       
        Aluno aluno = readAluno(numeroMatricula);

        aluno.setNome(nome);
        aluno.setEmail(email);
        aluno.setCpf(cpf);
        aluno.setTelefone(telefone);

    }

    public void deleteAluno(String matricula) {

        Aluno aluno = readAluno(matricula);

        if (aluno != null) {
            alunoVetor.remove(aluno);
        } else {
            throw new IllegalArgumentException("Aluno não encontrado!");
        }
    }

    public void printAlunos() {

        for (Aluno aluno : alunoVetor) {
            System.out.println(aluno.toString());
        }
    }
}
