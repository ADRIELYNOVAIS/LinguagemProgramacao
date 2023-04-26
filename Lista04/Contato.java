
public class Contato {
    private String nome, email;
    private int telefone, dataNascimento;

    public Contato( String nome, String email, int telefone, int dataNascimento ){
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
    }

    public void setNome( String nome ){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setEmail( String email ){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

    public void setTelefone( int telefone ){
        this.telefone = telefone;
    }

    public int getTelefone(){
        return telefone;
    }

    public void setDataNascimento( int dataNascimento ){
        this.dataNascimento = dataNascimento;
    }

    public int getDataNascimento(){
        return dataNascimento;
    }

    public void prnContato(){
        System.out.println("Nome: " + nome + " Email: " + email + " Telefone: " + telefone + " Data de Nascimento: " + dataNascimento );
    }

    public int calcularIdade(){
        //implementar conforme a classe TimeAsInt, pois só seria preciso comparar um valor
    }
}
