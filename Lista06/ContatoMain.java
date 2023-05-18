public class ContatoMain {
    public static void main(String[] args){

        Data dataNascimento = new Data(23,04,2025);
        Contato c = new Contato( "Maria", "uesc@gmail.com", "(73) 98888-88888", dataNascimento );
        c.imprimirContato();

    }
}
