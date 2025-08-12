import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Valor do saque: ");
        int saque = input.nextInt();

        if (saque >= 10 && saque <= 600) {
            int cem = saque / 100;
            int cinquenta = (saque - (cem * 100)) / 50;
            int dez = (saque - (cem * 100 + cinquenta * 50)) / 10;
            int cinco = (saque - (cem * 100 + cinquenta * 50 + dez * 10)) / 5;
            int um = saque - (cem * 100 + cinquenta * 50 + dez * 10 + cinco * 5);
            System.out.println("Cem: " + cem);
            System.out.println("Cinquenta: " + cinquenta);
            System.out.println("Dez: " + dez);
            System.out.println("Cinco: " + cinco);
            System.out.println("Um: " + um);
        } else {
            System.out.println("Valor inválido!");
        }

        input.close();
    }
}
