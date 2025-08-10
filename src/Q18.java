import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Lado 1: ");
        int lado1 = input.nextInt();
        System.out.println("Lado 2: ");
        int lado2 = input.nextInt();
        System.out.println("Lado 3: ");
        int lado3 = input.nextInt();

        String tipo = "Escaleno";
        boolean valido = false;
        if ((lado1 + lado2) > lado3 && (lado1 + lado3) > lado2 && (lado2 + lado3) > lado2) {
            valido = true;
            if (lado1 == lado2 && lado2 == lado3) {
                tipo = "Equilátero";
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                tipo = "Isósceles";
            }
        }

        if (valido) {
            System.out.println("Formam um triângulo");
            System.out.println("Tipo: " + tipo);
        } else {
            System.out.println("Não formam um triângulo");
        }

        input.close();
    }
}
