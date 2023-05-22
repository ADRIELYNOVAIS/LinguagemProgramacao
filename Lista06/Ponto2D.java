package Lista06;

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

    public double distance(Ponto2D ponto) {
        return distance(ponto.x, ponto.y);
    }

    public double distance() {
        return distance(0, 0);
    }

    public double distance(float x, float y) {
        double dist = Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
        return dist;
    }

    public void imprimirPonto() {
        System.out.println("Ponto: (" + x + "," + y + ")");
    }
}
