import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Altura: ");
        float altura = input.nextFloat();
        System.out.println("Peso: ");
        float peso = input.nextFloat();
        System.out.println("Sexo (M ou F): ");
        char sexo = input.next().charAt(0);
    }
}
