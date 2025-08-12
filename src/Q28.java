import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Num 1: ");
        float num1 = input.nextFloat();
        System.out.println("Num 2: ");
        float num2 = input.nextFloat();

        System.out.println("Operação: ");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        int o = input.nextInt();

        float res = switch (o) {
            case 1 -> num1 + num2;
            case 2 -> num1 - num2;
            case 3 -> num2 * num1;
            case 4 -> (float) num2 / num1;
            default -> 0;
        };

        String paridade = res % 2 == 0 ? "Par" : "ìmpar";
        String valor = res < 0 ? "Negativo" : "Positivo";
        String tipo = Math.round(res) == res ? "Inteiro" : "Decimal";

        System.out.println(res);
        System.out.println(paridade);
        System.out.println(valor);
        System.out.println(tipo);

        input.close();
    }
}
