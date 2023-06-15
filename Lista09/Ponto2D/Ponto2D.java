package Ponto2D;

public class Ponto2D {
    private double x, y;

    public Ponto2D( double x, double y ){
        this.x = x;
        this.y = y;
    }

    public Ponto2D(){
        this(0,0);
    }

    public Ponto2D( Ponto2D p ){
        this(p.x, p.y);
    }

    @Override
    public String toString(){
        return "X= " + x + "Y= " + y;
    }

    private boolean inAxisX(){
        if(y==0){
         return true;
        } else  return false;
    }

    private boolean inAxisY(){
        if(x==0){
         return true;
        } else  return false;
    }

    private boolean inAxis(){
        if(x == 0 || y == 0){
         return true;
        } else  return false;
    }

    private boolean isOrigin(){
        if(x == 0 && y ==0 ){
          return true;
        } return false;
    }

    private double distance( Ponto2D p ){
        //d = √((x2 - x1)² + (y2 - y1)²)
        double d = Math.sqrt(Math.pow((p.x - x),2) + Math.pow((p.y - y),2));
        return d;
    }
}
