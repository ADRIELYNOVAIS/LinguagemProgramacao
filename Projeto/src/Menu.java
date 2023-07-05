import java.io.IOException;
import java.util.Scanner;

public class Menu {

    private static Scanner scanner = new Scanner(System.in);

    public static void clear() throws InterruptedException, IOException {
        if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            Runtime.getRuntime().exec("clear");
    }

    public static int crudMenu() {

        System.out.println("Escolha uma opção: \n");
        System.out.println("1- Create");
        System.out.println("2- Read");
        System.out.println("3- Update");
        System.out.println("4- Delete");
        System.out.println("5- Visualizar");
        System.out.println("6- Voltar ao Menu inicial\n");

        int opcaoCRUD = scanner.nextInt();
        scanner.nextLine();

        if (opcaoCRUD == 6) {
            return 0;
        } else if (opcaoCRUD < 1 || opcaoCRUD > 5) {
            System.out.println("Opção inválida");
            return 5;
        } else {
            return opcaoCRUD;
        }
    }

    public static int principalMenu() {

        System.out.println("Escolha uma opção:\n ");
        System.out.println("1- Aluno");
        System.out.println("2- Livro");
        System.out.println("3- Gerenciador Biblioteca");
        System.out.println("0- Encerrar\n");

        int opcao = scanner.nextInt();
        scanner.nextLine();

        return opcao;
    }

    public static void main(String[] args) throws InterruptedException, IOException {

        int opcao;

        do {
            opcao = principalMenu();

            switch (opcao) {

                case 1:

                    System.out.println("ALUNO");
                    CRUDAluno alunoCRUD = new CRUDAluno();
                    int opcaoCRUD;

                    do {
                        opcaoCRUD = crudMenu();

                        switch (opcaoCRUD) {

                            case 1:

                                alunoCRUD.createAluno();
                                break;
                            case 2:

                                Aluno aluno = alunoCRUD.readAluno();
                                if (aluno != null) {
                                    System.out.println("Aluno encontrado: " + aluno.toString());
                                } else {
                                    System.out.println("Aluno não encontrado");
                                }
                                break;
                            case 3:

                                alunoCRUD.upAluno();
                                break;
                            case 4:

                                alunoCRUD.deleteAluno();
                                break;
                            case 5:

                                alunoCRUD.printAlunos();
                                break;

                            case 0:
                                break;

                            default:
                                System.out.println("Opção inválida");
                        }

                    } while (opcaoCRUD != 0);

                    break;

                case 2:

                    System.out.println("LIVRO");
                    CRUDLivro livroCRUD = new CRUDLivro();
                    int op;

                    do {
                        op = crudMenu();

                        switch (op) {

                            case 1:

                                livroCRUD.createLivro();
                                break;

                            case 2:

                                Livro livro = livroCRUD.readLivro();
                                if (livro != null) {
                                    System.out.println("Livro encontrado: " + livro.toString());
                                } else {
                                    System.out.println("Livro não encontrado");
                                }
                                break;

                            case 3:

                                livroCRUD.upLivro();
                                break;

                            case 4:

                                livroCRUD.deleteLivro();
                                break;

                            case 5:

                                livroCRUD.printLivros();
                                break;

                            case 0:
                                break;

                            default:
                                System.out.println("Opção inválida");
                        }
                    } while (op != 0);

                    break;

                case 3:

                    int opEmp;

                    System.out.println("GERENCIADOR\n");
                    System.out.println("Escolha uma opção:\n ");
                    System.out.println("1- Emprestar um livro");
                    System.out.println("2- Ver livros emprestados");
                    System.out.println("3- Registrar devolução de Livro");
                    System.out.print("- Voltar ao menu principal\n");

                    opEmp = scanner.nextInt();

                    do {

                        switch (opEmp) {

                            case 1:
                                GerenciamentoBiblioteca.emprestar();
                                break;

                            case 2:
                                GerenciamentoBiblioteca.printLivrosEmp();
                                break;

                            case 3:

                                // GerenciamentoBiblioteca.devolucao(12);
                                break;

                            case 0:
                                break;

                            default:
                                System.out.println("Opção inválida");
                                break;
                        }
                    } while (opEmp != 0);

                case 0:
                    break;

                default:
                    System.out.println("Opção inválida");
            }
        } while (opcao != 0);

    }
}
