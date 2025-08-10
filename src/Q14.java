import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Dia da semana: ");
        int dia = input.nextInt();

        String m = switch (dia) {
            case 1 -> "Domingo";
            case 2 -> "Segunda";
            case 3 -> "Terca";
            case 4 -> "Quarta";
            case 5 -> "Quinta";
            case 6 -> "Sexta";
            case 7 -> "Sábado";
            default -> "Valor invalido";
        };

        System.out.println("Dia da semana: " + m);

        input.close();
    }
}
