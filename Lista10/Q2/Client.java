package Q2;

public class Client {
    public static void main(String[] args) {
       
        Data dataNasc = new Data(30, 12, 2000);
        Pessoa pessoa = new Pessoa(dataNasc, "Maria", 0);
        System.out.println(pessoa.toString());
        System.out.println(pessoa.calculaEmprestimo());

        Data dataAdmissao = new Data(20, 11, 2020);
        Funcionario funcionario = new Funcionario(dataNasc, "Maria", 0, dataAdmissao, 2.5f);
        System.out.println(funcionario.toString());
        System.out.println(funcionario.calculaEmprestimo());

        Data dataPromocao = new Data(15, 10, 2021);
        ChefeDepartamento chefDep = new ChefeDepartamento(dataNasc, "Maria", 0, dataAdmissao, 30000.0f, dataPromocao, "Administrativo");
        System.out.println(chefDep.toString());
        System.out.println(chefDep.calculaEmprestimo());
    }
}
