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
