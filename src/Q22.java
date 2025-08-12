import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Número menor que 1000: ");
        int num = input.nextInt();

        if (num < 1000) {
            int centenas = num / 100;
            int dezenas = (num - (centenas * 100)) / 10;
            int unidades = (num - (centenas * 100 + dezenas * 10));

            System.out.println("Centenas: " + centenas);
            System.out.println("Dezenas: " + dezenas);
            System.out.println("Unidades: " + unidades);
        }

        input.close();
    }
}
