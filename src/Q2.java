import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String user;
        String pass;
        do {
            System.out.print("Usuário: ");
            user = in.nextLine();
            System.out.print("Senha: ");
            pass = in.nextLine();
            if (user.equals(pass)) {
                System.out.println("Usuário e senha não podem ser iguais!");
            }
        } while (user.equals(pass));

        System.out.println("Correto!");

        in.close();
    }
}
