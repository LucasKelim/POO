import java.util.Arrays;
import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite quantos números: ");
        int n = in.nextInt();

        int[] nums = new int[n];

        int i = 0;
        while (i < n) {
            System.out.print(i + ". ");
            nums[i] = in.nextInt();
            i++;
        };

        int maior = Arrays.stream(nums).max().getAsInt();
        int menor = Arrays.stream(nums).min().getAsInt();
        int soma = Arrays.stream(nums).sum();

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Soma: " + soma);

        in.close();
    }
}
