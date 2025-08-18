import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Número inteiro: ");
        int n = in.nextInt();

        boolean primo = true;
        StringBuilder divisores = new StringBuilder();

        if (n <= 1) {
            primo = false;
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    primo = false;
                    divisores.append(i).append(" ");
                }
            }
        }

        if (primo) {
            System.out.println("É primo");
        } else {
            System.out.println("Não é primo");
            System.out.println("Divisível por: " + divisores.toString());
        }

        in.close();
    }
}
