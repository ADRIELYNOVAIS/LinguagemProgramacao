public class Livro {
    private String titulo, autor;
    private int codISBN, numeroPaginas;

    Livro(int codISBN, String titulo, String autor, int numeroPaginas) {

        if (validarDados(titulo) && validarDados(autor)) {

            this.titulo = titulo;
            this.autor = autor;
            this.codISBN = codISBN;
            this.numeroPaginas = numeroPaginas;

        } else {
            throw new IllegalArgumentException("Dados inválidos");
        }

    }

    Livro(int codISBN, String titulo) {

        this.codISBN = codISBN;
        this.titulo = titulo;
        
    }

    public int getCodISBN() {
        return this.codISBN;
    }

    private boolean validarDados(String txt) {
        if (txt != null) {
            return true;
        }
        return false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return "\nISBN: " + codISBN + "\nTitulo:  " + titulo + "\nAutor: " + autor + "\n Numero de Paginas: "
                + numeroPaginas;
    }

    public String imprimirLivro() {
        return "\nISBN: " + codISBN + "\nTitulo:  " + titulo;
    }

}
