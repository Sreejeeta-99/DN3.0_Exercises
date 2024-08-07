<<<<<<< HEAD
public class AdapterPattern
{
    public static void main(String[] args) 
    {
        // Create instances of third-party payment gateways
        PaymentGatewayA ob1 = new PaymentGatewayA();
        PaymentGatewayB ob2 = new PaymentGatewayB();

        // Create adapters for each payment gateway
        PaymentProcessor obj1 = new PaymentGatewayA_Adapter(ob1);
        PaymentProcessor obj2 = new PaymentGatewayB_Adapter(ob2);

        // Use adapters to process payments
        obj1.processPayment(999.0);
        obj2.processPayment(2000.0);
    }
}
=======
public class AdapterPattern
{
    public static void main(String[] args) 
    {
        // Create instances of third-party payment gateways
        PaymentGatewayA ob1 = new PaymentGatewayA();
        PaymentGatewayB ob2 = new PaymentGatewayB();

        // Create adapters for each payment gateway
        PaymentProcessor obj1 = new PaymentGatewayA_Adapter(ob1);
        PaymentProcessor obj2 = new PaymentGatewayB_Adapter(ob2);

        // Use adapters to process payments
        obj1.processPayment(999.0);
        obj2.processPayment(2000.0);
    }
}
>>>>>>> 5237ffd08bb0919cdc2e97c805224a6444f9441d
