<<<<<<< HEAD
import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;
import java.util.InputMismatchException;
 
class Product
{
    // Private member variables to hold product details
    private String productId;
    private String productName;
    private String category;

    // Constructor to initialize product details
    public Product(String productId,String productName, String category)
    {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    // Getter methods for product details
    public String  getProductId() 
    {
        return productId;
    }
    public String getProductName() 
    {
        return productName;
    }
    public String getCategory() 
    {
        return category;
    }
    
    // Setter methods with validation for product details
    public void setProductId(String productId) {
        if (productId == null || productId.trim().isEmpty()) 
            throw new IllegalArgumentException("Product ID cannot be null or empty");
        
        this.productId = productId;
    }
    public void setProductName(String productName) 
    {
        if (productName == null || productName.trim().isEmpty()) 
            throw new IllegalArgumentException("Product name cannot be null or empty");
        
        this.productName = productName;
    }
    public void setCategory(String category) 
    {
        if (category == null || category.trim().isEmpty()) 
            throw new IllegalArgumentException("Category cannot be null or empty");
        
        this.category = category;
    }

    // Override toString method to display product details
    @Override
    public String toString() 
    {
        return "Product ID: " + productId + ", Name: " + productName + ", Category: " + category;
    } 
}

class LinearSearch
{
    // Method to perform linear search on an array of products
    public static Product ls(Product arr[], String productID) 
    {
        for(Product prod : arr) //for (int i = 0; i < arr.length; i++)
        {
            //if (arr[i].getProductId().equals(productId))
            if (prod.getProductId().equals(productID))
                return prod;
        }
        return null; // Product not found
    }
    
}

class BinarySearch
{
    // Method to perform binary search on an array of products
    public static Product bs(Product arr[],String productID)
    {
        Arrays.sort(arr,Comparator.comparing(Product::getProductId));//Arrays.sort method along with a Comparator to sort an array 'arr[]'' of 'Product' objects based on their 'productId' 
        int low = 0, high = arr.length - 1;
        while (low<=high)
        {
            int mid = (low + high) / 2;
            int comparison = arr[mid].getProductId().compareTo(productID);
            
            // Check if productID is present at mid
            if (comparison == 0) 
                return arr[mid];// Product found

            // If productID is greater, ignore left half
            else if (comparison < 0)
                low = mid + 1;

            // If productId is smaller, ignore right half
            else
                high = mid - 1;
        } 
        return null; // Product not found
    }
}

public class EcommerceSearch
{
    public static void main(String[] args)
    {
        // Initialize an array of products
        Product a[] =  {
            new Product("101", "Earpods", "Electronics"),
            new Product("102", "Smartphone", "Electronics"),
            new Product("103", "Top", "Apparel"),
            new Product("104", "Book", "Books"),
            new Product("105", "Television", "Electronics")
        };
        // Ask user for the number of products
        //System.out.print("Enter the number of products: ");
        //int n = sc.nextInt();
        //sc.nextLine(); 
        // // Initialize an array of products
        // Product a[] = new Product[n];
        // // Collect details for each product
        // for (int i = 0; i < n; i++) 
        // {
        //     System.out.print("Enter Product ID, Product Name, Product Category: ");
        //     String a = sc.nextLine();
        //     String b = sc.nextLine();
        //     String c = sc.nextLine();
        //     a[i] = new Product(a, b, c);
        // }

        Scanner sc = new Scanner(System.in);// Initialize a scanner to read user input
       
        while (true) 
        {
            System.out.println("Choose an option:");
            System.out.println("1. Perform Linear Search");
            System.out.println("2. Perform Binary Search");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            int choice = 0;
            try 
            {
                choice = sc.nextInt();
                sc.nextLine(); // Consume the newline character
            }
             catch (InputMismatchException e) 
            {
                System.out.println("Invalid choice. Please enter a number between 1 and 3.");
                sc.nextLine(); // Clear the invalid input
                continue;
            }
            switch (choice) 
            {
                case 1:
                    // Perform Linear Search
                    System.out.print("Enter Product ID to search: ");
                    String id1 = sc.nextLine();
                    Product result1 = LinearSearch.ls(a, id1);
                    System.out.println("Linear Search Result: " + (result1 != null ? result1 : "Product not found"));//ternary operator is used to determine what to print based on whether the product was found or not in the linear search
                    break;

                case 2:
                    // Perform Binary Search
                    System.out.print("Enter Product ID to search: ");
                    String id2 = sc.nextLine();
                    Product result2= BinarySearch.bs(a, id2);
                    System.out.println("Binary Search Result: " + (result2 != null ? result2 : "product not found"));//ternary operator is used to determine what to print based on whether the product was found or not in the binary search
                    break;
                    
                case 3:
                    // Exit
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
=======
import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;
import java.util.InputMismatchException;
 
class Product
{
    // Private member variables to hold product details
    private String productId;
    private String productName;
    private String category;

    // Constructor to initialize product details
    public Product(String productId,String productName, String category)
    {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    // Getter methods for product details
    public String  getProductId() 
    {
        return productId;
    }
    public String getProductName() 
    {
        return productName;
    }
    public String getCategory() 
    {
        return category;
    }
    
    // Setter methods with validation for product details
    public void setProductId(String productId) {
        if (productId == null || productId.trim().isEmpty()) 
            throw new IllegalArgumentException("Product ID cannot be null or empty");
        
        this.productId = productId;
    }
    public void setProductName(String productName) 
    {
        if (productName == null || productName.trim().isEmpty()) 
            throw new IllegalArgumentException("Product name cannot be null or empty");
        
        this.productName = productName;
    }
    public void setCategory(String category) 
    {
        if (category == null || category.trim().isEmpty()) 
            throw new IllegalArgumentException("Category cannot be null or empty");
        
        this.category = category;
    }

    // Override toString method to display product details
    @Override
    public String toString() 
    {
        return "Product ID: " + productId + ", Name: " + productName + ", Category: " + category;
    } 
}

class LinearSearch
{
    // Method to perform linear search on an array of products
    public static Product ls(Product arr[], String productID) 
    {
        for(Product prod : arr) //for (int i = 0; i < arr.length; i++)
        {
            //if (arr[i].getProductId().equals(productId))
            if (prod.getProductId().equals(productID))
                return prod;
        }
        return null; // Product not found
    }
    
}

class BinarySearch
{
    // Method to perform binary search on an array of products
    public static Product bs(Product arr[],String productID)
    {
        Arrays.sort(arr,Comparator.comparing(Product::getProductId));//Arrays.sort method along with a Comparator to sort an array 'arr[]'' of 'Product' objects based on their 'productId' 
        int low = 0, high = arr.length - 1;
        while (low<=high)
        {
            int mid = (low + high) / 2;
            int comparison = arr[mid].getProductId().compareTo(productID);
            
            // Check if productID is present at mid
            if (comparison == 0) 
                return arr[mid];// Product found

            // If productID is greater, ignore left half
            else if (comparison < 0)
                low = mid + 1;

            // If productId is smaller, ignore right half
            else
                high = mid - 1;
        } 
        return null; // Product not found
    }
}

public class EcommerceSearch
{
    public static void main(String[] args)
    {
        // Initialize an array of products
        Product a[] =  {
            new Product("101", "Earpods", "Electronics"),
            new Product("102", "Smartphone", "Electronics"),
            new Product("103", "Top", "Apparel"),
            new Product("104", "Book", "Books"),
            new Product("105", "Television", "Electronics")
        };
        // Ask user for the number of products
        //System.out.print("Enter the number of products: ");
        //int n = sc.nextInt();
        //sc.nextLine(); 
        // // Initialize an array of products
        // Product a[] = new Product[n];
        // // Collect details for each product
        // for (int i = 0; i < n; i++) 
        // {
        //     System.out.print("Enter Product ID, Product Name, Product Category: ");
        //     String a = sc.nextLine();
        //     String b = sc.nextLine();
        //     String c = sc.nextLine();
        //     a[i] = new Product(a, b, c);
        // }

        Scanner sc = new Scanner(System.in);// Initialize a scanner to read user input
       
        while (true) 
        {
            System.out.println("Choose an option:");
            System.out.println("1. Perform Linear Search");
            System.out.println("2. Perform Binary Search");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            int choice = 0;
            try 
            {
                choice = sc.nextInt();
                sc.nextLine(); // Consume the newline character
            }
             catch (InputMismatchException e) 
            {
                System.out.println("Invalid choice. Please enter a number between 1 and 3.");
                sc.nextLine(); // Clear the invalid input
                continue;
            }
            switch (choice) 
            {
                case 1:
                    // Perform Linear Search
                    System.out.print("Enter Product ID to search: ");
                    String id1 = sc.nextLine();
                    Product result1 = LinearSearch.ls(a, id1);
                    System.out.println("Linear Search Result: " + (result1 != null ? result1 : "Product not found"));//ternary operator is used to determine what to print based on whether the product was found or not in the linear search
                    break;

                case 2:
                    // Perform Binary Search
                    System.out.print("Enter Product ID to search: ");
                    String id2 = sc.nextLine();
                    Product result2= BinarySearch.bs(a, id2);
                    System.out.println("Binary Search Result: " + (result2 != null ? result2 : "product not found"));//ternary operator is used to determine what to print based on whether the product was found or not in the binary search
                    break;
                    
                case 3:
                    // Exit
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
>>>>>>> 5237ffd08bb0919cdc2e97c805224a6444f9441d
