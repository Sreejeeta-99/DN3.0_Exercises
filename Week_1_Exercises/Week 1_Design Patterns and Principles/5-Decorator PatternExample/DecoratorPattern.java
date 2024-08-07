// Test class to demonstrate the Decorator Pattern
public class DecoratorPattern
{
    public static void main(String[] args) 
    {
        // Create a basic email notifier
        Notifier ob1 = new EmailNotifier();

        // Decorating email notifier with SMS functionality
        Notifier ob2 = new SMSNotifierDecorator(ob1);

        // Decorating email notifier with Slack functionality
        Notifier ob3 = new SlackNotifierDecorator(ob1);

        // Send notifications using various decorators
        System.out.println("Sending notifications with different channels:");
        ob1.send("Hello, this is a test message!!");
        ob2.send("Hello, this is a test message!!");
        ob3.send("Hello, this is a test message!!");
    }
}
