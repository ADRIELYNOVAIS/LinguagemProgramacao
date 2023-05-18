package Lista06;

public class Contato {

    private String nome, email, telefone;
    private Data dataNascimento;
    

    Contato( String nome, String email, String telefone, Data dataNascimento ){
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
    }

    // colocar as validações

    Contato( String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }

    /*  Contato( String nome, String email){
        this.nome = nome;
        this.email = email;

        //
    }*/

    public void imprimirContato(){
        System.out.println("Noma:" + nome+ "Email:" + email + "Telefone:" + telefone + "Data Nascimento:" + dataNascimento );
    }
    
}