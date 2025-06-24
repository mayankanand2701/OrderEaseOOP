package code;

import java.util.HashMap;
import java.util.Map;

public class Cart
{
	Map<Product,Integer> items = new HashMap();
	
	public void addProduct(Product product,int qty)
	{
		items.put(product, items.getOrDefault(product, 0) + qty);
	}
	public void removeProduct(Product product)
	{
		items.remove(product);
	}
    public double calculateTotal()
    {
        return items.entrySet().stream()
                .mapToDouble(e -> e.getKey().getPrice() * e.getValue())
                .sum();
    }
    public Map<Product, Integer> getItems()
    {
        return items;
    }

    public void clear()
    {
        items.clear();
    }
}
