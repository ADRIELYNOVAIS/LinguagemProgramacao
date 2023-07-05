package Q3;

public class Governador extends Politico {
    private String estado;

    public Governador(Data dataNascimento, String nome, long id, String sigla, String numPartido, String estado){
        super(dataNascimento, nome, id, sigla, numPartido);
        this.estado = estado;
    }

    @Override
    public String toString(){
        return super.toString() + "Estado: " + estado;
    }
}
