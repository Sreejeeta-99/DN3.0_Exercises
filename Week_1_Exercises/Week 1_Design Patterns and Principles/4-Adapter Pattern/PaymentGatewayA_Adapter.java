<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> c92f9310a8ae5c7cb60f61186dfe356a32c0eb7d
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
<<<<<<< HEAD
=======
=======
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
>>>>>>> 5237ffd08bb0919cdc2e97c805224a6444f9441d
>>>>>>> c92f9310a8ae5c7cb60f61186dfe356a32c0eb7d
