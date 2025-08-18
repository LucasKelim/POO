import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Preço do pão: R$ ");
        double preco = in.nextDouble();

        System.out.println("Panificadora Pão de Ontem - Tabela de preços");
        int i = 1;
        while (i <= 50) {
            System.out.printf("%d - R$ %.2f\n", i, i * preco);
            i++;
        }

        in.close();
    }
}
