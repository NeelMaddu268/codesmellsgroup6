import java.util.ArrayList;
import java.util.List;

public class main {
	public static void main(String[] args) {
        Item item1 = new AmountDiscountItem("Book", 20, 1, 5);
        Item item2 = new PercentagedDiscountItem("Laptop", 1000, 1, 0.1);
        Item item2Taxable = new TaxableItem(item2);
        Item item3 = new GiftCardItem("Gift Card", 10, 1, 0);

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

