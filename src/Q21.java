import java.util.Arrays;
import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Quantidade de pessoas: ");
        int p = in.nextInt();

        int[] notas = new int[p];

        int i = 0;
        while (i < p) {
            System.out.println("Idade: ");
            notas[i] = in.nextInt();
            i++;
        }

        double media = Arrays.stream(notas).sum() / (double) p;

        String m = "Turma é Idosa";
        if (media >= 0 && media <= 25) {
            m = "Turma é Jovem";
        } else if (media > 25 && media <= 60) {
            m = "Turma é Adulta";
        }

        System.out.println(m);

        in.close();
    }
}
