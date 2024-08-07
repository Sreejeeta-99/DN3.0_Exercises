<<<<<<< HEAD
// This class represents a mobile app that observes stock prices.
public class MobileApp implements Observer 
{
    // Name of the mobile app.
    private String appName;

    // Constructor to initialize the mobile app with a name.
    public MobileApp(String appName) 
    {
        this.appName = appName;
    }

    // Method to update the mobile app with the new stock price.
    @Override
    public void update(String stockName, double stockPrice) 
    {
        System.out.println(appName + " received update: " + stockName + " is now Rs" + stockPrice);
    }
}

=======
// This class represents a mobile app that observes stock prices.
public class MobileApp implements Observer 
{
    // Name of the mobile app.
    private String appName;

    // Constructor to initialize the mobile app with a name.
    public MobileApp(String appName) 
    {
        this.appName = appName;
    }

    // Method to update the mobile app with the new stock price.
    @Override
    public void update(String stockName, double stockPrice) 
    {
        System.out.println(appName + " received update: " + stockName + " is now Rs" + stockPrice);
    }
}

>>>>>>> 5237ffd08bb0919cdc2e97c805224a6444f9441d
