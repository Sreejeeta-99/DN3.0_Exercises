public class SingletonPattern
{
    public static void main(String[] args) 
    {
        // Get the first instance of Logger
        Logger ob1 = Logger.getInstance();
        ob1.log("First log message");

        // Get the second instance of Logger
        Logger ob2 = Logger.getInstance();
        ob2.log("Second log message");

        // Check if both instances are the same
        if (ob1 == ob2) 
            System.out.println("Logger is a singleton. Both instances are the same.");
        else 
            System.out.println("Logger is not a singleton. Instances are different.");
    }
}
