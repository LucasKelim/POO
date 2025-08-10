import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nota 1: ");
        float nota1 = input.nextFloat();

        System.out.println("Nota 2: ");
        float nota2 = input.nextFloat();

        float media = (nota1 + nota2) / 2;

        String mensagem = "Aprovado";
        if (media <= 3) {
            mensagem = "Reprovado";
        } else if (media < 7) {
            mensagem = "Em Exame";
        }

        System.out.println(mensagem);

        input.close();
    }
}
