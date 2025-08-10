import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num = input.nextInt();

        String valor = "zero";

        if(num < 0){
            valor = "negativo";
        } else if(num > 0){
            valor = "positivo";
        }

        System.out.println(valor);

        input.close();
    }
}
