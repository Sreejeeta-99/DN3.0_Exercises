// This class tests the strategy pattern implementation for payment methods.
public class Test
{
    public static void main(String[] args) 
    {
        // Create a payment context with Credit Card payment strategy
        PaymentContext ob = new PaymentContext(new CreditCardPayment("1234-5678-9876-5432", "John Doe"));
        ob.executePayment(250.00);  // Output: Paid Rs250.0 using Credit Card.

        // Change the payment strategy to PayPal
        ob.setPaymentStrategy(new PayPalPayment("john.doe@example.com"));
        ob.executePayment(150.00);  // Output: Paid Rs150.0 using PayPal.
    }
}