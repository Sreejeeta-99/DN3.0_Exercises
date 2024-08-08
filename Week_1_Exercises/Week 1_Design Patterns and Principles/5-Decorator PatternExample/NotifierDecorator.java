<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> c92f9310a8ae5c7cb60f61186dfe356a32c0eb7d
// Abstract decorator class
public abstract class NotifierDecorator implements Notifier 
{
    protected Notifier decoratedNotifier;

    public NotifierDecorator(Notifier decoratedNotifier) 
    {
        this.decoratedNotifier = decoratedNotifier;
    }

    @Override
    public void send(String message) 
    {
        decoratedNotifier.send(message);
    }
}
<<<<<<< HEAD
=======
=======
// Abstract decorator class
public abstract class NotifierDecorator implements Notifier 
{
    protected Notifier decoratedNotifier;

    public NotifierDecorator(Notifier decoratedNotifier) 
    {
        this.decoratedNotifier = decoratedNotifier;
    }

    @Override
    public void send(String message) 
    {
        decoratedNotifier.send(message);
    }
}
>>>>>>> 5237ffd08bb0919cdc2e97c805224a6444f9441d
>>>>>>> c92f9310a8ae5c7cb60f61186dfe356a32c0eb7d
