import java.util.Scanner;

public class Q30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int codigoMaisAlto = 0;
        int codigoMaisBaixo = 0;
        int codigoMaisGordo = 0;
        int codigoMaisMagro = 0;
        double alturaMaisAlta = Double.MIN_VALUE;
        double alturaMaisBaixa = Double.MAX_VALUE;
        double pesoMaisGordo = Double.MIN_VALUE;
        double pesoMaisMagro = Double.MAX_VALUE;

        double somaAlturas = 0;
        double somaPesos = 0;
        int qtdClientes = 0;

        while (true) {
            System.out.print("Código do cliente (0 para sair): ");
            int codigo = in.nextInt();
            if (codigo == 0) {
                break;
            }

            System.out.print("Altura (m): ");
            double altura = in.nextDouble();

            System.out.print("Peso (kg): ");
            double peso = in.nextDouble();

            if (altura > alturaMaisAlta) {
                alturaMaisAlta = altura;
                codigoMaisAlto = codigo;
            }
            if (altura < alturaMaisBaixa) {
                alturaMaisBaixa = altura;
                codigoMaisBaixo = codigo;
            }

            if (peso > pesoMaisGordo) {
                pesoMaisGordo = peso;
                codigoMaisGordo = codigo;
            }
            if (peso < pesoMaisMagro) {
                pesoMaisMagro = peso;
                codigoMaisMagro = codigo;
            }

            somaAlturas += altura;
            somaPesos += peso;
            qtdClientes++;
        }

        if (qtdClientes > 0) {
            double mediaAltura = somaAlturas / qtdClientes;
            double mediaPeso = somaPesos / qtdClientes;

            System.out.println("\n=== Resultados ===");
            System.out.println("Mais alto: cód " + codigoMaisAlto + " - altura " + alturaMaisAlta + "m");
            System.out.println("Mais baixo: cód " + codigoMaisBaixo + " - altura " + alturaMaisBaixa + "m");
            System.out.println("Mais gordo: cód " + codigoMaisGordo + " - peso " + pesoMaisGordo + "kg");
            System.out.println("Mais magro: cód " + codigoMaisMagro + " - peso " + pesoMaisMagro + "kg");
            System.out.printf("Média das alturas: %.2f m\n", mediaAltura);
            System.out.printf("Média dos pesos: %.2f kg\n", mediaPeso);
        } else {
            System.out.println("Nenhum cliente cadastrado.");
        }

        in.close();
    }
}
