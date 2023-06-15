package Ponto2D;

public class Ponto3Dagregacao {
    private Ponto2D ponto2d;
    private double z;

    public Ponto3Dagregacao( Ponto2D ponto2d, double z){
        this.ponto2d = ponto2d;
        this.z = z;
    }

    @Override
    public String toString(){
        return ponto2d.toString() + "Z= " +z;
    }

    /*
     * na classe cliente:
     * Ponto2D ponto2d = new Ponto2D(x, y);
     * Ponto3Dagregacao ponto3d = new Ponto3Dagragacao(ponto2d, z);
     * System.out.printnl(ponto3d.toString());
     */
}
