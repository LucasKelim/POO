import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Salário: ");
        double salario = input.nextDouble();

        double p = 0.05;
        if (salario <= 280) {
            p = 0.2;
        } else if (salario < 700) {
            p = 0.15;
        } else if (salario < 1500) {
            p = 0.1;
        }

        double aumento = salario * p;
        double novoSalario = salario + aumento;

        System.out.println("Salário antes: " + salario);
        System.out.println("% de aumento: " + (int) (p * 100));
        System.out.println("Valor aumento: " + aumento);
        System.out.println("Novo salario: " + novoSalario);
    }
}
