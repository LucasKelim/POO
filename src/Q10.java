import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Base: ");
        int base = in.nextInt();
        System.out.print("Expoente: ");
        int exp = in.nextInt();

        int count = 1;
        for (int i = 1; i <= exp; i++) {
            count *= base;
        }

        System.out.println("Resultado: " + count);

        in.close();
    }
}
