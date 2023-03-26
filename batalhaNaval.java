import java.util.Scanner;

public class batalhaNaval {
    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);
        int line, column, option = 0;
        //char [][] matrix1 =  {{'-','-','-','-','@'}, {'-','@','-','-','-'}, {'-','-','-','@','-'}, {'@','-','-','-','-'}, {'-','-','-','-','@'}}; //primeiro declara a matriz e depois inicializa (ver inicializacao)
        char [][] matrix1 =  new char[5][5]; //matrix troca, ou seja, @ vira X

        System.out.println("Welcome to Battleship!!!");

        while( option != 5 ) {

        System.out.println("escolha uma linha e coluna: ");
        line = scanner.nextInt();
        column = scanner.nextInt();

        //System.out.println("escolha uma coluna: ");
        
        
        // preencher o tabuleiro de acordo com as coordenadas passadas
        if( line < 5 && column < 5 ) {

            if( option == 0 ){
                matrix1[line][column] = '@';
            } else{

                for( int i = 0; i <5; i++){
                    for( int j = 0; j<5; j++){

                        if( matrix1[i][j] != '@' ){
                           // System.out.println("You already have a ship there. Choose different coordinates"); // como imprimir apenas uma vez
                          // como tratar a questao de nao pedir de novo coordenadas diferentes
                          matrix1[i][j] = '-';
                        
                        }else{
                            matrix1[line][column] = '@';
                        }
                    }}

            }
        } else{
            System.out.println("Invalid coordinates. Choose different coordinates.");
        }
              
        option +=1;
    }

    System.out.println("Matriz Inicial:");
    prnMatrix(matrix1); 

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
