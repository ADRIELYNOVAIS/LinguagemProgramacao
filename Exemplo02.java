package Lista01;

/*Faça uma pesquisa sobre precedência de operadores em Java e a
utilização de parênteses. */

public class Exemplo02 {

    public void main( String []args ){

        int a = 10, b = 5, c = 2;

        int resultado1 = a + b * c; // resultado1 = 20
        int resultado2 = (a + b) * c; // resultado2 = 30
        int resultado3 = a / b % c; // resultado3 = 0
        int resultado4 = a / (b % c); // resultado4 = 2
        int resultado5 = ++a * b--; // resultado5 = 55

        System.out.println("Resultado1: " + resultado1);
        System.out.println("Resultado2: " + resultado2);
        System.out.println("Resultado3: " + resultado3);
        System.out.println("Resultado4: " + resultado4);
        System.out.println("Resultado5: " + resultado5);
        
    }
}
