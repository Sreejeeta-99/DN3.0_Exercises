<<<<<<< HEAD
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

class Product 
{
    // Private member variables to hold product details
    private String productId;
    private String productName;
    private int quantity;
    private double price;

    // Constructor to initialize product details
    public Product(String productId, String productName, int quantity, double price) 
    {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    // Getter methods for product details
    public String getProductId() 
    {
        return productId;
    }
    public String getProductName() 
    {
        return productName;
    }
    public int getQuantity() 
    {
        return quantity;
    }
    public double getPrice() 
    {
        return price;
    }

    // Setter methods with validation for product details
    public void setProductId(String productId) 
    { 
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
    public void setQuantity(int quantity) 
    { 
        if (quantity < 0) 
            throw new IllegalArgumentException("Quantity cannot be negative");
        this.quantity = quantity; 
    }
    public void setPrice(double price) 
    { 
        if (price < 0) 
            throw new IllegalArgumentException("Price cannot be negative");
        this.price = price; 
    }

    // Override toString method to display product details
    @Override
    public String toString() 
    {
        return "Product ID: " + productId + ", Name: " + productName + ", Quantity: " + quantity + ", Price: " + price;
    }
}

public class InventoryManagement 
{
    // HashMap to store the inventory of products
    private Map<String, Product> inventory;

    // Constructor to initialize the inventory
    public InventoryManagement() 
    {
        this.inventory = new HashMap<>();
    }

    // Method to add a product to the inventory
    public void addProduct(Product product) 
    {
        if (product == null || inventory.containsKey(product.getProductId())) 
        {
            System.out.println("Product is null or already exists.");
            return;
        }
        
        inventory.put(product.getProductId(), product);
    }

    // Method to update an existing product in the inventory
    public void updateProduct(String productId, Product updatedProduct) 
    {
        if (inventory.containsKey(productId)) 
        {
            inventory.put(productId, updatedProduct);
        }
        else 
        {
            System.out.println("Product not found.");
        }
    }

    // Method to delete a product from the inventory
    public void deleteProduct(String productId) 
    {
        if (inventory.containsKey(productId)) 
        {
            inventory.remove(productId);
        }
        else 
        {
            System.out.println("Product not found.");
        }
    }

    // Override toString method to display the current inventory
    @Override
    public String toString() 
    {
        return inventory.values().toString();
    }

    public static void main(String[] args) 
    {
        InventoryManagement obj = new InventoryManagement();
        Scanner sc = new Scanner(System.in);

        // Main loop to display the menu and perform actions based on user input
        while (true) 
        {
            System.out.println("Choose an option:");
            System.out.println("1. Add a product");
            System.out.println("2. Update a product");
            System.out.println("3. Delete a product");
            System.out.println("4. Display inventory");
            System.out.println("5. Exit");
            
            System.out.println("Enter your choice : ");
            int choice = 0;
            try 
            {
                choice = sc.nextInt();
                sc.nextLine(); 
            }
             catch (InputMismatchException e) 
            {
                System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                sc.nextLine(); // Clear the invalid input
                continue;
            }
            
            switch (choice) 
            {
                case 1:
                    // Adding a new product
                    System.out.print("Enter Product ID: ");
                    String productId = sc.nextLine();
                    System.out.print("Enter Product Name: ");
                    String productName = sc.nextLine();
                    System.out.print("Enter Product Quantity: ");
                    int quantity = sc.nextInt();
                    System.out.print("Enter Product Price: ");
                    double price = sc.nextDouble();
                    sc.nextLine(); // Consume newline left-over

                    Product ob1 = new Product(productId, productName, quantity, price);
                    obj.addProduct(ob1);
                    System.out.println("Added product to inventory: " + ob1);
                    break;

                case 2:
                    // Updating an existing product
                    System.out.print("Enter Product ID to update: ");
                    String productIdToUpdate = sc.nextLine();
                    System.out.print("Enter new Product Name: ");
                    String newProductName = sc.nextLine();
                    System.out.print("Enter new Product Quantity: ");
                    int newQuantity = sc.nextInt();
                    System.out.print("Enter new Product Price: ");
                    double newPrice = sc.nextDouble();
                    sc.nextLine(); // Consume newline left-over

                    Product updatedProduct = new Product(productIdToUpdate, newProductName, newQuantity, newPrice);
                    obj.updateProduct(productIdToUpdate, updatedProduct);
                    System.out.println("Updated product: " + updatedProduct);
                    break;

                case 3:
                    // Deleting a product
                    System.out.print("Enter Product ID to delete: ");
                    String productIdToDelete = sc.nextLine();
                    obj.deleteProduct(productIdToDelete);
                    break;

                case 4:
                    // Displaying the current inventory
                    System.out.println("Current Inventory: " + obj);
                    break;

                case 5:
                    // Exiting the program
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    // Handling invalid menu choices
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
=======
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

class Product 
{
    // Private member variables to hold product details
    private String productId;
    private String productName;
    private int quantity;
    private double price;

    // Constructor to initialize product details
    public Product(String productId, String productName, int quantity, double price) 
    {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    // Getter methods for product details
    public String getProductId() 
    {
        return productId;
    }
    public String getProductName() 
    {
        return productName;
    }
    public int getQuantity() 
    {
        return quantity;
    }
    public double getPrice() 
    {
        return price;
    }

    // Setter methods with validation for product details
    public void setProductId(String productId) 
    { 
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
    public void setQuantity(int quantity) 
    { 
        if (quantity < 0) 
            throw new IllegalArgumentException("Quantity cannot be negative");
        this.quantity = quantity; 
    }
    public void setPrice(double price) 
    { 
        if (price < 0) 
            throw new IllegalArgumentException("Price cannot be negative");
        this.price = price; 
    }

    // Override toString method to display product details
    @Override
    public String toString() 
    {
        return "Product ID: " + productId + ", Name: " + productName + ", Quantity: " + quantity + ", Price: " + price;
    }
}

public class InventoryManagement 
{
    // HashMap to store the inventory of products
    private Map<String, Product> inventory;

    // Constructor to initialize the inventory
    public InventoryManagement() 
    {
        this.inventory = new HashMap<>();
    }

    // Method to add a product to the inventory
    public void addProduct(Product product) 
    {
        if (product == null || inventory.containsKey(product.getProductId())) 
        {
            System.out.println("Product is null or already exists.");
            return;
        }
        
        inventory.put(product.getProductId(), product);
    }

    // Method to update an existing product in the inventory
    public void updateProduct(String productId, Product updatedProduct) 
    {
        if (inventory.containsKey(productId)) 
        {
            inventory.put(productId, updatedProduct);
        }
        else 
        {
            System.out.println("Product not found.");
        }
    }

    // Method to delete a product from the inventory
    public void deleteProduct(String productId) 
    {
        if (inventory.containsKey(productId)) 
        {
            inventory.remove(productId);
        }
        else 
        {
            System.out.println("Product not found.");
        }
    }

    // Override toString method to display the current inventory
    @Override
    public String toString() 
    {
        return inventory.values().toString();
    }

    public static void main(String[] args) 
    {
        InventoryManagement obj = new InventoryManagement();
        Scanner sc = new Scanner(System.in);

        // Main loop to display the menu and perform actions based on user input
        while (true) 
        {
            System.out.println("Choose an option:");
            System.out.println("1. Add a product");
            System.out.println("2. Update a product");
            System.out.println("3. Delete a product");
            System.out.println("4. Display inventory");
            System.out.println("5. Exit");
            
            System.out.println("Enter your choice : ");
            int choice = 0;
            try 
            {
                choice = sc.nextInt();
                sc.nextLine(); 
            }
             catch (InputMismatchException e) 
            {
                System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                sc.nextLine(); // Clear the invalid input
                continue;
            }
            
            switch (choice) 
            {
                case 1:
                    // Adding a new product
                    System.out.print("Enter Product ID: ");
                    String productId = sc.nextLine();
                    System.out.print("Enter Product Name: ");
                    String productName = sc.nextLine();
                    System.out.print("Enter Product Quantity: ");
                    int quantity = sc.nextInt();
                    System.out.print("Enter Product Price: ");
                    double price = sc.nextDouble();
                    sc.nextLine(); // Consume newline left-over

                    Product ob1 = new Product(productId, productName, quantity, price);
                    obj.addProduct(ob1);
                    System.out.println("Added product to inventory: " + ob1);
                    break;

                case 2:
                    // Updating an existing product
                    System.out.print("Enter Product ID to update: ");
                    String productIdToUpdate = sc.nextLine();
                    System.out.print("Enter new Product Name: ");
                    String newProductName = sc.nextLine();
                    System.out.print("Enter new Product Quantity: ");
                    int newQuantity = sc.nextInt();
                    System.out.print("Enter new Product Price: ");
                    double newPrice = sc.nextDouble();
                    sc.nextLine(); // Consume newline left-over

                    Product updatedProduct = new Product(productIdToUpdate, newProductName, newQuantity, newPrice);
                    obj.updateProduct(productIdToUpdate, updatedProduct);
                    System.out.println("Updated product: " + updatedProduct);
                    break;

                case 3:
                    // Deleting a product
                    System.out.print("Enter Product ID to delete: ");
                    String productIdToDelete = sc.nextLine();
                    obj.deleteProduct(productIdToDelete);
                    break;

                case 4:
                    // Displaying the current inventory
                    System.out.println("Current Inventory: " + obj);
                    break;

                case 5:
                    // Exiting the program
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    // Handling invalid menu choices
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
>>>>>>> 5237ffd08bb0919cdc2e97c805224a6444f9441d
