package Q3;

public class Politico extends Pessoa{
    
    private String sigla, numPartido;

    public Politico(Data dataNascimento, String nome, long id, String sigla, String numPartido){
        super(dataNascimento, nome, id);
        this.sigla = sigla;
        this.numPartido = numPartido;
    }

    @Override
    public String toString(){
        return super.toString() + "Sigla:" + sigla + "Numero do Partido:" + numPartido;
    }
}
