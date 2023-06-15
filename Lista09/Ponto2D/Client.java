package Ponto2D;

public class Client {
    public static void main(String[] args){

        //composicao
        System.out.println("Composicao:");
        Ponto3Dcomposicao composicao = new Ponto3Dcomposicao(2, 3, 4);
        System.out.println(composicao.toString());

        //agragacao
        System.out.println("Agregacao:");
        Ponto2D ponto2d = new Ponto2D(2,3);
        Ponto3Dagregacao agregacao = new Ponto3Dagregacao(ponto2d, 4);
        System.out.println(agregacao.toString());

        //herança
        System.out.println("Heranca:");
        Ponto3D ponto3d = new Ponto3D(2, 3, 4);
        System.out.println(ponto3d.toString());
   
    }

}