// This interface represents the repository layer for managing customer data
public interface CustomerRepository 
{
    // Method to find a customer by their ID
    Customer findCustomerById(int id);
}