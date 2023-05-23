package agregacao;
import base.Ponto2D;
public class TesteTriangulo {
    public static void main(String[] args) {
        //relacionamento de agregação

        Ponto2D p1 = new Ponto2D( 8, 10);
        Ponto2D p2 = new Ponto2D(5,7); 
        Ponto2D p3 = new Ponto2D(5,7); 

        Triangulo t = new Triangulo(p1, p2, p3);
        System.out.println(t.imprimeTriangulo());
    
    }
}
