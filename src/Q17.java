import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Número inteiro: ");
        int n = in.nextInt();

        boolean primo = true;

        if (n <= 1) {
            primo = false;
        } else {
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    primo = false;
                    break;
                }
            }
        }

        if (primo) {
            System.out.println("É primo");
        } else {
            System.out.println("Não é primo");
        }

        in.close();
    }
}
