import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Altura: ");
        double h = input.nextDouble();

        double w = (72.7 * h) - 58;

        System.out.printf("Peso ideal: %.2f kg", w);
    }
}
