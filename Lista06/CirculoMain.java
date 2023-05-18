package Lista06;

public class CirculoMain {
    public static void main(String[] args){

        Circulo c1 = new Circulo(1, 1, 2);
        c1.imprimirCirculo();

        Circulo c2 = new Circulo(1);
        c2.imprimirCirculo();

        Circulo c3 = new Circulo(2, -5);
        c3.imprimirCirculo();

        Circulo c4 = new Circulo();
        c4.imprimirCirculo();
    }

}
