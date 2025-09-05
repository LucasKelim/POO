import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Calculator calc = new Calculator();

        System.out.print("a: ");
        calc.setA(in.nextDouble());

        System.out.print("b: ");
        calc.setB(in.nextDouble());

        System.out.println("Adição: " + calc.addition());
        System.out.println("Subtração: " + calc.subtraction());
        System.out.println("Multiplicação: " + calc.multiplication());
        System.out.println("Divisão: " + (Double.isNaN(calc.division()) ? "Divisão por 0 inválida" : calc.division()));

        in.close();
    }
}
