public class Contato {

    private String nome, email, telefone;
    static private int totalContatos = 0;    

    Contato( String nome, String email, String telefone ){
        if(validateName(nome)){
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        totalContatos++;
        }else{
            this.nome = "Nome nao informado";
        }
        
    }

    // colocar as validações

    Contato( String nome, String telefone){
        if(validateName(nome)){
        this.nome = nome;
        this.telefone = telefone;
        totalContatos++;
        } else{
            this.nome = "Nome nao informado";
        }
    }

    // Método estático
    public static void mostrarContato() { 
        System.out.println("Total de contatos: " + totalContatos);
    }

    private boolean validateName( String name ){
        if( name != null){
            return true;
        } return false;
    }

    public void imprimirContato(){
        System.out.println("Noma:" + nome+ "Email:" + email + "Telefone:" + telefone );
    }
    
}