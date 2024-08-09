<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> c92f9310a8ae5c7cb60f61186dfe356a32c0eb7d
// Concrete decorator class for SMS notifications
public class SMSNotifierDecorator extends NotifierDecorator 
{
    public SMSNotifierDecorator(Notifier decoratedNotifier) 
    {
        super(decoratedNotifier);
    }

    @Override
    public void send(String message) 
    {
        super.send(message);
        sendSMS(message);
    }

    private void sendSMS(String message) 
    {
        System.out.println("Sending SMS: " + message);
    }
}
<<<<<<< HEAD
=======
=======
// Concrete decorator class for SMS notifications
public class SMSNotifierDecorator extends NotifierDecorator 
{
    public SMSNotifierDecorator(Notifier decoratedNotifier) 
    {
        super(decoratedNotifier);
    }

    @Override
    public void send(String message) 
    {
        super.send(message);
        sendSMS(message);
    }

    private void sendSMS(String message) 
    {
        System.out.println("Sending SMS: " + message);
    }
}
>>>>>>> 5237ffd08bb0919cdc2e97c805224a6444f9441d
>>>>>>> c92f9310a8ae5c7cb60f61186dfe356a32c0eb7d
