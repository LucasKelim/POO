import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;
import java.util.Scanner;

public class NumberRangeMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        NumberRange numberRange = new NumberRange();

        System.out.print("Inicio: ");
        numberRange.setMin(in.nextInt());

        System.out.print("Fim: ");
        numberRange.setMax(in.nextInt());

        if (numberRange.getMin() > numberRange.getMax()) {
            System.out.println("Invertendo valores!");
            int aux = numberRange.getMax();
            numberRange.setMax(numberRange.getMin());
            numberRange.setMin(aux);
        }

        int[] range = numberRange.generate();
        System.out.print(Arrays.toString(range));

        in.close();
    }
}
