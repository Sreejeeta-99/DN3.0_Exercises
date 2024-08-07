<<<<<<< HEAD
// This class represents a customer entity
public class Customer 
{
    private int id;
    private String name;
    private String email;

    // Constructor
    public Customer(int id, String name, String email) 
    {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // Getter methods
    public int getId() 
    {
        return id;
    }
    public String getName() 
    {
        return name;
    }
    public String getEmail() 
    {
        return email;
    }

    // Override toString() method for easy display
    @Override
    public String toString() 
    {
        return "Customer{id=" + id + ", name='" + name + "', email='" + email + "'}";
    }
}
=======
// This class represents a customer entity
public class Customer 
{
    private int id;
    private String name;
    private String email;

    // Constructor
    public Customer(int id, String name, String email) 
    {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // Getter methods
    public int getId() 
    {
        return id;
    }
    public String getName() 
    {
        return name;
    }
    public String getEmail() 
    {
        return email;
    }

    // Override toString() method for easy display
    @Override
    public String toString() 
    {
        return "Customer{id=" + id + ", name='" + name + "', email='" + email + "'}";
    }
}
>>>>>>> 5237ffd08bb0919cdc2e97c805224a6444f9441d
