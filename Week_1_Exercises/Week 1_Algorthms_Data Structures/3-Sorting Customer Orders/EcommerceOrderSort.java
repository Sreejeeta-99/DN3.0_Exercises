import java.util.Scanner;
import java.util.InputMismatchException;
class Order 
{
    private String orderId;
    private String customerName;
    private double totalPrice;

    // Constructor to initialize order details
    public Order(String orderId, String customerName, double totalPrice) 
    {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalPrice = totalPrice;
    }

    // Getter methods for order details
    public String getOrderId() 
    {
        return orderId;
    }
    public String getCustomerName() 
    {
        return customerName;
    }
    public double getTotalPrice()
    {
        return totalPrice;
    }

    // Setter methods for order details
    public void setOrderId(String orderId) 
    {
        if (orderId == null || orderId.trim().isEmpty())  // Check if orderId is null or empty and throw an exception if it is
            throw new IllegalArgumentException("Order ID cannot be null or empty");
        
        this.orderId = orderId;
    }

    public void setCustomerName(String customerName) 
    {
        if (customerName == null || customerName.trim().isEmpty())  // Check if customerName is null or empty and throw an exception if it is
            throw new IllegalArgumentException("Customer name cannot be null or empty");
        
            this.customerName = customerName;
    }
    public void setTotalPrice(double totalPrice) 
    {
        if (totalPrice < 0) //checks if the total price is in negative
            throw new IllegalArgumentException("Total price cannot be negative");

        this.totalPrice = totalPrice;
    }

    // Override toString method to display order details
    @Override
    public String toString() 
    {
        return "Order ID: " + orderId + ", Customer Name: " + customerName + ", Total Price: " + totalPrice;
    }
}
class BubbleSort 
{
    // Method to perform Bubble Sort on an array of orders by totalPrice
    public static void bs(Order arr[]) 
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) 
        {
            for (int j = 0; j < n - i - 1; j++) 
            {
                if (arr[j].getTotalPrice() > arr[j + 1].getTotalPrice()) 
                {
                    // Swap arr[j] and arr[j + 1]
                    Order temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

class QuickSort
{
    public static void qs(Order arr[], int low, int high)
    {
        if (low < high) 
        {
            int p = partition(arr, low, high);
            qs(arr, low, p - 1);
            qs(arr, p+1, high);
        }
    }
    private static int partition(Order arr[], int low, int high)
    {
       int i = low, j = high;
       Order pivot = arr[low];
       Order temp;
       while(i<j)
       {
            // Find the index where element is greater than pivot
            while (arr[i].getTotalPrice() <= pivot.getTotalPrice() && i < high)
                i++;
            // Find the index where element is less than pivot
            while (arr[j].getTotalPrice() > pivot.getTotalPrice())
                j--;
            // Swap elements at indices i and j
            if (i < j) 
            {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
       }
        // Swap pivot with element at index j
        arr[low] = arr[j];
        arr[j] = pivot;

        return j; // Return the index of partition element
    }
}

public class EcommerceOrderSort 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Input number of orders
        System.out.print("Enter number of orders: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        // Initialize an array of orders based on user input
        Order[] a = new Order[n];
        for (int i = 0; i < n; i++) 
        {
            System.out.println("Enter details for order " + (i + 1) + ":");
            System.out.print("Order ID: ");
            String orderId = sc.nextLine();
            System.out.print("Customer Name: ");
            String customerName = sc.nextLine();
            System.out.print("Total Price: ");
            double totalPrice = sc.nextDouble();
            sc.nextLine();
            a[i] = new Order(orderId, customerName, totalPrice);
        }

        while (true) 
        {
            System.out.println("Choose an option:");
            System.out.println("1. Sort orders by total price using Bubble Sort");
            System.out.println("2. Sort orders by total price using Quick Sort");
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
                //Perform Bubble Sort
                    BubbleSort.bs(a);
                    System.out.println("Orders sorted by total price using Bubble Sort:");
                    for (Order order : a) 
                    {
                        System.out.println(order);
                    }
                    break;
                case 2:
                //Perform Quick Sort
                    QuickSort.qs(a, 0, a.length - 1);
                    System.out.println("Orders sorted by total price using Quick Sort:");
                    for (Order order : a) 
                    {
                        System.out.println(order);
                    }
                    break;
                case 3:
                //Exit
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}