package Lista01;

import java.util.Scanner;

/*Faça uma pesquisa sobre outros tipos de operadores em Java: Operadores
bit a bit e Operadores compostos e de atribuição. */

public class Exemplo01 {

    public static void main(String [] args) {

                int a = 0b1100; // 12
                int b = 0b0101; // 5
                int opction;
                
                /* o 0b é usado para representar um numero binario em java */

                System.out.println("a em decimal " + a + "\n b em decimal  " + b  );
                // ao usar apenas a concatenacao o java converte para string e imprime o valor 12 ao inves do numero binario
                
                System.out.println("O valor de a em binario e: " + Integer.toBinaryString(a) + "\n o valor de b em binario " + Integer.toBinaryString(b));
        
                Scanner scanner = new Scanner(System.in);
                System.out.println("Escolha um operador logico: ");
                System.out.println("1-and 2-or 3-xor 4-not 5-shift 6-rigth 7-fill shift");
                opction = scanner.nextInt();

                switch(opction){
                    case 1:
                       // Operadores bit a bit
                        int and = a & b; 
                        /*Cada bit na posicao correspondente e comparado e o resultado e 1 se ambos os bits forem 1 */
                        System.out.println("a & b = " + and); 
                        System.out.println("a & b = " + Integer.toBinaryString(and)); 
                    break;

                    case 2:
                         int or = a | b; 
                         System.out.println("a | b = " + or); 
                         System.out.println("a | b = " + Integer.toBinaryString(or));
                    break;
                    
                    case 3:
                        int xor = a ^ b; 
                        System.out.println("a ^ b = " + xor); 
                        System.out.println("a ^ b = " + Integer.toBinaryString(xor));
                    break;
                    
                    case 4:
                        int not = ~a; 
                        System.out.println("~a = " + not);
                        System.out.println("~a = " + Integer.toBinaryString(not)); 
                    break;
                    
                    case 5: 
                         int shift = a << 2; 
                         System.out.println("a << 2 = " + shift);
                         System.out.println("a <<2 = " + Integer.toBinaryString(shift)); 
                    break;

                    case 6:
                         int right = a >> 2;
                         System.out.println("a >> 2 = " + right); 
                         System.out.println("a >> 2 = " + Integer.toBinaryString(right)); 
                    break;

                    case 7:
                        int zeroFillRightShift = a >>> 2;
                        System.out.println("a >>> 2 = " + zeroFillRightShift); 
                        System.out.println("a >>> 2 = " + Integer.toBinaryString(zeroFillRightShift));
                    break;

                    default:
                        System.out.println("opcao invalida");
                    break;

                }
                  
                scanner.close();       
        
                // Operadores compostos e de atribuição
                int x = 10;
                int y = 5;
                x += y; 
                System.out.println("x += y = " + x); 
        
    }

}
