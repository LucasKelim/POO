import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Área em m²: ");
        double a = input.nextDouble();

        double cobertura = a / 6;
        int lata = 18;
        double galao = 3.6;
        double precoLata = 80.00;
        double precoGalao = 25.00;

        int latas = (int) Math.ceil(cobertura / lata);
        int galoes = (int) Math.ceil(cobertura / galao);

        double pagarLata = latas * precoLata;
        double pagarGalao = galoes * precoGalao;

        System.out.println("Latas: " + latas);
        System.out.println("Galão: " + galoes);
        System.out.println("Pagar latas: R$ " + pagarLata);
        System.out.println("Pagar galão: R$ " + pagarGalao);

        input.close();
    }
}
