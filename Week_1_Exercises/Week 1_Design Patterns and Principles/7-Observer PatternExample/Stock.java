
// This interface defines the contract for stock subjects.
public interface Stock 
{
    void registerObserver(Observer observer);
    void deregisterObserver(Observer observer);
    void notifyObservers();
}
