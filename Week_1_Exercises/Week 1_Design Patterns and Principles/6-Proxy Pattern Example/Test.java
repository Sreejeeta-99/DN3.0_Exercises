<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> c92f9310a8ae5c7cb60f61186dfe356a32c0eb7d
// Test class to demonstrate the Proxy Pattern
public class Test
 {
    public static void main(String[] args) 
    {
        // Create proxy images
        Image ob1 = new ProxyImage("photo1.jpg");
        Image ob2 = new ProxyImage("photo2.jpg");

        // Image1 will be loaded from disk the first time
        ob1.display();
        System.out.println();

        // Image1 will be displayed without loading from disk
        ob1.display();
        System.out.println();

        // Image2 will be loaded from disk the first time
        ob2.display();
        System.out.println();

        // Image2 will be displayed without loading from disk
        ob2.display();
    }
}
<<<<<<< HEAD
=======
=======
// Test class to demonstrate the Proxy Pattern
public class Test
 {
    public static void main(String[] args) 
    {
        // Create proxy images
        Image ob1 = new ProxyImage("photo1.jpg");
        Image ob2 = new ProxyImage("photo2.jpg");

        // Image1 will be loaded from disk the first time
        ob1.display();
        System.out.println();

        // Image1 will be displayed without loading from disk
        ob1.display();
        System.out.println();

        // Image2 will be loaded from disk the first time
        ob2.display();
        System.out.println();

        // Image2 will be displayed without loading from disk
        ob2.display();
    }
}
>>>>>>> 5237ffd08bb0919cdc2e97c805224a6444f9441d
>>>>>>> c92f9310a8ae5c7cb60f61186dfe356a32c0eb7d
