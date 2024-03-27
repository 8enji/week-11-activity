import java.util.List;

public class Order {
    private List<Item> items;
    private Customer customer;

    public Order(List<Item> items, Customer customer) {
        this.items = items;
        this.customer = customer;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void printOrder() {
        System.out.println("Order Details:");
        for (Item item : items) {
            System.out.println(item.getName() + " - " + item.getPrice());
        }
    }

    public void addItemsFromAnotherOrder(Order otherOrder) {
        for (Item item : otherOrder.getItems()) {
            items.add(item);
        }
    }

}

