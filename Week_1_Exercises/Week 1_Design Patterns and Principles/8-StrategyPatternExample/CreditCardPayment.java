<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> c92f9310a8ae5c7cb60f61186dfe356a32c0eb7d
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
<<<<<<< HEAD
=======
=======
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
>>>>>>> 5237ffd08bb0919cdc2e97c805224a6444f9441d
>>>>>>> c92f9310a8ae5c7cb60f61186dfe356a32c0eb7d
}