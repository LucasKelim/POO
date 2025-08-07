import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Área em m²: ");
        double a = input.nextDouble();

        double cobertura = a / 3;
        int lata = 18;
        double preco = 80.00;

        int latas = (int) Math.ceil(cobertura / lata);

        double pagar = latas * preco;

        System.out.println("Latas: " + latas);
        System.out.println("Pagar: R$ " + pagar);

        input.close();
    }
}
