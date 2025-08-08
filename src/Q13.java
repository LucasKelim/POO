import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Valor da hora: ");
        double valorHora = input.nextDouble();
        System.out.println("Horas trabalhadas: ");
        int horasTrabalhadas = input.nextInt();

        double salarioBruto = valorHora * horasTrabalhadas;

        double ir = 0.2;
        if (salarioBruto <= 900) {
            ir = 0;
        } else if (salarioBruto <= 1500) {
            ir = 0.05;
        } else if (salarioBruto <= 2000) {
            ir = 0.1;
        }

        double sindicato = 0.03;
        double fgts = 0.11;

        double dIr = salarioBruto * ir;
        double dS = salarioBruto * sindicato;
        double descontos = dIr + dS;
        double salarioFinal = salarioBruto - descontos;

        System.out.printf("Salário Bruto (%.2f * %d): R$ %.2f \n", valorHora, horasTrabalhadas, salarioBruto);
        System.out.printf("(-) IR (%.0f): R$ %.2f \n", (ir * 100), dIr);
        System.out.printf("(-) Sindicato (%.0f): R$ %.2f \n", sindicato, dS);
        System.out.printf("FGTS (%.0f): R$ %.2f \n", fgts, salarioBruto * fgts);
        System.out.printf("Total de descontos: R$ %.2f \n", descontos);
        System.out.printf("Salário liquido: R$ %.2f \n", salarioFinal);
    }
}
