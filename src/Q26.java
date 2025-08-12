import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Num: ");
        int num = input.nextInt();

        String res = num % 2 == 0 ? "Par" : "Ímpar";

        System.out.println(res);

        input.close();
    }
}
