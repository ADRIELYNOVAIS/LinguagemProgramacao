import java.util.Scanner;

public class batalhaNaval {
    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);
        int line, column, option = 0;
        char [][] matrix1 =  {{'-','-','-','-','@'}, {'-','@','-','-','-'}, {'-','-','-','@','-'}, {'@','-','-','-','-'}, {'-','-','-','-','@'}}; //primeiro declara a matriz e depois inicializa (ver inicializacao)
        char [][] matrix2 =  new char[5][5]; //matrix troca, ou seja, @ vira X
        // matriz comparação de coordenadas

        System.out.println("Welcome to Battleship!!!");

        while( option != 5 ) {

        System.out.println("escolha uma linha: ");
        line = scanner.nextInt();

        System.out.println("escolha uma coluna: ");
        column = scanner.nextInt();
        
        if( line < 5 && column < 5 ) {

            if( option == 0 ){
                matrix2[line][column] = 'X';
            } else{

                for( int i = 0; i <5; i++){
                    for( int j = 0; j<5; j++){

                        if( matrix2[i][j] == 'X' ){
                            System.out.println("You already have a ship there. Choose different coordinates"); // como imprimir apenas uma vez
                        }else{
                            matrix2[i][j] = 'X';
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
