import java.util.Scanner;

public class Q29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("0 - Não");
        System.out.println("1 - Sim");
        System.out.println("Telefonou para a vítima?");
        int res1 = input.nextInt();
        System.out.println("Esteve no local do crime?");
        int res2 = input.nextInt();
        System.out.println("Mora perto da vítima?");
        int res3 = input.nextInt();
        System.out.println("Devia para a vítima?");
        int res4 = input.nextInt();
        System.out.println("Já trabalhou com a vítima?");
        int res5 = input.nextInt();

        int total = res1 + res2 + res3 + res4 + res5;

        String m = switch (total) {
            case 2 -> "Suspeita";
            case 3, 4 -> "Cúmplice";
            case 5 -> "Assassino";
            default -> "Inocente";
        };

        System.out.println(m);

        input.close();
    }
}
