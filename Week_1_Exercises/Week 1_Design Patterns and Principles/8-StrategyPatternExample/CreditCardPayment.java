// This class implements the payment strategy using a credit card
public class CreditCardPayment implements PaymentStrategy 
{
    private String cardNumber;
    private String cardHolderName;

    // Constructor to initialize credit card details.
    public CreditCardPayment(String cardNumber, String cardHolderName) 
    {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    // Method to perform the payment operation using a credit card
    @Override
    public void pay(double amount) 
    {
        System.out.println("Paid Rs" + amount + " using Credit Card.");
    }
}