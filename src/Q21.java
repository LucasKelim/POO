import java.util.Arrays;
import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Data no formato (dd/mm/aaaa): ");
        String data = input.nextLine();

        String[] splitData = data.split("/");

        if (splitData.length == 3) {
            int dia = Integer.parseInt(splitData[0]);
            int mes = Integer.parseInt(splitData[1]);
            char[] ano = splitData[2].toCharArray();
            if (dia >= 1 && dia <= 30 && mes >= 1 && mes <= 12 && ano.length == 4) {
                System.out.println("Data válida");
            } else {
                System.out.println("Data inválida");
            }
        } else {
            System.out.println("Data inválida");
        }

        input.close();
    }
}
