<<<<<<< HEAD
// This class tests the observer pattern implementation.
public class Test 
{
    public static void main(String[] args)
    {
        // Create a stock market for a specific stock.
        StockMarket googleStock = new StockMarket("Google");

        // Create observers.
        Observer mobileApp = new MobileApp("MobileApp");
        Observer webApp = new WebApp("WebApp");

        // Register observers.
        googleStock.registerObserver(mobileApp);
        googleStock.registerObserver(webApp);

        // Change stock price and notify observers.
        googleStock.setStockPrice(999.00);
        googleStock.setStockPrice(999.50);

        // Deregister an observer.
        googleStock.deregisterObserver(webApp);

        // Change stock price again and notify remaining observers.
        googleStock.setStockPrice(700.50);
    }
}
=======
// This class tests the observer pattern implementation.
public class Test 
{
    public static void main(String[] args)
    {
        // Create a stock market for a specific stock.
        StockMarket googleStock = new StockMarket("Google");

        // Create observers.
        Observer mobileApp = new MobileApp("MobileApp");
        Observer webApp = new WebApp("WebApp");

        // Register observers.
        googleStock.registerObserver(mobileApp);
        googleStock.registerObserver(webApp);

        // Change stock price and notify observers.
        googleStock.setStockPrice(999.00);
        googleStock.setStockPrice(999.50);

        // Deregister an observer.
        googleStock.deregisterObserver(webApp);

        // Change stock price again and notify remaining observers.
        googleStock.setStockPrice(700.50);
    }
}
>>>>>>> 5237ffd08bb0919cdc2e97c805224a6444f9441d
