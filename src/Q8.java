import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Salário por hora: ");
        double salario = input.nextDouble();

        System.out.print("Horas trabalhadas: ");
        double horas = input.nextDouble();

        double total = salario * horas;

        System.out.print("salário total: " + total);
        input.close();
    }
}
