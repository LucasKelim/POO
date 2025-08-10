import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("a: ");
        int a = input.nextInt();

        if (a == 0) {
            System.out.println("'a' não pode ser zero!");
            System.exit(0);
        }

        System.out.print("b: ");
        int b = input.nextInt();
        System.out.print("c: ");
        int c = input.nextInt();

        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta < 0) {
            System.out.println("Não possui raizes nos reais!");
        }

        if (delta == 0) {
            double x = (double) -b / (2 * a);
            System.out.println("Raiz: " + x);
        }

        if (delta > 0) {
            double x1 = ((double) -b + Math.sqrt(delta)) / (2 * a);
            double x2 = ((double) -b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Raiz 1: " + x1);
            System.out.println("Raiz 2: " + x2);
        }

        input.close();
    }
}
