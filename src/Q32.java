import java.util.Scanner;

public class Q32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("1. Filé Duplo (R$ 4,90 até 5kg - R$ 5,80 +5kg)");
        System.out.println("2. Alcatra (R$ 5,90 até 5kg - R$ 6,80 +5kg)");
        System.out.println("3. Picanha (R$ 6,90 até 5kg - R$ 7,80 +5kg)");
        System.out.println("Carne 1: ");
        int carne1 = input.nextInt();
        System.out.println("Quantidade: ");
        float qtd1 = input.nextFloat();
        System.out.println("Carne 2: ");
        int carne2 = input.nextInt();
        System.out.println("Quantidade: ");
        float qtd2 = input.nextFloat();

        double preco1 = switch (carne1) {
            case 1 -> 4.9;
            case 2 -> 5.9;
            case 3 -> 6.9;
            default -> 0;
        };
        if (qtd1 > 5) {
            preco1 = switch (carne1) {
                case 1 -> 5.8;
                case 2 -> 6.8;
                case 3 -> 7.8;
                default -> 0;
            };
        }

        double preco2 = switch (carne2) {
            case 1 -> 4.9;
            case 2 -> 5.9;
            case 3 -> 6.9;
            default -> 0;
        };
        if (qtd2 > 5) {
            preco2 = switch (carne2) {
                case 1 -> 5.8;
                case 2 -> 6.8;
                case 3 -> 7.8;
                default -> 0;
            };
        }

        float total = carne1 * qtd2 + carne2 * qtd2;

        System.out.println("Total: " + total);
        input.nextLine();
        System.out.println("Método de pagamento: ");
        System.out.println("Dinheiro");
        System.out.println("PIX");
        System.out.println("Cartão Tabajara");
        String metodo = input.nextLine();

        double desconto = 0;
        if (metodo.equals("Cartão Tabajara")) {
            desconto = total * 0.05;
        }

        String c1 = switch (carne1) {
            case 1 -> "File Duplo";
            case 2 -> "Alcatra";
            case 3 -> "Picanha";
            default -> "";
        };

        String c2 = switch (carne2) {
            case 1 -> "File Duplo";
            case 2 -> "Alcatra";
            case 3 -> "Picanha";
            default -> "";
        };

        System.out.println("Cupom Fiscal");
        System.out.println("Carne 1: " + c1 + " - " + qtd1 + "kg");
        System.out.println("Carne 2: " + c2 + " - " + qtd2 + "kg");
        System.out.println("Preço total: " + total);
        System.out.println("Tipo de pagamento: " + metodo);
        System.out.println("Desconto: " + desconto);
        System.out.println("Valor a pagar: " + (total - desconto));

        input.close();
    }
}
