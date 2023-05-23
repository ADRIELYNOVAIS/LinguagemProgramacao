package agregacao;
import base.Ponto2D;

public class SegmentoReta {

    private Ponto2D p1, p2;
    private double dimensao;

    SegmentoReta( Ponto2D p1, Ponto2D p2 ){
        this.p1 = p1;
        this.p2 = p2;
        dimensao = calcularDimensao(p1, p2);
        
    }

    public double calcularDimensao( Ponto2D p1, Ponto2D p2 ){

        dimensao = Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
        return dimensao;
    }

    public String imprimeSegmentoReta(){

        return "Ponto 1:"+p1.imprimirPonto() + "\nPonto 2: "+ p2.imprimirPonto() +" \nDimensao: " + dimensao; 
       
    }
}
