import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Altura: ");
        double h = input.nextDouble();

        double men = (72.7 * h) - 58;
        double women = (62.1 * h) - 44.7;

        System.out.printf("Peso ideal homem: %.2f kg \n", men);
        System.out.printf("Peso ideal mulher: %.2f kg \n", women);
    }
}
