package Lista06;

public class RoboSimples {

    private String nomeDoRobo;
    private int posicaoXAtual, posicaoYAtual;
    private char direcaoAtual;

    RoboSimples(String nome, int px, int py, char d) {
        if (validaName(nome) && validaDirecao(d)) {
            nomeDoRobo = nome;
            posicaoXAtual = px;
            posicaoYAtual = py;
            direcaoAtual = d;
        } else {
            //criar o metodo pra reiniciar o robo
            /*
            nomeDoRobo = "";
            posicaoXAtual = 0;
            posicaoYAtual = 0;
            direcaoAtual = 'N';
             * 
             */
            reiniciarRobo();
        }
    }

    public void reiniciarRobo(){
        //poderia ser um contrutor e referencia o mais especifico
        // como seria chamar um construtor dentro de outro ?
            nomeDoRobo = "";
            posicaoXAtual = 0;
            posicaoYAtual = 0;
            direcaoAtual = 'N';
    }

    RoboSimples(int x, int y) {
        this("", x, y, 'N');
    }

    private boolean validaName(String nomeRobo) {
        return nomeRobo != null;
    }

    private boolean validaDirecao(char d) {
        return d == 'N' || d == 'S' || d == 'E' || d == 'O';
    }

    public void move(int passos) {
    
        if(validaDirecao(direcaoAtual)){
            if (direcaoAtual == 'N') posicaoYAtual += passos;
            if (direcaoAtual == 'S') posicaoYAtual -= passos;
            if (direcaoAtual == 'E') posicaoXAtual += passos;
            if (direcaoAtual == 'O') posicaoXAtual -= passos;
        } else{
            reiniciarRobo();
        }
    }

    public void moveDiagonal(int passos, String diagonal) {
        if (validaDiagonal(diagonal)) {
            posicaoXAtual = 0;
            posicaoYAtual = 0;
            direcaoAtual = 'N';

            if (diagonal.equals("SO")) {
                posicaoYAtual -= passos;
                posicaoXAtual -= passos;
            } else if (diagonal.equals("SE")) {
                posicaoYAtual -= passos;
                posicaoXAtual += passos;
            } else if (diagonal.equals("NO")) {
                posicaoYAtual += passos;
                posicaoXAtual -= passos;
            } else if (diagonal.equals("NE")) {
                posicaoYAtual += passos;
                posicaoXAtual += passos;
            }
        } else{
            reiniciarRobo();
        }
    }

    private boolean validaDiagonal(String d) {
        return d.equals("SO") || d.equals("SE") || d.equals("NO") || d.equals("NE");
    }

    public boolean posicaoContemRobo(RoboSimples posicao) {
        return posicaoXAtual == posicao.posicaoXAtual && posicaoYAtual == posicao.posicaoYAtual;
    }

    public void imprimirRobo() {
        System.out.printf("Nome do robo: %s%n", nomeDoRobo);
        System.out.printf("Posicao x: %d%n", posicaoXAtual);
        System.out.printf("Posicao y: %d%n", posicaoYAtual);
        System.out.printf("Direcao: %c%n", direcaoAtual);
    }
}
