import java.util.Scanner;

public class Q27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Lojas Tabajara");
            double total = 0;
            int i = 1;
            while (true) {
                System.out.print("Produto " + i + ": R$ ");
                double preco = in.nextDouble();
                if (preco == 0) {
                    break;
                }
                total += preco;
                i++;
            };
            System.out.printf("Total: R$ %.2f\n", total);

            double dinheiro;
            while (true) {
                System.out.print("Dinheiro: R$ ");
                dinheiro = in.nextDouble();
                if (dinheiro >= total) {
                    break;
                }
                System.out.println("Valor insuficiente! Tente novamente.");
            }
            double troco = dinheiro - total;
            System.out.printf("Troco: R$ %.2f\n", troco);

            System.out.print("Registrar nova compra? (s/n): ");
            String resposta = in.next();
            if (resposta.equalsIgnoreCase("n")) {
                break;
            }
        };

        in.close();
    }
}
