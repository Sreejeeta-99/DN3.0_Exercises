<<<<<<< HEAD
// Adapter for Payment Gateway B
public class PaymentGatewayB_Adapter implements PaymentProcessor 
{
    private PaymentGatewayB paymentGatewayB;

    public PaymentGatewayB_Adapter(PaymentGatewayB paymentGatewayB) 
    {
        this.paymentGatewayB = paymentGatewayB;
    }

    @Override
    public void processPayment(double amount) 
    {
        paymentGatewayB.executeTransaction(amount);
    }
}
=======
// Adapter for Payment Gateway B
public class PaymentGatewayB_Adapter implements PaymentProcessor 
{
    private PaymentGatewayB paymentGatewayB;

    public PaymentGatewayB_Adapter(PaymentGatewayB paymentGatewayB) 
    {
        this.paymentGatewayB = paymentGatewayB;
    }

    @Override
    public void processPayment(double amount) 
    {
        paymentGatewayB.executeTransaction(amount);
    }
}
>>>>>>> 5237ffd08bb0919cdc2e97c805224a6444f9441d
