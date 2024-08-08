<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> c92f9310a8ae5c7cb60f61186dfe356a32c0eb7d
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
<<<<<<< HEAD
=======
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
>>>>>>> c92f9310a8ae5c7cb60f61186dfe356a32c0eb7d
