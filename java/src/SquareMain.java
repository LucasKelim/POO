import java.util.Scanner;

public class SquareMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Square square = new Square();

        System.out.print("Tamanho do lado do quadrado: ");
        double height = in.nextDouble();

        square.setHeight(height);

        System.out.println("Tamanho do lado do quadrado: " + square.getHeight() + "m");
        System.out.println("Área do quadrado: " + square.area() + "m²");

        in.close();
    }
}
