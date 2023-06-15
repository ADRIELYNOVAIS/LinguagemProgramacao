package Ponto2D;

public class Ponto3Dcomposicao {
    //usando o relacionamento de composicao
    private Ponto2D p;
    private double z;

    public Ponto3Dcomposicao( double x, double y, double z){
        p = new Ponto2D(x,y); // similar ao metodo super
        this.z = z;
    }

    @Override
    public String toString(){
        return p.toString() + "Z= " + z;
    }

    /*
     * na classe cliente:
     * Ponto3D d = new Ponto3D(x, y, z);
     * System.out.printnl(d.toString());
     */
}
