<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> c92f9310a8ae5c7cb60f61186dfe356a32c0eb7d
// Proxy Class that also implements Image interface
public class ProxyImage implements Image
{
    private String filename;
    private RealImage realImage;

    // Constructor that takes the filename of the image
    public ProxyImage(String filename) 
    {
        this.filename = filename;
    }

    // Implementation of the display method from the Image interface
    @Override
    public void display() 
    {
        // Lazy initialization: Loading the RealImage only when needed
        if (realImage == null) 
            realImage = new RealImage(filename);
        
        // Delegate the display call to the RealImage
        realImage.display();
    }
}
<<<<<<< HEAD
=======
=======
// Proxy Class that also implements Image interface
public class ProxyImage implements Image
{
    private String filename;
    private RealImage realImage;

    // Constructor that takes the filename of the image
    public ProxyImage(String filename) 
    {
        this.filename = filename;
    }

    // Implementation of the display method from the Image interface
    @Override
    public void display() 
    {
        // Lazy initialization: Loading the RealImage only when needed
        if (realImage == null) 
            realImage = new RealImage(filename);
        
        // Delegate the display call to the RealImage
        realImage.display();
    }
}
>>>>>>> 5237ffd08bb0919cdc2e97c805224a6444f9441d
>>>>>>> c92f9310a8ae5c7cb60f61186dfe356a32c0eb7d
