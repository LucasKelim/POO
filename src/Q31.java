import java.util.Scanner;

public class Q31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Morangos (Kg):");
        double kgMorango = input.nextDouble();
        System.out.println("Maça (Kg):");
        double kgMaca = input.nextDouble();

        double precoMorango = 2.5;
        double precoMaca = 1.8;
        if (kgMorango > 5) {
            precoMorango = 2.2;
        }
        if (kgMaca > 5) {
            precoMaca = 1.5;
        }

        double precoTotal = kgMorango * precoMorango + precoMaca * kgMaca;
        double kgTotal = kgMorango + kgMaca;

        if (kgTotal > 8 || precoTotal > 25) {
            double precoDesconto = precoTotal * 1.1;
            System.out.println("Total: " + precoDesconto);
        } else {
            System.out.println("Total: " + precoTotal);
        }

        input.close();
    }
}
