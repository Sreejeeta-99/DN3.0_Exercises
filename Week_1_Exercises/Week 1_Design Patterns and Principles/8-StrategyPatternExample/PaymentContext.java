<<<<<<< HEAD
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
=======
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
>>>>>>> 5237ffd08bb0919cdc2e97c805224a6444f9441d
}