<<<<<<< HEAD
// This class provides services related to customers and depends on CustomerRepository for data access
public class CustomerService 
{
    
    private final CustomerRepository customerRepository;

    // Constructor to inject the dependency
    public CustomerService(CustomerRepository customerRepository) 
    {
        this.customerRepository = customerRepository;
    }

    // Method to get customer details by ID
    public Customer getCustomerById(int id) 
    {
        return customerRepository.findCustomerById(id);
    }
=======
// This class provides services related to customers and depends on CustomerRepository for data access
public class CustomerService 
{
    
    private final CustomerRepository customerRepository;

    // Constructor to inject the dependency
    public CustomerService(CustomerRepository customerRepository) 
    {
        this.customerRepository = customerRepository;
    }

    // Method to get customer details by ID
    public Customer getCustomerById(int id) 
    {
        return customerRepository.findCustomerById(id);
    }
>>>>>>> 5237ffd08bb0919cdc2e97c805224a6444f9441d
}