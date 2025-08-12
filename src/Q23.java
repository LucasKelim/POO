import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Idade 1: ");
        int idade = input.nextInt();
        System.out.println("Idade 2: ");
        int idade2 = input.nextInt();
        System.out.println("Idade 3: ");
        int idade3 = input.nextInt();

        float media = (float) (idade+idade2+idade3)/3;

        String m = "Turma idosa";
        if (media < 25) {
            m = "Turma jovem";
        } else if (media < 40) {
            m = "Turma adulta";
        }

        System.out.println(m);

        input.close();
    }
}
