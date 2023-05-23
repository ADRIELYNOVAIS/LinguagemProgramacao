package agregacao;
import base.Ponto2D;

public class Triangulo {

    private Ponto2D p1, p2, p3;
    private double d1, d2, d3;

    Triangulo( Ponto2D p1, Ponto2D p2, Ponto2D p3 ){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        d1 = inicializarLados( p1, p2 ); 
        d2 = inicializarLados( p1, p3 ); 
        d3 = inicializarLados( p2, p3); 
    }

    private boolean isTrianguloRetangulo( Ponto2D p1, Ponto2D p2, Ponto2D p3  ){

         //teorema de desigualdade triangular
        d1 = inicializarLados( p1, p2 ); //p1+p2 > p3
        d2 = inicializarLados( p1, p3 ); //p1+p3 > p2
        d3 = inicializarLados( p2, p3); //p2 + p3 > p1
        
        if( d1 + d2 > d3){
            return true;
        } if ( d1 + d3 > d2 ){
            return true;
        } if( d2 + d3 > d1){
            return true;
        }
         return false;
    }

    public static double inicializarLados(Ponto2D p1, Ponto2D p2 ){
        return Ponto2D.calcularDistancia(p1.getX(), p1.getY(), p2.getX(), p2.getY());
    }

    public boolean isTrianguloIssoceles( Ponto2D p1, Ponto2D p2, Ponto2D p3){
        //dois lado iguais

        if( isTrianguloRetangulo(p1, p2, p3)){

            d1 = inicializarLados( p1, p2 ); 
            d2 = inicializarLados( p1, p3 ); 
            d3 = inicializarLados( p2, p3);

            if( d1 == d2 ){
                return true;
            } if( d1 == d3){
                return true;
            } if( d2 == d3){
                return true;
            } return false;
        } return false;
    }

    public boolean isTrianguloEquilatero(Ponto2D p1, Ponto2D p2, Ponto2D p3 ){
        // todos os lados iguais

        if( isTrianguloRetangulo(p1, p2, p3)){

            d1 = inicializarLados( p1, p2 ); 
            d2 = inicializarLados( p1, p3 ); 
            d3 = inicializarLados( p2, p3);

            if( d1 == d2 && d2 == d3 ){
                return true;
            } return false;
        } return false;
    }     
    
    public String imprimeTriangulo(){
        if( isTrianguloEquilatero(p1, p2, p3)){
            return "Triangulo equilatero\n" + "Ponto 1: "+ p1.getX() + p1.getY() + "\nPonto 2: "+ p2.getX()+ p2.getY() + "\nPonto 3: "+ p3.getX() + p3.getY();
        } else if(isTrianguloIssoceles(p1, p2, p3)){
            return "Triangulo isosceles\n" + "Ponto 1: "+ p1.getX() + p1.getY() + "\nPonto 2: "+ p2.getX()+ p2.getY() + "\nPonto 3: "+ p3.getX() + p3.getY(); 
        } else return "Ponto 1: "+ p1.getX() + p1.getY() + "\nPonto 2: "+ p2.getX()+ p2.getY() + "\nPonto 3: "+ p3.getX() + p3.getY();
    }

}
