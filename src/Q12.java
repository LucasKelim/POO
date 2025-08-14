import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Num: ");
        int num = in.nextInt();

        int anterior = 0;
        int atual = 1;
        int res = 1;

        int x = 1;
        while (x <= num) {
            System.out.println(res);

            res = anterior + atual;

            anterior = atual;
            atual = res;
            x++;
        }

        in.close();
    }
}
