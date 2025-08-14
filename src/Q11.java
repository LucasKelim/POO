import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int pares = 0;
        int impares = 0;

        int i = 1;
        while (i <= 10) {
            System.out.print("Digite um numero: ");
            int num = in.nextInt();
            if (num % 2 == 0) {
                pares++ ;
            } else {
                impares++;
            };
            i++;
        }

        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);

        in.close();
    }
}
