package agregacao;

import base.Ponto2D;

public class TestAgregacao {

    public static void main(String[] args) {
        //relacionamento de agregação
        Ponto2D p1 = new Ponto2D( 2, 3);
        Ponto2D p2 = new Ponto2D(5,7); 

        SegmentoReta sR = new SegmentoReta(p1, p2);
        System.out.println("Relacionamento de Agregação:\n");
        System.out.println(sR.imprimeSegmentoReta());

    }
}
