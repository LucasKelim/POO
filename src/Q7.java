import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Num1: ");
        int num1 = input.nextInt();

        System.out.print("Num2: ");
        int num2 = input.nextInt();

        System.out.print("Num3: ");
        int num3 = input.nextInt();

        int maior = 0;
        int meio = 0;
        int menor = 0;

        if (num1 > num2 && num2 > num3) {
            maior = num1;
            meio = num2;
            menor = num3;
        } else if (num1 > num2 && num3 > num2) {
            maior = num1;
            meio = num3;
            menor = num2;
        }  else if (num2 > num1 && num2 > num3) {
            maior = num2;
            meio = num3;
            menor = num1;
        } else if (num2 > num1 && num3 > num2) {
            maior = num3;
            meio = num2;
            menor = num1;
        }

        System.out.printf("%d, %d, %d", maior, meio, menor);

        input.close();
    }
}
