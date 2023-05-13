package Lista05;

public class Circulo {
    private double r, x, y;
    final static private double PI = 3.14;

    public Circulo( double r, double x, double y ){
        if( validarRaio( r )){
        this.r = r;
        this.x = x;
        this.y = y;
       }
       this.r = 0;
       this.x = 0;
       this.y = 0;
    }

    private boolean validarRaio( double r ){
        if( r  > 0){
            return true;
        } return false;
    }

    public double getR(){
        return r;
    }

    public void setR( double r ){
        this.r = r;
    }

    public double getY(){
        return y;
    }

    public void setY( double y ){
        this.y = y;
    }

    public double getX(){
        return x;
    }

    public void setX( double x ){
        this.x = x;
    }

    public void imprimirCirculo(){
        System.out.println("Raio = " +  getR() + "\n X=" + getX() + "\n Y = " + getY());
    }

    public double areaCirculo(){
        double areaC = 0;
        areaC = (double) PI*r*r;
        return areaC;
    }

    public double areaPerimetro(){
        double areaP = 0;
        areaP = (double) (2*PI*r);
        return areaP;

    }

    public boolean pontoInternoAoCirculo(double x, double y){
        double dx, dy, distancia;
        dx = this.x - x;
        dy = this.y - y;
        distancia = Math.sqrt(dx*dx + dy*dy);

        if (distancia <= r){
            return true;
        } else{
            return false;
        }
    
    }

    public boolean isBiggerThan( Circulo outrocCirculo ){

        if(outrocCirculo.areaCirculo() > areaCirculo() ){
            return true;
        } return false;
    }

}
