public class Q25 {
    public static void main(String[] args) {
        System.out.println("Lojas Quase Dois - Tabela de preços");
        double preco = 1.99;
        int i = 1;
        while (i <= 50) {
            System.out.printf("%d - R$ %.2f\n", i, i * preco);
            i++;
        }
    }
}
