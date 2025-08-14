import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Num1: ");
        int num1 = in.nextInt();
        System.out.print("Num2: ");
        int num2 = in.nextInt();

        if (num1 > num2) {
            int aux = num1;
            num1 = num2;
            num2 = aux;
        }

        for (int i = num1; i <= num2; i++) {
            System.out.println(i);
        }

        in.close();
    }
}
