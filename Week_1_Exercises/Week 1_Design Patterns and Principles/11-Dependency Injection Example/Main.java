// This class tests the dependency injection by creating and using the CustomerService class
public class Main 
{
    public static void main(String[] args) 
    {
        // Create an instance of CustomerRepositoryImpl
        CustomerRepository ob1 = new CustomerRepositoryImpl();
        
        // Inject the repository into CustomerService using constructor injection
        CustomerService ob2 = new CustomerService(ob1);
        
        // Use CustomerService to get a customer by ID
        Customer ob3 = ob2.getCustomerById(1);
        
        // Display customer details
        if (ob3 != null) 
            System.out.println("Customer details: " + ob3);
        else 
            System.out.println("Customer not found.");
    }
}