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
