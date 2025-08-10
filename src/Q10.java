import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Num1: ");
        int num1 = input.nextInt();
        System.out.print("Num2: ");
        int num2 = input.nextInt();
        System.out.print("Num3: ");
        int num3 = input.nextInt();

        int maior = Math.max(Math.max(num1, num2), num3);
        int menor = Math.min(Math.min(num1, num2), num3);

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);

        input.close();
    }
}
