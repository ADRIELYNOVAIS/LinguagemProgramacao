package Q2;

public class ChefeDepartamento extends Funcionario {
    private String departamento;
    private Data promocao;

    public ChefeDepartamento( Data dataNascimento, String nome, long id, Data admissao, float salario, Data promocao, String departamento){
        super(dataNascimento, nome, id, admissao, salario);
        this.promocao = promocao;
        this.departamento = departamento;
    }

    public String getDepartamento(){
        return this.departamento;
    }

    @Override
    public String toString(){
        return super.toString()+ "Departamento:" + departamento + "Data Promocao:" + promocao;
    }

    @Override
    public float calculaEmprestimo(){
       return 3*super.calculaEmprestimo();
    }


}
