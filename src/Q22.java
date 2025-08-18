import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Candidatos: ");
        System.out.println("1. Fulano");
        System.out.println("2. Ciclano");
        System.out.println("3. Beltrano");

        System.out.println("Informe a quantidade de votandes: ");
        int votantes = in.nextInt();

        int c1 = 0;
        int c2 = 0;
        int c3 = 0;

        int i = 1;
        while (i <= votantes) {
            System.out.println("Votante " + i);
            System.out.println("Escolha um candidato: ");
            System.out.println("1. Fulano");
            System.out.println("2. Ciclano");
            System.out.println("3. Beltrano");
            int c = in.nextInt();

            if (c == 1) {
                c1++;
            } else if (c == 2) {
                c2++;
            } else if (c == 3) {
                c3++;
            } else {
                System.out.println("Número inválido");
                continue;
            }

            i++;
        }

        System.out.println("Votos: ");
        System.out.println("Candidato 1: " + c1);
        System.out.println("Candidato 2: " + c2);
        System.out.println("Candidato 3: " + c3);

        in.close();
    }
}
