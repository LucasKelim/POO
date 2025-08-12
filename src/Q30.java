import java.util.Scanner;

public class Q30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Litros: ");
        int l = input.nextInt();
        System.out.println("Combustível: ");
        System.out.println("A - Álcool");
        System.out.println("G - Gasolina");
        char tipo = input.next().toUpperCase().charAt(0);

        float preco = 0;
        float desconto = 0;
        if (tipo == 'A') {
            preco = 1.90f;
            if (l <= 20) {
                desconto = 0.03f;
            } else {
                desconto = 0.05f;
            }
        } else if (tipo == 'G') {
            preco = 2.50f;
            if (l <= 20) {
                desconto = 0.04f;
            } else {
                desconto = 0.06f;
            }
        }

        float total = l * preco;
        float valor = total - total * desconto;

        System.out.println("Total: " + valor);

        input.close();
    }
}
