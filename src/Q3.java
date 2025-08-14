import java.util.Locale;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String name;
        int age;
        double salary;
        String gender;
        String status;
        boolean validation = true;
        while (validation) {
            System.out.print("Nome (mínimo 3 caracteres): ");
            name = in.nextLine();
            if (name.length() < 3) {
                System.out.println("Nome deve ter no minimo 3 caracteres");
                continue;
            }
            System.out.print("Idade (entre 0 e 150): ");
            age = in.nextInt();
            in.nextLine();
            if (age < 0 || age > 150) {
                System.out.println("Idade deve ser entre 0 e 150");
                continue;
            }
            System.out.print("Salário (acima de 0): ");
            salary = in.nextDouble();
            in.nextLine();
            if (salary < 0) {
                System.out.println("Salário deve ser maior que zero");
                continue;
            }
            System.out.print("Gênero (m ou f): ");
            gender = in.nextLine().toLowerCase();
            if (!gender.equals("m") && !gender.equals("f")) {
                System.out.println("Gênero deve ser m ou f");
                continue;
            }
            System.out.print("Estado Civil (s, c, v ou d): ");
            status = in.nextLine().toLowerCase();
            if (!status.equals("s") && !status.equals("c") && !status.equals("v") && !status.equals("d")) {
                System.out.println("Estado Civil deve ser s, c, v ou d");
                continue;
            }

            validation = false;
        };

        in.close();
    }
}
