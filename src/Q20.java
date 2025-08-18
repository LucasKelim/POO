import java.util.Arrays;
import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Quantidade de notas: ");
        int n = in.nextInt();
        int[] notas = new int[n];

        int i = 0;
        while (i < n) {
            System.out.print("Digite uma nota: ");
            notas[i]  = in.nextInt();
            i++;
        }

        double media = Arrays.stream(notas).sum() / (double) n;

        System.out.println("Média: " + media);

        in.close();
    }
}
