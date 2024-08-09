<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> c92f9310a8ae5c7cb60f61186dfe356a32c0eb7d
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
<<<<<<< HEAD
=======
=======
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
>>>>>>> 5237ffd08bb0919cdc2e97c805224a6444f9441d
>>>>>>> c92f9310a8ae5c7cb60f61186dfe356a32c0eb7d
