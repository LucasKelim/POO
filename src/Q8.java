import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nota 1: ");
        float nota1 = input.nextFloat();

        System.out.println("Nota 2: ");
        float nota2 = input.nextFloat();

        float media = (nota1 + nota2) / 2;

        String mensagem = media >= 7 ? "Aprovado" : "Reprovado";

        System.out.println(mensagem);
    }
}
