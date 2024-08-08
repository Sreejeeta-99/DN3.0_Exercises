<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> c92f9310a8ae5c7cb60f61186dfe356a32c0eb7d
// Concrete decorator class for Slack notifications
public class SlackNotifierDecorator extends NotifierDecorator 
{
    public SlackNotifierDecorator(Notifier decoratedNotifier) 
    {
        super(decoratedNotifier);
    }

    @Override
    public void send(String message) 
    {
        super.send(message);
        sendSlack(message);
    }

    private void sendSlack(String message) 
    {
        System.out.println("Sending Slack message: " + message);
    }
}
<<<<<<< HEAD
=======
=======
// Concrete decorator class for Slack notifications
public class SlackNotifierDecorator extends NotifierDecorator 
{
    public SlackNotifierDecorator(Notifier decoratedNotifier) 
    {
        super(decoratedNotifier);
    }

    @Override
    public void send(String message) 
    {
        super.send(message);
        sendSlack(message);
    }

    private void sendSlack(String message) 
    {
        System.out.println("Sending Slack message: " + message);
    }
}
>>>>>>> 5237ffd08bb0919cdc2e97c805224a6444f9441d
>>>>>>> c92f9310a8ae5c7cb60f61186dfe356a32c0eb7d
