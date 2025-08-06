import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lado : ");
        double lado = input.nextDouble();

        double area = Math.pow(lado, 2);

        System.out.print("Área: " + area);
    }
}
