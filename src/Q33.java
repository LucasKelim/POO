import java.util.Scanner;

public class Q33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char[] gabarito = {'a', 'a', 'b', 'b', 'c', 'c', 'd', 'd', 'e', 'e'};
        char[] respostas = new char[gabarito.length];

        for (int i = 0; i < gabarito.length; i++) {
            char resposta;
            while (true) {
                System.out.println("Questão " + (i + 1));
                System.out.print("Resposta: ");
                resposta = input.next().charAt(0);

                if (resposta != 'a' && resposta != 'b'  && resposta != 'c' && resposta != 'd'  && resposta != 'e') {
                    System.out.println("Resposta invalida");
                    continue;
                }

                break;
            }
            respostas[i] = resposta;
        }

        int pontuacao = 0;
        for (int i = 0; i < gabarito.length; i++) {
            String q = "Q" + (i + 1) + ": ";
            String mensagem = q + "Errada, resposta correta (" + gabarito[i] + ")";
            if (gabarito[i] == respostas[i]) {
                pontuacao++;
                mensagem = q + "Correto";
            }
            System.out.println(mensagem);
        }
        System.out.println("Pontuação Final: " + pontuacao);

        input.close();
    }
}
