import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Salário por hora: ");
        double salario = input.nextDouble();

        System.out.println("Horas trabalhadas: ");
        int horas = input.nextInt();

        double total = salario * horas;

        double ir = total * 0.11;
        double inss = total * 0.08;
        double s = total * 0.05;

        double liquido = total - (ir + inss + s);

        System.out.println("Salario: R$ " + total);
        System.out.println("Imposto de renda: R$ " + ir);
        System.out.println("INSS: R$ " + inss);
        System.out.println("Sindicato: R$ " + s);
        System.out.println("Liquido: R$ " + liquido);

        input.close();
    }
}
