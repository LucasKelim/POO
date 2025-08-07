import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Número inteiro: ");
        int n1 = input.nextInt();

        System.out.println("Número inteiro: ");
        int n2 = input.nextInt();

        System.out.println("Número real: ");
        float n3 = input.nextFloat();

        int a = (n1 * 2) * (n2 / 2);

        float b = (n1 * 3) + n3;

        double c = Math.pow(n3, 3);

        System.out.println("A. R: " + a);
        System.out.println("B. R: " + b);
        System.out.println("C. R: " + c);

        input.close();
    }
}
