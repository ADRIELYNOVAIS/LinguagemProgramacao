package Q2;

public class Funcionario extends Pessoa {
    private float salario;
    private Data admissao;

    public Funcionario( Data dataNascimento, String nome, long id, Data admissao, float salario ){
        super(dataNascimento, nome, id);
        this.admissao = admissao;
        this.salario = salario;
        
    }

    private float qualSalario(){
        return salario;
    }

    @Override
    public String toString(){
        return super.toString() + " Salario:" + salario + " Data admissao:" + this.admissao;
    }

    @Override
    public float calculaEmprestimo(){
        float empSal = qualSalario();
        return super.calculaEmprestimo() + empSal;
    }

}
