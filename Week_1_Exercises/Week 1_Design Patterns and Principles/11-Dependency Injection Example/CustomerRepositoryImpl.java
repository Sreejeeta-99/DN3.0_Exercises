<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> c92f9310a8ae5c7cb60f61186dfe356a32c0eb7d
// This class implements CustomerRepository and provides the actual implementation for customer data access
public class CustomerRepositoryImpl implements CustomerRepository 
{
    // Simulate a data source with a hardcoded customer
    @Override
    public Customer findCustomerById(int id) 
    {
        // In a real application, you would query the database
        if (id == 1) 
            return new Customer(id, "Sreejeeta Dutta", "sreedutta@gmail.com");
        
        return null; // Customer is not found
    }
<<<<<<< HEAD
=======
=======
// This class implements CustomerRepository and provides the actual implementation for customer data access
public class CustomerRepositoryImpl implements CustomerRepository 
{
    // Simulate a data source with a hardcoded customer
    @Override
    public Customer findCustomerById(int id) 
    {
        // In a real application, you would query the database
        if (id == 1) 
            return new Customer(id, "Sreejeeta Dutta", "sreedutta@gmail.com");
        
        return null; // Customer is not found
    }
>>>>>>> 5237ffd08bb0919cdc2e97c805224a6444f9441d
>>>>>>> c92f9310a8ae5c7cb60f61186dfe356a32c0eb7d
}