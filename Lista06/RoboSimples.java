package Lista06;

public class RoboSimples {

    private  String nomeDoRobo;
    private int posicaoXAtual,posicaoYAtual;
    private char direcaoAtual;
    private String diagonal;

    RoboSimples(String nome, int px, int py, char d, String di ){
       
        if( validaName(nome) && validaDirecao( d ) && validaDiagonal( di ) ){
            nomeDoRobo = nome;
            posicaoXAtual = px;
            posicaoYAtual = py;
            direcaoAtual = d;
        } else {
            nomeDoRobo = "";
            posicaoXAtual = 0;
            posicaoYAtual = 0;
            direcaoAtual = 'N';
        }
    }

    RoboSimples( int x, int y ){
        posicaoXAtual = x;
        posicaoYAtual = y;
    }

    private boolean validaName( String nomeRobo ){
        if( nomeRobo != null ){
            return true;
        }return false;
    }

    private boolean validaDirecao( char d ){
        if( d == 'N' || d== 'S' || d== 'E' || d=='O' ){
            return true;
        } return false;
    }

    private boolean validaDiagonal( String d ){
        if( d == "SO" || d== "SE" || d== "NE" || d=="NO" ){
            return true;
        } return false;
    }

    public void move( int passos ){
        if (direcaoAtual == 'N') posicaoYAtual += passos;
        if (direcaoAtual == 'S') posicaoYAtual -= passos;
        if (direcaoAtual == 'E') posicaoXAtual += passos;
        if (direcaoAtual == 'O') posicaoXAtual -= passos;
    }

    public void moveDiagonal( int passos ){
        //centralizar o robo
        posicaoXAtual = 0;
        posicaoYAtual = 0;
        direcaoAtual = 'N'; 

        if( diagonal == "SO"){
            //if( posicaoContemRobo(null))
            posicaoYAtual -= passos; //mover s
            posicaoXAtual -= passos; // mover o
        }if( diagonal == "SE"){
            posicaoYAtual -= passos; //mover s
            posicaoXAtual += passos; //mover e
        } if( diagonal == "NO"){
            posicaoYAtual += passos;//mover n
            posicaoXAtual -= passos; //mover o
        } if( diagonal == "NE"){
            posicaoYAtual += passos;
            posicaoXAtual += passos;
        }
    }

    public boolean posicaoContemRobo( RoboSimples posicao ){
        if( posicaoXAtual == posicao.posicaoXAtual && posicaoYAtual == posicao.posicaoYAtual ){
            return true;
        } return false;
        
    }
    //precisa guarda a posicao atual do robo pra saber se ele vai colidir com outro


    
    
}
