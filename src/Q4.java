import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("População A: ");
            int pa = in.nextInt();
            in.nextLine();
            if (pa < 0) {
                System.out.println("População deve ser maior que 0");
                continue;
            }
            System.out.println("Taxa de crescimento (%): ");
            float ta = in.nextFloat();
            in.nextLine();
            if (ta < 0) {
                System.out.println("Taxa de crescimento deve ser maior que 0");
                continue;
            }

            System.out.println("População B: ");
            int pb = in.nextInt();
            in.nextLine();
            if (pb < 0) {
                System.out.println("População deve ser maior que 0");
                continue;
            }
            System.out.println("Taxa de crescimento (%): ");
            float tb = in.nextFloat();
            in.nextLine();
            if (tb < 0) {
                System.out.println("Taxa de crescimento deve ser maior que 0");
                continue;
            }

            if (pa >= pb) {
                System.out.println("População A deve ser maior que B");
                continue;
            }

            if (ta <= tb) {
                System.out.println("Taxa de crescimento A deve ser maior que B");
                continue;
            }

            int a = pa;
            int b = pb;
            int anos = 0;
            while (a < b) {
                a += a * (ta / 100);
                b += b * (tb / 100);
                anos++;
            }
            System.out.println("Anos: " + anos);

            System.out.print("Continuar operação? (s/n): ");
            String c = in.nextLine().toLowerCase();
            if (c.equals("n")) {
                break;
            }
        }

        in.close();
    }
}
