import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Temperatura em Fahrenheit: ");
        double f = input.nextDouble();

        double celsius = (f - 32) * 5 / 9;

        System.out.println("Temperatura em Celsius: " + celsius);

        input.close();
    }
}
