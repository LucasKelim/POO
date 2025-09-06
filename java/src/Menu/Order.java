package Menu;

import java.util.ArrayList;

public class Order {
    private ArrayList<OrderItem> orderItems = new ArrayList<OrderItem>();

    public void addItem(MenuItem menuItem, int quantity) {
        orderItems.add(new OrderItem(menuItem, quantity));
    }

    public void addQuantity(MenuItem menuItem, int quantity) {
        for (OrderItem orderItem : orderItems) {
            if (orderItem.getItem().getId() == menuItem.getId()) {
                orderItem.setQuantity(orderItem.getQuantity() + quantity);
            }
        }
    }

    public double getTotal() {
        double total = 0;
        for (OrderItem orderItem : orderItems) {
            total += orderItem.getSubTotal();
        }

        return total;
    }

    public boolean hasMenuItem(int menuItemId) {
        for (OrderItem orderItem : orderItems) {
            if (orderItem.getItem().getId() == menuItemId) {
                return true;
            }
        }

        return false;
    }

    public void showOrder() {
        System.out.println("\nResumo do Pedido");
        for (OrderItem orderItem : orderItems) {
            System.out.printf("%s x%d - R$ %.2f\n", orderItem.getItem().getName(), orderItem.getQuantity(), orderItem.getSubTotal());
        }
        System.out.printf("Total: R$ %.2f\n", getTotal());
    }
}
