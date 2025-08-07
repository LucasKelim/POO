import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite uma letra: ");
        String letra = input.nextLine();

        letra = letra.toUpperCase();

        String valor = "";

        if (letra.equals("F")) {
            valor = "F - Feminino";
        } else if (letra.equals("M")) {
            valor = "M - Masculino";
        }

        System.out.println(valor);
    }
}
