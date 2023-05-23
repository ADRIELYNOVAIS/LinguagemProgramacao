package composicao;
import base.Ponto2D;

public class SegmentoReta {
    // relacionamento de composição

    private Ponto2D p1, p2;
    private double dimensao;

    SegmentoReta( float x1, float y1, float x2, float y2 ) {
        p1 = new Ponto2D( x1, y1 );
        p2 = new Ponto2D( x2, y2 );
        dimensao = calcularDimensao(x1, y1, x2, y2);
    }


    public double calcularDimensao(float x1, float y1,  float x2, float y2) {
        
        dimensao = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return dimensao;
    }

    public String imprimeSegmentoReta(){

        return "Ponto 1:"+p1.imprimirPonto() + "\nPonto 2: "+ p2.imprimirPonto() +" \nDimensao: " + dimensao; 
       
    }

}
