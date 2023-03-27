import java.util.Scanner;

public class batalhaNaval {
    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);
        int line, column, option1 =0 ;
       
        char [][] matrix1 =  new char[5][5];
        //char [][] matrix2 =  new char[5][5];

        System.out.println("Welcome to Battleship!!!");

        while( option1  != 5 ) {

            System.out.println("escolha uma linha e coluna " + option1 +" : ");
            line = scanner.nextInt();
            column = scanner.nextInt();

            //line = 2; column =3;
    
            if( line < 5 || column < 5 ) {
                 // entra se a linha e coluna forem menores do que 5

                if(option1 > 0){

                            if(matrix1[line][column] == '@' ){ //se tem um barco, e porque ele foi escrito anteriormente e nao pode ser subscrito
                                System.out.println("You already have a ship there. Choose different coordinates");
                            }else{
                                matrix1[line][column] ='@';
                                option1+=1; 
                            }
                        
                }else{
                    matrix1[line][column] ='@';
                    option1+=1;
                } 
                
                if(option1 == 4){

                    for( int i = 0; i <5; i++){
                        for( int j = 0; j<5; j++){
                            
                            if(matrix1[i][j] != '@' ){
                                matrix1[i][j] ='-';   
                            }
                        }}
                }

            } else{
                System.out.println("Invalid coordinates. Choose different coordinates.");  
            }                  
            
        }

    System.out.println("Matriz Inicial:");
    prnMatrix(matrix1);

    //System.out.println("Matriz Dois:");
    //prnMatrix(matrix2); //


    scanner.close();
}

    public static void prnMatrix(char [][] vec1){
        for(int i = 0; i < vec1.length; i++){
            for(int j = 0; j < vec1[i].length; j++){
                System.out.print(vec1[i][j] + " ");
            }
            System.out.println(" ");
        }
    }


}
