// This interface defines the contract for observers.
public interface Observer 
{
    // Method to update the observer with the new stock price.
    void update(String stockName, double stockPrice);
}
