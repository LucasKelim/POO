import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Peso de peixes: ");
        double peso = input.nextDouble();

        double excesso = 0;
        double multa = 0;

        if (peso > 50) {
            excesso = peso - 50;
            multa = excesso * 4;
        }

        System.out.println("Peso: " + peso + " kg");
        System.out.println("Excesso: " + excesso + " kg");
        System.out.println("Multa: R$ " + multa);

        input.close();
    }
}
