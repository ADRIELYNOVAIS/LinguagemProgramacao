public class Aluno {

    private String nome, email, cpf, telefone, numeroMatricula;

    Aluno(String nome, String email, String cpf, String telefone, String numeroMatricula) {
        
        if (validateString(nome) && validateString(email) && validateString(cpf) && validateString(telefone)
                && validateString(numeroMatricula)) {
            this.nome = nome;
            this.email = email;
            this.cpf = cpf;
            this.telefone = telefone;
            this.numeroMatricula = numeroMatricula;
        } else {
            throw new IllegalArgumentException("Dados inválidos");
        }
    }

    Aluno(String nomeAluno, String matricula) {
        this(nomeAluno, "", "", "", matricula);
    }

    public String getMatricula() {
        return this.numeroMatricula;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    private boolean validateString(String txt) {
        if (txt != null) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "Dados do Aluno:" + "\nNome: " + nome + "\nEmail: " + email + "\nCPF: " + cpf + "\nTelefone: " + telefone + "\nNumero de matricula: "
                + numeroMatricula;
    }

    public String imprimirAluno() {
        return "Nome: " + nome + "Numero de matricula: " + numeroMatricula;
    }

}