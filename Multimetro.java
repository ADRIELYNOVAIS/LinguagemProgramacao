import java.util.Scanner;
import java.lang.Math;

public class Multimetro {
    public static void main(String [] args) {

        double measure = 0, result = 0, detour, healthMultimeter;
        double [] number = new double[10];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("informe o valor aferido no multimetro: ");
            number[i] = scanner.nextDouble();
            measure += number[i]; // valor total do elementos
        }

        double media = measure / 10; //calcula a media dos elementos

        healthMultimeter = media - (media - (media/10));

        for (int i = 0; i < 10; i++) {
            result += (number[i] - media) * (number[i] - media); //valor do elemento menos a media dos elementos
        }

        detour = Math.sqrt( result / 9); //calculo do desfio

        if( detour > healthMultimeter){
            System.out.printf("o multimetro esta com problemas e nao pode ser utilizado");
        } else{

        System.out.printf("a saude do multimetro esta ok. E o valor do desvio padrao e: %.2f", detour);
        }
        scanner.close();
    }
}
