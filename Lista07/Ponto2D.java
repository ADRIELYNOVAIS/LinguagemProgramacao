public class Ponto2D {
    private float x, y;

    public float getX() {
        return x;
    }
    public float getY() {
        return y;
    }
    public Ponto2D( float x, float y ) {
        this.x = x;
        this.y = y;
    }
    public Ponto2D(){
        x =0;
        y =0;
    }
    /* duplicidade
     *  public double distance( Ponto2D ponto ){
        
        double dist = 0;
        float x = ponto.x - this.x;
        float y = ponto.y - this.y;
        dist = Math.sqrt((x * x) + (y * y));
        return dist;
    }
     */

    public static double distance(Ponto2D P1, Ponto2D P2) {

        double distancia = 0, x, y;
        x = P1.x - P2.x;
        y = P1.y - P2.y;
        distancia = Math.sqrt((x * x) + (y * y));
        return distancia;

    }

    public static int quadrante( Ponto2D p ){
        if( p.x > 0 && p.y > 0){
            return 1;
        } else if( p.x< 0 && p.y > 0){
            return 2;
        } else if( p.x < 0 && p.y < 0){
            return 3;
        } else if( p.x>0 && p.y <0){
            return 4;
        } return 0;
    }

    public static double distance( Ponto2D p ){
        double d = 0, x, y;
        x = p.x -0;
        y = p.y -0;
        d = Math.sqrt((x * x) + (y * y));
        return d;
    }

    public double distance(){
        double dist = 0;
        float x = this.x - 0;
        float y = this.y - 0;
        dist = Math.sqrt((x * x) + (y * y));
        return dist;
    }

    public double distance( float x, float y ) {
        
        double dist = 0;
        float dx = x - this.x;
        float dy = y - this.y;
        dist = Math.sqrt(dx * dx + dy * dy);
        return dist;
    }

    public void imprimirPonto(){
        System.out.println("Ponto: (" + x + "," + y+")");
    }
    
}