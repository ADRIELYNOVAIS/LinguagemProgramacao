
public class TestePonto2D {

    public static void main( String [] args ){
        // Criando dois objetos Ponto2D
        Ponto2D ponto1 = new Ponto2D(2, 3);
        Ponto2D ponto2 = new Ponto2D(5, 7);

        System.out.println("Retorna a distancia de dois pontos: \n");
        System.out.println(Ponto2D.distance(ponto1, ponto2));

        System.out.println("Distancia entre um ponto e a origem: \n");
        System.out.println(Ponto2D.distance(ponto1));

        System.out.println("Retorna o quadrante: \n");
        System.out.println(Ponto2D.quadrante(ponto2));
        
    }
    
}
