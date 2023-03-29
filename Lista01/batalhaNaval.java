import java.util.Scanner;

public class batalhaNaval {
    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);
        int line, column, option1 =0 , option2 = 0;
       
        char [][] matriz1 =  new char[5][5];
        char [][] matriz2 =  new char[5][5];

        System.out.println("Welcome to Battleship!!!");

        while( option1  != 5 ) {

            System.out.println("Tabuleiro 1 : escolha uma linha e coluna " + option1 +" : ");
            line = scanner.nextInt();
            column = scanner.nextInt();

            //line = 2; column =3;
    
            if( line < 5 || column < 5 ) {
                 // entra se a linha e coluna forem menores do que 5

                if(option1 > 0){

                            if(matriz1[line][column] == '@' ){ //se tem um barco, e porque ele foi escrito anteriormente e nao pode ser subscrito
                                System.out.println("You already have a ship there. Choose different coordinates");
                            }else{
                                matriz1[line][column] ='@';
                                option1+=1; 
                            }
                        
                }else{
                    matriz1[line][column] ='@';
                    option1+=1;
                } 
                
                if(option1 == 4){

                    for( int i = 0; i <5; i++){
                        for( int j = 0; j<5; j++){
                            
                            if(matriz1[i][j] != '@' ){ 
                                matriz1[i][j] ='-';   
                            }
                        }}
                }

            } else{
                System.out.println("Invalid coordinates. Choose different coordinates.");  
            }                  
            
        }

        while( option2  != 5 ) {

            System.out.println("Tabuleiro 2: escolha uma linha e coluna " + option2 +" : ");
            line = scanner.nextInt();
            column = scanner.nextInt();

            //line = 2; column =3;
    
            if( line < 5 || column < 5 ) {
                 // entra se a linha e coluna forem menores do que 5

                if(option2 > 0){

                            if(matriz2[line][column] == 'O' || matriz2[line][column] == 'X' ){ //se tem um barco, e porque ele foi escrito anteriormente e nao pode ser subscrito
                                System.out.println("You already have a ship there. Choose different coordinates");
                            }else{

                                if(matriz1[line][column] !='@'){ // se tem um barco o player acerto o alvo
                                    matriz2[line][column] = 'O';
                                    System.out.println("Player [1] MISSED!");
                                    option2+=1; 
                                } else{
                                    matriz2[line][column] = 'X'; //player nao acertou o alvo
                                    option2+=1;
                                }
                                
                            }
                        
                }else{
                    if(matriz1[line][column] !='@'){ //primeira coordenada nao precisa validar 
                        matriz2[line][column] = 'O';
                        System.out.println("Player [1] MISSED!");
                        option2+=1; 
                    } else{
                        matriz2[line][column] = 'X';
                        option2+=1;
                    }
                } 
                
                if(option2 == 4){

                    for( int i = 0; i <5; i++){
                        for( int j = 0; j<5; j++){
                            
                            if(matriz2[i][j] != 'O' || matriz2[i][j] != 'X' ){
                                matriz2[i][j] ='-';   
                            }
                        }}
                }

            } else{
                System.out.println("Invalid coordinates. Choose different coordinates.");  
            }                  
            
        }

    System.out.println("Matriz Inicial:");
    prnmatriz(matriz1);

    System.out.println("\n \nMatriz Dois:");
    prnmatriz(matriz2); 


    scanner.close();
}

    public static void prnmatriz(char [][] vec1){
        for(int i = 0; i < vec1.length; i++){
            for(int j = 0; j < vec1[i].length; j++){
                System.out.print(vec1[i][j] + " ");
            }
            System.out.println(" ");
        }
    }


}
