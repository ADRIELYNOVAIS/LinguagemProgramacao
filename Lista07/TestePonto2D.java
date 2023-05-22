
public class TestePonto2D {

    public static void main( String [] args ){
        // Criando dois objetos Ponto2D
        Ponto2D ponto1 = new Ponto2D(2, 3);
        Ponto2D ponto2 = new Ponto2D(-5, -7);
        
        //como imprimir o pontoooo
        //System.out.println(ponto2.imprimirPonto());
       
        //metodos static não precisam de instancia de classe 
        System.out.println("\nRetorna a distancia de dois pontos: ");
        System.out.println(Ponto2D.distance(ponto1, ponto2)); 

        System.out.println("\nDistancia entre um ponto e a origem: ");
        System.out.println(Ponto2D.distance(ponto1));

        System.out.println("\nRetorna o quadrante (ponto 1): ");
        System.out.println(Ponto2D.quadrante(ponto1));

        System.out.println("\nRetorna o quadrante (ponto 2): ");
        System.out.println(Ponto2D.quadrante(ponto2));
        
        
    }
    
}
