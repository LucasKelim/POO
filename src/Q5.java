import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite uma letra: ");
        String letra = input.nextLine();

        letra = letra.toUpperCase();

        String valor = "";

        if (letra.equals("A") || letra.equals("E") || letra.equals("I") || letra.equals("O") || letra.equals("U")) {
            valor = "Vogal";
        }

        System.out.println(valor);
    }
}
