import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Informe a quantidade de CDs: ");
        int qtd = in.nextInt();

        double total = 0;
        int i = 0;
        while (i < qtd) {
            System.out.println("Valor do CD");
            double valor = in.nextInt();
            total += valor;
            i++;
        }

        double media = (double) total / qtd;

        System.out.println("Quantidade de CDs: " + qtd);
        System.out.println("Valor total de CDs: " + total);
        System.out.println("Media: " + media);

        in.close();
    }
}
