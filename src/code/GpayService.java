package code;

import java.util.Random;

public class GpayService implements PaymentService
{
	public boolean processPayment(double amount)
	{
		// To randomly simulate payment success/failure
        return new Random().nextBoolean(); 
    }
}
