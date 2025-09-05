import java.util.Scanner;

public class NameConcatenatorMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        NameConcatenator nameConcatenator = new NameConcatenator();

        System.out.print("Nome: ");
        nameConcatenator.setName(in.nextLine());

        System.out.print("Sobrenome: ");
        nameConcatenator.setSurname(in.nextLine());

        System.out.println("Seu nome completo é: " + nameConcatenator.concatenate());

        in.close();
    }
}
