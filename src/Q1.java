import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int nota;
        do {
            System.out.print("Nota entre 0 e 10: ");
            nota = in.nextInt();
            if (nota < 0 || nota > 10) {
                System.out.println("Valor inválido!");
            }
        } while (nota < 0 || nota > 10);

        System.out.println("Nota final: " + nota);

        in.close();
    }
}
