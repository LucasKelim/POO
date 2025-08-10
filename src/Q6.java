import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int valor = input.nextInt();

        valor++;

        System.out.println(valor);

        input.close();
    }
}
