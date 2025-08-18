import java.util.Scanner;

public class Q29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Montar a tabuada de: ");
        int tabuada = in.nextInt();
        System.out.print("Começar por: ");
        int comecar = in.nextInt();
        System.out.print("Terminar em: ");
        int terminar = in.nextInt();

        if (comecar > terminar) {
            int aux = comecar;
            comecar = terminar;
            terminar = aux;
        }

        System.out.println("Vou montar a tabuada de " + tabuada + " começando em " + comecar + " e terminando em " + terminar + ":");
        for (int i = comecar; i <= terminar; i++) {
            System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
        }

        in.close();
    }
}
