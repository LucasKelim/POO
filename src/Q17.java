import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nota 1: ");
        float nota1 = input.nextFloat();

        System.out.println("Nota 2: ");
        float nota2 = input.nextFloat();

        float media = (nota1 + nota2) / 2;

        String mensagem = "Aprovado";
        String conceito = "A";
        if (media < 4) {
            mensagem = "Reprovado";
            conceito = "E";
        } else if (media < 6) {
            mensagem = "Reprovado";
            conceito = "D";
        } else if (media < 7.5) {
            mensagem = "Aprovado";
            conceito = "C";
        } else if (media < 9) {
            mensagem = "Aprovado";
            conceito = "B";
        }

        System.out.println("Nota1: " + nota1);
        System.out.println("Nota2: " + nota2);
        System.out.println("Media: " + media);
        System.out.println("Conceito: " + conceito);
        System.out.println("Situação: " + mensagem);

        input.close();
    }
}
