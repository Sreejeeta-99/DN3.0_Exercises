// This class represents a web app that observes stock prices.
public class WebApp implements Observer 
{
    // Name of the web app.
    private String appName;

    // Constructor to initialize the web app with a name.
    public WebApp(String appName) 
    {
        this.appName = appName;
    }

    // Method to update the web app with the new stock price.
    @Override
    public void update(String stockName, double stockPrice)
    {
        System.out.println(appName + " received update: " + stockName + " is now Rs" + stockPrice);
    }
}
