import java.util.ArrayList;
import java.util.List;

public class main {
	public static void main(String[] args) {
        Item item1 = new AmountDiscountItem("Book", 20, 1, 5, false, false);
        Item item2 = new PercentagedDiscountItem("Laptop", 1000, 1, 0.1, true, false);
        Item item3 = new AmountDiscountItem("Gift Card", 10, 1, 0, false, true);

        List<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);

        Order order = new Order(items, "John Doe", "johndoe@example.com");

        System.out.println("Total Price: " + order.calculateTotalPrice());

        order.sendConfirmationEmail();

        order.printOrder();
    }
}

