public class Ponto2D {
    private float x, y;

    public Ponto2D( float x, float y ) {
        this.x = x;
        this.y = y;
    }

    public int quandrante( float x, float y ){
        if( x > 0 && y > 0){
            return 1;
        } else if( x< 0 && y > 0){
            return 2;
        } else if( x < 0 && y < 0){
            return 3;
        } else if( x>0 && y <0){
            return 4;
        } return 0;
    }

    public boolean centro( float x, float y ){
        if( x ==0 && y ==0){
            return true;
        } return false;
    }

    public double calcularDistancia( float x1, float x2, float y1, float y2 ){

        double dist = 0;
        float x = x2 - x1;
        float y = y2 - y1;
        dist = Math.sqrt((x*x) + (y*y) );
        return dist;
        
    }
}
