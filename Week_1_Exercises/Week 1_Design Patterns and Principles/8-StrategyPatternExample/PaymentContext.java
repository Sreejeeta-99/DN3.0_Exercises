// This class holds a reference to a PaymentStrategy and executes the strategy
public class PaymentContext 
{
    private PaymentStrategy paymentStrategy;

    // Constructor to initialize the payment strategy
    public PaymentContext(PaymentStrategy paymentStrategy) 
    {
        this.paymentStrategy = paymentStrategy;
    }

    // Method to set or change the payment strategy
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) 
    {
        this.paymentStrategy = paymentStrategy;
    }

    // Method to execute the payment operation
    public void executePayment(double amount) 
    {
        paymentStrategy.pay(amount);
    }
}