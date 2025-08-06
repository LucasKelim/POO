import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nota 1: ");
        int n1 = input.nextInt();
        System.out.print("Nota 2: ");
        int n2 = input.nextInt();
        System.out.print("Nota 3: ");
        int n3 = input.nextInt();
        System.out.print("Nota 4: ");
        int n4 = input.nextInt();

        int media = (n1+n2+n3+n4)/4;

        System.out.println("Média: " + media);
    }
}
