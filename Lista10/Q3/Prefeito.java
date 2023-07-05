package Q3;

public class Prefeito extends Politico {
    private String cidade;

    public Prefeito(Data dataNascimento, String nome, long id, String sigla, String numPartido, String cidade){
        super(dataNascimento, nome, id, sigla, numPartido);
        this.cidade = cidade;
    }

    @Override
    public String toString(){
        return super.toString() + "Cidade: " + cidade;
    }
}
