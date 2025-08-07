import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Num1: ");
        int num1 = input.nextInt();

        System.out.println("Num2: ");
        int num2 = input.nextInt();

        int maior = Math.max(num1, num2);

        System.out.println("Maior: " + maior);
    }
}
