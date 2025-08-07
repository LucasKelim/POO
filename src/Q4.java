import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um ano: ");
        int ano = input.nextInt();

        String valor = "Bissexto";

        if ((ano % 400 != 0 && ano % 100 != 0) && ano % 4 != 0) {
            valor = "Não Bissexto";
        }

        System.out.println(valor);
    }
}
