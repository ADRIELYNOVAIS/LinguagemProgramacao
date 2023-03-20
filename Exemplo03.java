package Lista01;

/*Faça uma pesquisa sobre o operador condicional (ternario) em Java. */

public class Exemplo03 {
    
    public void main( String []args ){

        int numero = -5;

        /* ultilizado para avaliar expressões boolenas( similar ao if/else ) 
        para decidir qual valor deve ser atribuído a uma variavel*/

        String resultado = (numero >= 0) ? "positivo" : "negativo";
        System.out.println("O número é " + resultado);


    }
}
