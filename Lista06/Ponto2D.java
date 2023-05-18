package Lista06;

public class Ponto2D {
    private float x, y;

    public Ponto2D( float x, float y ) {
        this.x = x;
        this.y = y;
    }
    public Ponto2D(){
        x =0;
        y =0;
    }

    public double distance( Ponto2D ponto ){
        
        double dist = 0;
        float x = ponto.x - this.x;
        float y = ponto.y - this.y;
        dist = Math.sqrt((x * x) + (y * y));
        return dist;
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
