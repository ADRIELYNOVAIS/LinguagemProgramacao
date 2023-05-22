public class Ponto2D {
    private float x, y;

    public Ponto2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Ponto2D() {
        // refencia o contrutor mais específico 
        this(0, 0);
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

    public static double distance(Ponto2D P1, Ponto2D P2){
        return calcularDistancia(P1.x, P1.y, P2.x, P2.y);
    }

   public static double distance(Ponto2D P1){
        return calcularDistancia(P1.x, P1.y, 0, 0);
   }

   private static double calcularDistancia(float x1, float y1, float x2, float y2) {
    double dist = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    return dist;
}

    public void imprimirPonto() {
        System.out.println("Ponto: (" + x + "," + y + ")");
    }
}
