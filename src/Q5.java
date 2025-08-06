import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Metros: ");
        float m = input.nextFloat();

        float c = m * 100;

        System.out.println("Centímetros: " + c);
    }
}
