import java.util.Arrays;
import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Quantidade de turmas: ");
        int turmas = in.nextInt();

        int[] alunosTurma = new int[turmas];

        int i = 0;
        while (i < turmas) {
            System.out.println("Turma " + (i + 1));
            System.out.print("Quantidade de alunos: ");
            int alunos = in.nextInt();

            if (alunos < 0 || alunos > 40) {
                System.out.println("Número inválido");
                continue;
            }

            alunosTurma[i] = alunos;

            i++;
        }

        double media = (double) Arrays.stream(alunosTurma).sum() / turmas;

        System.out.println("Média de alunos por turma: " + media);

        in.close();
    }
}
