import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite um número inteiro N: ");
        int n = in.nextInt();

        int totalDivisoes = 0;

        System.out.println("Primos entre 1 e " + n + ":");

        for (int num = 2; num <= n; num++) {
            boolean primo = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                totalDivisoes++;
                if (num % i == 0) {
                    primo = false;
                    break;
                }
            }

            if (primo) {
                System.out.print(num + " ");
            }
        }

        System.out.println("\nNúmero total de divisões realizadas: " + totalDivisoes);

        in.close();
    }
}
