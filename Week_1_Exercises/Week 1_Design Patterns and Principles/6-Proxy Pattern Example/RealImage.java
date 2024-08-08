<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> c92f9310a8ae5c7cb60f61186dfe356a32c0eb7d
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
<<<<<<< HEAD
=======
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
>>>>>>> c92f9310a8ae5c7cb60f61186dfe356a32c0eb7d
