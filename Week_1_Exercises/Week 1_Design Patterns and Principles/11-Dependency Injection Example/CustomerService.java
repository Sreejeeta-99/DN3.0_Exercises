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
}