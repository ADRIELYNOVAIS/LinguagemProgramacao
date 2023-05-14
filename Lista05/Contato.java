package Lista05;
import java.time.LocalDate;
import java.time.Period;

public class Contato {

    private String nome, email;
    private int telefone;
    private Data dataNascimento;
    
    public Contato( String nome, String email, int telefone, Data dataNascimento ){
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
    }

    public static int calcularIdade(Data data) {
        LocalDate dataNascimento = LocalDate.of( data.getAno(), data.getMes(), data.getDia());
        LocalDate dataAtual = LocalDate.now();

        Period periodo = Period.between(dataNascimento, dataAtual);

        return periodo.getYears();
    }

    
}
