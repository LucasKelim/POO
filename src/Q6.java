import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Raio: ");
        double r = input.nextFloat();

        double a = Math.PI * Math.pow(r, 2);

        System.out.print("Área: " + a);

        input.close();
    }
}
