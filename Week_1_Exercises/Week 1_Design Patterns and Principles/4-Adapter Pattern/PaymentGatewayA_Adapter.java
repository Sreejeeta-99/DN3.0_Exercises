// Adapter for Payment Gateway A
public class PaymentGatewayA_Adapter implements PaymentProcessor 
{
    private PaymentGatewayA paymentGatewayA;

    public PaymentGatewayA_Adapter(PaymentGatewayA paymentGatewayA) 
    {
        this.paymentGatewayA = paymentGatewayA;
    }

    @Override
    public void processPayment(double amount) 
    {
        paymentGatewayA.makePayment(amount);
    }
}
