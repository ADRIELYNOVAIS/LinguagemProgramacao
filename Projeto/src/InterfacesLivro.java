public interface InterfacesLivro {

    abstract Livro iniLivro();

    abstract void createLivro();

    abstract Livro readLivro(int codISBN);

    abstract void upLivro(int codISBN, String titulo, String autor, int numeroPaginas);

    abstract void deleteLivro(int codISBN);

    abstract void printLivros();

}
