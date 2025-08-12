import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ano: ");
        int ano = input.nextInt();

        String bissexto = "Não é bissexto";
        if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) {
            bissexto = "É bissexto";
        }

        System.out.println(bissexto);

        input.close();
    }
}
