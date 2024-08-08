<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> c92f9310a8ae5c7cb60f61186dfe356a32c0eb7d
public class Logger 
{
    // Private static instance of Logger
    private static Logger instance;

    // Private constructor to prevent instantiation
    private Logger() 
    {
        // Initialize the logger if needed
    }

    // Public static method to get the instance of Logger
    public static Logger getInstance() 
    {
        if (instance == null) 
        {
            synchronized (Logger.class) //only one thread can execute the code inside the block at any given time i.e, thread safe
            {
                if (instance == null) 
                    instance = new Logger();
            }
        }
        return instance;
    }

    // Method to log messages
    public void log(String message) 
    {
        System.out.println("Log: " + message);
    }
}
<<<<<<< HEAD
=======
=======
public class Logger 
{
    // Private static instance of Logger
    private static Logger instance;

    // Private constructor to prevent instantiation
    private Logger() 
    {
        // Initialize the logger if needed
    }

    // Public static method to get the instance of Logger
    public static Logger getInstance() 
    {
        if (instance == null) 
        {
            synchronized (Logger.class) //only one thread can execute the code inside the block at any given time i.e, thread safe
            {
                if (instance == null) 
                    instance = new Logger();
            }
        }
        return instance;
    }

    // Method to log messages
    public void log(String message) 
    {
        System.out.println("Log: " + message);
    }
}
>>>>>>> 5237ffd08bb0919cdc2e97c805224a6444f9441d
>>>>>>> c92f9310a8ae5c7cb60f61186dfe356a32c0eb7d
