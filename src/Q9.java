import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Altura (m): ");
        float altura = input.nextFloat();
        System.out.println("Peso (kg): ");
        float peso = input.nextFloat();
        input.nextLine();
        System.out.println("Sexo (M ou F): ");
        String sexo = input.nextLine().toUpperCase();

        double imc = peso / Math.pow(altura, 2);

        double pesoIdeal = 0;
        String mensagem = "Peso normal";
        String s = "";

        if (sexo.equals("M")) {
            pesoIdeal = (72.7 * altura) - 58;
            s = "Homem";
        } else if (sexo.equals("F")) {
            pesoIdeal = (62.1 * altura) - 44.7;
            s = "Mulher";
        }

        if (imc < 18.5) {
            mensagem = "Abaixo do peso";
        } else if (imc >= 25) {
            mensagem = "Acima do peso";
        }

        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.println("Sexo: " + s);
        System.out.printf("Peso ideal: %.2f \n", pesoIdeal);
        System.out.println(mensagem);

        input.close();
    }
}
