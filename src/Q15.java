import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Preço de custo do produto: ");
        double custo = input.nextDouble();
        System.out.println("Origem: ");
        int codigo = input.nextInt();

        String origem = switch (codigo) {
            case 1 -> "Sul";
            case 2 -> "Norte";
            case 3 -> "Leste";
            case 4 -> "Oeste";
            case 5, 6 -> "Nordeste";
            case 7, 8 -> "Centro-Oeste";
            default -> "Importado";
        };

        System.out.printf("Preço: R$ %.2f | %d - %s", custo, codigo, origem);

        input.close();
    }
}
