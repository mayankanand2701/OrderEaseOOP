package code;

public class EcommerceApp 
{

	public static void main(String[] args) 
	{
		// Sample products
        Product p1 = new Product(101, "Smartphone", 699.99, 10);
        Product p2 = new Product(102, "Laptop", 1299.99, 5);
        
        
        // User
        User user = new User("U001", "Sushma");
        
        // Add products to cart
        user.getCart().addProduct(p1, 2);
        user.getCart().addProduct(p2, 1);

   
        // Show cart total
        System.out.println("Cart Total: $" + user.getCart().calculateTotal());
        
        // Place order
        PaymentService paymentService = new GpayService();
        user.placeOrder(paymentService);
	}
}
