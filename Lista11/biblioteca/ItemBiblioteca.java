package Lista11.biblioteca;

public interface ItemBiblioteca {
    //static private final int maxDiasEmprestimo = 3;

    abstract boolean emprestado();

    abstract void emprestar();

    abstract void devolver();

    abstract String localizacao();

    abstract String descricaoSumario();

}
