<<<<<<< HEAD
// StockMarket.java
import java.util.ArrayList;
import java.util.List;

// This class represents the stock market that maintains a list of observers and notifies them of changes.
public class StockMarket implements Stock 
{
    // List of registered observers.
    private List<Observer> observers;

    private String stockName;
    private double stockPrice;

    // Constructor to initialize the stock market with a stock name.
    public StockMarket(String stockName) 
    {
        this.stockName = stockName;
        this.observers = new ArrayList<>();
    }

    // Method to register an observer.
    @Override
    public void registerObserver(Observer observer) 
    {
        observers.add(observer);
    }

    // Method to deregister an observer.
    @Override
    public void deregisterObserver(Observer observer) 
    {
        observers.remove(observer);
    }

    // Method to notify all registered observers of a change.
    @Override
    public void notifyObservers() 
    {
        for (Observer observer : observers) 
        {
            observer.update(stockName, stockPrice);
        }
    }

    // Method to change the stock price and notify observers.
    public void setStockPrice(double stockPrice) 
    {
        this.stockPrice = stockPrice;
        notifyObservers();
    }
}
=======
// StockMarket.java
import java.util.ArrayList;
import java.util.List;

// This class represents the stock market that maintains a list of observers and notifies them of changes.
public class StockMarket implements Stock 
{
    // List of registered observers.
    private List<Observer> observers;

    private String stockName;
    private double stockPrice;

    // Constructor to initialize the stock market with a stock name.
    public StockMarket(String stockName) 
    {
        this.stockName = stockName;
        this.observers = new ArrayList<>();
    }

    // Method to register an observer.
    @Override
    public void registerObserver(Observer observer) 
    {
        observers.add(observer);
    }

    // Method to deregister an observer.
    @Override
    public void deregisterObserver(Observer observer) 
    {
        observers.remove(observer);
    }

    // Method to notify all registered observers of a change.
    @Override
    public void notifyObservers() 
    {
        for (Observer observer : observers) 
        {
            observer.update(stockName, stockPrice);
        }
    }

    // Method to change the stock price and notify observers.
    public void setStockPrice(double stockPrice) 
    {
        this.stockPrice = stockPrice;
        notifyObservers();
    }
}
>>>>>>> 5237ffd08bb0919cdc2e97c805224a6444f9441d
