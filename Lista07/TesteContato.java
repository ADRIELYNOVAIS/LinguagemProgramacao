public class TesteContato {
    public static void main(String[] args) {
        Contato c = new Contato("Maria", "uesc@gmail.com", "(73) 98888-8888");
        c.imprimirContato();
        Contato.mostrarContato(); // Acessando o método estático
    }
}
