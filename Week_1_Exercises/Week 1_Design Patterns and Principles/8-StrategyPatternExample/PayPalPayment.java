<<<<<<< HEAD
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
=======
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
>>>>>>> 5237ffd08bb0919cdc2e97c805224a6444f9441d
}