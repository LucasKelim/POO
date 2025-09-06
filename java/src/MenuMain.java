import java.util.ArrayList;
import java.util.Scanner;
import Menu.Menu;
import Menu.MenuItem;
import Menu.Order;

public class MenuMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Menu menu = new Menu();
        Order order = new Order();

        ArrayList<MenuItem> menuItems = menu.getMenuItems();

        while (true) {
            System.out.println("\nEscolha 1 item do menu e a quantidade que deseja: ");
            System.out.println("0: Sair do menu");
            menu.showMenu();

            System.out.print("Escolha: ");
            int choice = in.nextInt();
            if (choice == 0) {
                System.out.println("\nSaindo do menu...");
                break;
            }

            MenuItem choiced = null;
            for (MenuItem menuItem : menuItems) {
                if (menuItem.getId() == choice) {
                    choiced = menuItem;
                    break;
                }
            }

            if (choiced == null) {
                System.out.println("\nItem não encontrado, escolha novamente!");
                continue;
            }

            System.out.print("Quantidade: ");
            int quantity = in.nextInt();

            if (order.hasMenuItem(choice)) {
                order.addQuantity(choiced, quantity);
            } else {
                order.addItem(choiced, quantity);
            }

            System.out.println("\n" + choiced.getName() + " x" + quantity + " adicionado!");
        };

        order.showOrder();
        in.close();
    }
}
