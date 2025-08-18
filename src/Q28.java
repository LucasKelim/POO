import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<Double> temperaturas = new ArrayList<>();

        while (true) {
            System.out.println("Digite uma temperatura: ");
            double temp = in.nextDouble();
            temperaturas.add(temp);

            System.out.println("Continuar? (s/n)");
            String resposta = in.next();
            if (resposta.equalsIgnoreCase("n")) {
                break;
            }
        }

        double maior = temperaturas.stream().mapToDouble(Double::doubleValue).max().getAsDouble();
        double menor = temperaturas.stream().mapToDouble(Double::doubleValue).min().getAsDouble();
        double media = temperaturas.stream().mapToDouble(Double::doubleValue).average().getAsDouble();

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Media: " + media);

        in.close();
    }
}
