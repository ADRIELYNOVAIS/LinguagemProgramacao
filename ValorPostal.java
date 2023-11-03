import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor de n (maior ou igual a 12): ");
        int n = scanner.nextInt();
        int a, b;

        if (n >= 12) {
            if (n % 4 == 0) {
                a = n / 4;
                b = 0;
                System.out.printf("n = 4 * "+ a +" e 5 * " + b);
            } else if (n % 5 == 0) {
                a = 0;
                b = n / 5;
                System.out.printf("n = 4 * "+ a +" e 5 * " + b);
            } else {
                int i = 1;
                while ((n / 4) - i >= 0) {
                    a = (n / 4) - i;
                    b = i;
                    int j = 4 * a + 5 * b;
                    if (n == j) {
                        System.out.printf("n = 4 * "+ a +" e 5 * " + b);
                    }
                    i++;
                }
            }
        } else {
            System.out.println("n deve ser maior ou igual a 12.");
        }
    }
}
