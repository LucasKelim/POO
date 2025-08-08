import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Turno (M, V, N): ");
        String t = input.nextLine().toUpperCase();

        String m = switch (t) {
            case "M" -> "Bom dia";
            case "V" -> "Boa tarde";
            case "N" -> "Boa noite";
            default -> "";
        };

        System.out.println(m);
    }
}
