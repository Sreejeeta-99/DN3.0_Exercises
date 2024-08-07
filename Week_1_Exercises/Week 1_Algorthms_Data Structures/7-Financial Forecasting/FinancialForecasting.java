<<<<<<< HEAD
import java.util.Scanner;
import java.util.InputMismatchException;

class Product 
{
    private String productId;
    private String productName;
    private String category;

    // Constructor to initialize product details
    public Product(String productId, String productName, String category) 
    {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
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
    public String getCategory() 
    {
        return category;
    }

    // Setter methods for product details
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

public class FinancialForecasting 
{
    // Recursive method to calculate future value
    public static double calculateFutureValueRecursive(double presentValue, double growthRate, int periods) 
    {
        if (periods == 0) 
            return presentValue;
        
        return calculateFutureValueRecursive(presentValue*(1 + growthRate), growthRate, periods - 1);
    }

    // Iterative method to calculate future value
    public static double calculateFutureValueIterative(double presentValue, double growthRate, int periods) 
    {
        double futureValue = presentValue;
        for (int i = 0; i < periods; i++) 
        {
            futureValue *= (1 + growthRate);
        }
        return futureValue;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        try 
        {
            // Input present value, growth rate, and number of periods
            System.out.print("Enter the present value: ");
            double presentValue = sc.nextDouble();
            System.out.print("Enter the growth rate (as a decimal i.e, 0.07=7%): ");
            double growthRate = sc.nextDouble();
            System.out.print("Enter the number of periods: ");
            int periods = sc.nextInt();

            // User chooses the method
            System.out.println("Choose the method for calculating future value:");
            System.out.println("1. Recursive");
            System.out.println("2. Iterative");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            double futureValue = 0;
            switch (choice) 
            {
                case 1:
                    // Use recursive method
                    futureValue = calculateFutureValueRecursive(presentValue, growthRate, periods);
                    break;
                case 2:
                    // Use iterative method
                    futureValue = calculateFutureValueIterative(presentValue, growthRate, periods);
                    break;
                case 3:
                    // Exit the program
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please select 1 or 2.");
                    sc.close();
                    return;
            }
            System.out.println("Future Value after " + periods + " periods: " + futureValue);
        } 
        catch (InputMismatchException e) 
        {
            System.out.println("Invalid input. Please enter a value between 1 and 3.");
        } 
        finally 
        {
            sc.close();
        }
    }
}
=======
import java.util.Scanner;
import java.util.InputMismatchException;

class Product 
{
    private String productId;
    private String productName;
    private String category;

    // Constructor to initialize product details
    public Product(String productId, String productName, String category) 
    {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
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
    public String getCategory() 
    {
        return category;
    }

    // Setter methods for product details
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

public class FinancialForecasting 
{
    // Recursive method to calculate future value
    public static double calculateFutureValueRecursive(double presentValue, double growthRate, int periods) 
    {
        if (periods == 0) 
            return presentValue;
        
        return calculateFutureValueRecursive(presentValue*(1 + growthRate), growthRate, periods - 1);
    }

    // Iterative method to calculate future value
    public static double calculateFutureValueIterative(double presentValue, double growthRate, int periods) 
    {
        double futureValue = presentValue;
        for (int i = 0; i < periods; i++) 
        {
            futureValue *= (1 + growthRate);
        }
        return futureValue;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        try 
        {
            // Input present value, growth rate, and number of periods
            System.out.print("Enter the present value: ");
            double presentValue = sc.nextDouble();
            System.out.print("Enter the growth rate (as a decimal i.e, 0.07=7%): ");
            double growthRate = sc.nextDouble();
            System.out.print("Enter the number of periods: ");
            int periods = sc.nextInt();

            // User chooses the method
            System.out.println("Choose the method for calculating future value:");
            System.out.println("1. Recursive");
            System.out.println("2. Iterative");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            double futureValue = 0;
            switch (choice) 
            {
                case 1:
                    // Use recursive method
                    futureValue = calculateFutureValueRecursive(presentValue, growthRate, periods);
                    break;
                case 2:
                    // Use iterative method
                    futureValue = calculateFutureValueIterative(presentValue, growthRate, periods);
                    break;
                case 3:
                    // Exit the program
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please select 1 or 2.");
                    sc.close();
                    return;
            }
            System.out.println("Future Value after " + periods + " periods: " + futureValue);
        } 
        catch (InputMismatchException e) 
        {
            System.out.println("Invalid input. Please enter a value between 1 and 3.");
        } 
        finally 
        {
            sc.close();
        }
    }
}
>>>>>>> 5237ffd08bb0919cdc2e97c805224a6444f9441d
