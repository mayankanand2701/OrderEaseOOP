package code;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class User
{
	private String userId;
    private String name;
    private Cart cart = new Cart();
    private List<Order> orderHistory = new ArrayList<>();
    
    public User(String userId, String name) 
    {
        this.userId = userId;
        this.name = name;
    }

    public Cart getCart() { return cart; }
    
    public void placeOrder(PaymentService paymentService)
    {
        double total = cart.calculateTotal();
        if (paymentService.processPayment(total))
        {
            Order order = new Order(UUID.randomUUID().toString(), cart.getItems(), total);
            orderHistory.add(order);
            System.out.println("Payment successful. " + order);
            cart.clear();
        } 
        else System.out.println("Payment failed. Please try again.");
    }
}
