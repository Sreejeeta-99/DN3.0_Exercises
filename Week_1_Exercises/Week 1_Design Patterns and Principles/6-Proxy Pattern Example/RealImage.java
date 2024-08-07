<<<<<<< HEAD
// Real Subject Class
public class RealImage implements Image 
{
    private String filename;

    // Constructor that takes the filename of the image
    public RealImage(String filename) 
    {
        this.filename = filename;
        System.out.println("Loading " + filename);
    }

     // Implementation of the display method from the Image interface
    @Override
    public void display() 
    {
        System.out.println("Displaying " + filename);
    }
}
=======
// Real Subject Class
public class RealImage implements Image 
{
    private String filename;

    // Constructor that takes the filename of the image
    public RealImage(String filename) 
    {
        this.filename = filename;
        System.out.println("Loading " + filename);
    }

     // Implementation of the display method from the Image interface
    @Override
    public void display() 
    {
        System.out.println("Displaying " + filename);
    }
}
>>>>>>> 5237ffd08bb0919cdc2e97c805224a6444f9441d
