package Q2;

public class Pessoa {
   private String nome;
   private long id;
   private Data dataNascimento; 

    public Pessoa(Data dataNascimento, String nome, long id){
        this.dataNascimento = dataNascimento;
        this.id = id;
        this.nome = nome;
    }

    @Override
    public String toString(){
        return "Nome: " + nome + " ID: " + id + " Data: " + dataNascimento.toStringShort();
    }

    public float calculaEmprestimo(){
        return 1000.0f;
    }
}
