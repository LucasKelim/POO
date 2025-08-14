import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Num: ");
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i != 1) {
                System.out.println("+");
            }
            System.out.println(i + " / " + (i*2-1));
        }

        in.close();
    }
}
