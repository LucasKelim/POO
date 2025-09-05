import java.util.Scanner;

public class SalaryCalculatorMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Valor da hora: ");
        double hourlyWage = in.nextDouble();

        System.out.print("Horas trabalhadas: ");
        double hoursWorked = in.nextDouble();

        SalaryCalculator salary = new SalaryCalculator(hourlyWage, hoursWorked);

        System.out.println("+ Salário Bruto: R$ " + salary.getGrossSalary());
        System.out.println("- IR (" + salary.getIrRate() * 100 + "%): R$ " + salary.calculateIrRate());
        System.out.println("- INSS (" + salary.getInssRate() * 100 + "%): R$ " + salary.calculateInssRate());
        System.out.println("- Sindicato (" + salary.getSindicatoRate() * 100 + "%): R$ " + salary.calculateSindicatoRate());
        System.out.println("= Salário Liquido : R$ " + salary.getNetSalary());

        in.close();
    }
}
