import java.util.Scanner;

public class Q27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Num: ");
        float num = input.nextFloat();

        int aux = Math.round(num);

        String m = "Decimal";
        if (aux == num) {
            m = "Inteiro";
        }

        System.out.println(m);

        input.close();
    }
}
