import java.util.Scanner;

public class ValorPostal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor de n (maior ou igual a 12): ");
        int n = scanner.nextInt();

        if (n < 12) {
            System.out.println("n deve ser maior ou igual a 12.");
        } else {
            int a = 0;
            while ((n - 4 * a) % 5 != 0) {
                a++;
            }

            int b = (n - 4 * a) / 5;

            System.out.println("Para n = " + n + ", 4 * a = " + (4 * a) + " e 5 * b = " + (5 * b));
        }
    }
}
