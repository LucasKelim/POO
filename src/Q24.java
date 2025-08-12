import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nota 1: ");
        float nota1 = input.nextFloat();
        System.out.println("Nota 2: ");
        float nota2 = input.nextFloat();
        System.out.println("Nota 3: ");
        float nota3 = input.nextFloat();

        float media =  (nota1+nota2+nota3)/3;

        String mensagem = "";
        if (media < 7) {
            mensagem = "Reprovado";
        } else if (media < 10) {
            mensagem = "Aprovado";
        } else if (media == 10) {
            mensagem = "Aprovado com Distinção";
        }

        System.out.println(mensagem);

        input.close();
    }
}
