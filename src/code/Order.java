package code;

import java.util.HashMap;
import java.util.Map;

public class Order
{
	private String orderId;
    private Map<Product, Integer> orderedItems;
    private double totalAmount;
    private String status;
    
    public Order(String orderId, Map<Product, Integer> items, double total)
    {
        this.orderId = orderId;
        this.orderedItems = new HashMap<>(items);
        this.totalAmount = total;
        this.status = "Pending";
    }
    public void updateStatus(String newStatus)
    {
        this.status = newStatus;
    }
    public String toString()
    {
        return "Order ID: " + orderId + ", Total: $" + totalAmount + ", Status: " + status;
    }
}
