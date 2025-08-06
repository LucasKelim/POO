import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int n1 = input.nextInt();
        System.out.print("Digite um numero: ");
        int n2 = input.nextInt();

        int sum = n1 + n2;

        System.out.println("Soma: " + sum);
    }
}
