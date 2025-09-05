import java.util.ArrayList;
import java.util.Arrays;

public class Menu {
    private ArrayList<MenuItem> menuItems = new ArrayList<>(
            Arrays.asList(
                    new MenuItem(100, "Cachorro Quente", 1.2),
                    new MenuItem(101, "Bauru Simples", 1.3),
                    new MenuItem(102, "Bauru com ovo", 1.5),
                    new MenuItem(103, "Hambúrguer", 1.2),
                    new MenuItem(104, "Cheeseburguer", 1.3),
                    new MenuItem(105, "Refrigerante", 1)
            )
    );
}
