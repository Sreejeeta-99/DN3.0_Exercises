// This class implements the payment strategy using PayPal
public class PayPalPayment implements PaymentStrategy 
{
    private String email;

    // Constructor to initialize PayPal email
    public PayPalPayment(String email) 
    {
        this.email = email;
    }

    // Method to perform the payment operation using PayPal
    @Override
    public void pay(double amount) 
    {
        System.out.println("Rs Rs" + amount + " using PayPal.");
    }
}