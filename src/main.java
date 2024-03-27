import java.util.ArrayList;
import java.util.List;

public class main {
	public static void main(String[] args) {
        Item item1 = new Item("Book", 20, 1, new AmountDiscount(5), false);
        Item item2 = new TaxableItem("Laptop", 1000, 1, new PercentageDiscount(0.1), false);
        Item item3 = new Item("Gift Card", 10, 1, new NoDiscount(), true);

        List<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);
        EmailSender emailSender = new EmailSender();

        Order order = new Order(items, "John Doe", "johndoe@example.com");

        System.out.println("Total Price: " + order.calculateTotalPrice());

        emailSender.sendConfirmationEmail(items, order.getCustomerName(), order.getCustomerEmail(), order.calculateTotalPrice());

        order.printOrder();
    }
}

