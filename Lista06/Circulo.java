package Lista06;

public class Circulo {
    private int x, y, r;
    final static private double PI = 3.14;
   
    public Circulo( int x, int y, int r ){
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public Circulo(){
        this.x =0;
        this.y =0;
        this.r = 1;
    }

    public Circulo( int x, int y){
        this.x = x;
        this.y = y;
        this.r = 1;
    }

    public Circulo( int r ){
        this.x = 0;
        this.y = 0;
        this.r = r;
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

    public void imprimirCirculo(){
        System.out.printf("X: %d, Y: %d, Raio: %d%n", x, y, r);
    }
    
}
