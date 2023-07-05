public interface InterfacesAluno {

    abstract Aluno iniAluno();

    abstract void createAluno();

    abstract Aluno readAluno(String numeroMatricula);

    abstract void upAluno(String nome, String email, String cpf, String telefone, String numeroMatricula);

    abstract void deleteAluno(String matricula);

    abstract void printAlunos();

}
