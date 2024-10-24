import java.util.ArrayList;
import java.util.List;

public class FoodOrder {
    private List<String> menuItems;
    private double totalPrice;
    private boolean isPaid;

    public FoodOrder() {
        menuItems = new ArrayList<>();
        totalPrice = 0.0;
        isPaid = false;
    }

    public void addMenuItem(String item) {
        menuItems.add(item);
    }

    public void removeMenuItem(String item) {
        menuItems.remove(item);
    }

    public void calculateTotalPrice(List<Double> prices) {
        totalPrice = 0.0;
        for (double price : prices) {
            totalPrice += price;
        }
    }

    public void markAsPaid() {
        isPaid = true;
    }

    public boolean isOrderPaid() {
        return isPaid;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public List<String> getMenuItems() {
        return menuItems;
    }

    public static void main(String[] args) {
        FoodOrder order = new FoodOrder();
        order.addMenuItem("Burger");
        order.addMenuItem("Ice cream");

        List<Double> prices = new ArrayList<>();
        prices.add(10.0); 
        prices.add(8.5);

        order.calculateTotalPrice(pr
