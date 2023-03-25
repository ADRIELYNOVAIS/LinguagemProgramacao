public class JogoCraps {
    public static void main(String [] args) {

        int numberRandom1, numberRandom2, sentinel = 1; 
        
        while( sentinel != 0 ) {

            numberRandom1 = (int) (Math.random()*6) + 1;
            numberRandom2 = (int) (Math.random()*6) + 1;

            System.out.println("Dado 1: " + numberRandom1);
            System.out.println("Dado 2: " + numberRandom2);

            int sum = numberRandom1 + numberRandom2;

            if( sentinel == 1 ) {

                    if( sum ==7 || sum == 11 ){

                        System.out.println("Voce ganhou");
                        sentinel +=1 ;

                    } else {
                        if( sum == 2 || sum == 3 || sum == 12 ) {

                            System.out.println("Voce perdeu");
                            sentinel = 0;
        
                        } else {
                            System.out.println("Segundo estagio. Ponto: " +  sum);
                            sentinel +=1 ;
                        }
                    }
                    
            } else {
                if( sum ==7 || sum == 11 ){
                    System.out.println("Voce ganhou");
                    sentinel +=1 ;
                } else {
                    System.out.println("Voce perdeu");
                            sentinel = 0;
                       }
                    }
        }
    }
}
