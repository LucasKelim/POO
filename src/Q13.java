import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Fatorial: ");
        int fat = in.nextInt();

        int res = 1;
        int x = fat;
        while (x >= 1) {
            res *= x;
            x--;
        }

        System.out.println(res);

        in.close();
    }
}
