import java.util.Scanner;
import java.util.InputMismatchException;
class Employee 
{
    private String employeeId;
    private String name;
    private String position;
    private double salary;

    // Constructor to initialize employee details
    public Employee(String employeeId, String name, String position, double salary) 
    {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    // Getter methods for employee details
    public String getEmployeeId() 
    {
        return employeeId;
    }
    public String getName() 
    {
        return name;
    }
    public String getPosition() 
    {
        return position;
    }
    public double getSalary() 
    {
        return salary;
    }

    //Setter methods for employee details
    public void setEmployeeId(String employeeId) 
    {
        if (employeeId == null || employeeId.trim().isEmpty())
            throw new IllegalArgumentException("Employee ID cannot be null or empty");
        
            this.employeeId = employeeId;
    }
    public void setName(String name) 
    {
        if (name == null || name.trim().isEmpty())
            throw new IllegalArgumentException("Name cannot be null or empty");
        
            this.name = name;
    }
    public void setPosition(String position) 
    {
        if (position == null || position.trim().isEmpty())
            throw new IllegalArgumentException("Position cannot be null or empty");
        
            this.position = position;
    }
    public void setSalary(double salary) 
    {
        if (salary < 0)
            throw new IllegalArgumentException("Salary cannot be negative");
        
            this.salary = salary;
    }

    // Override toString method to display employee details
    @Override
    public String toString() 
    {
        return "Employee ID: " + employeeId + ", Name: " + name + ", Position: " + position + ", Salary: " + salary;
    }
}

// Class for managing employee records using an array
class EmployeeRecords 
{
    private Employee arr[]; // Array to store employee records
    private int count; // Number of employees currently stored

    // Constructor to initialize the employee array with a specified capacity
    public EmployeeRecords(int capacity) 
    {
        arr = new Employee[capacity];
        count = 0;
    }

    // Method to add a new employee to the system
    public void addEmployee(Employee emp) 
    {
        if (count == arr.length) 
        {
            System.out.println("Array is full. Cannot add more employees.");
            return;
        }
        arr[count++] = emp;
    }

    // Method to search for an employee by ID
    public Employee searchEmployee(String employeeId) 
    {
        for (int i = 0; i < count; i++) 
        {
            if (arr[i].getEmployeeId().equals(employeeId)) 
            {
                return arr[i];
            }
        }
        return null; // Employee not found
    }

    // Method to traverse and display all employee records
    public void traverseEmployees() 
    {
        for (int i = 0; i < count; i++) 
        {
            System.out.println(arr[i]);
        }
    }

    // Method to delete an employee by ID
    public void deleteEmployee(String employeeId) 
    {
        for (int i = 0; i < count; i++) 
        {
            if (arr[i].getEmployeeId().equals(employeeId)) 
            {
                arr[i] = arr[count - 1]; // Replace the deleted employee with the last employee in the array
                arr[count - 1] = null; // Nullify the last position
                count--; // Decrease the employee count
                return;
            }
        }
        System.out.println("Employee not found.");
    }
}

// Main class to interact with the employee management system
public class EmployeeManagementSystem 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Input capacity for the employee array
        System.out.print("Enter capacity of employee array: ");
        int capacity = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        // Create an instance of EmployeeRecords with the specified capacity
        EmployeeRecords ob = new EmployeeRecords(capacity);

        // Menu-driven interface for user interaction
        while (true) 
        {
            System.out.println("Choose an option:");
            System.out.println("1. Add Employee");
            System.out.println("2. Search Employee");
            System.out.println("3. Traverse Employees");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            
            System.out.print("Enter your choice: ");
            int choice = 0;
            try 
            {
                choice = sc.nextInt();
                sc.nextLine(); // Consume the newline character
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
                    // Add a new employee
                    System.out.print("Enter Employee ID: ");
                    String employeeId = sc.nextLine();
                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Employee Position: ");
                    String position = sc.nextLine();
                    System.out.print("Enter Employee Salary: ");
                    double salary = sc.nextDouble();
                    sc.nextLine(); // Consume the newline character
                    Employee emp = new Employee(employeeId, name, position, salary);
                    ob.addEmployee(emp);
                    break;
                case 2:
                    // Search for an employee by ID
                    System.out.print("Enter Employee ID to search: ");
                    String searchId = sc.nextLine();
                    Employee found = ob.searchEmployee(searchId);
                    System.out.println(found != null ? found : "Employee not found.");
                    break;
                case 3:
                    // Traverse and display all employees
                    ob.traverseEmployees();
                    break;
                case 4:
                    // Delete an employee by ID
                    System.out.print("Enter Employee ID to delete: ");
                    String deleteId = sc.nextLine();
                    ob.deleteEmployee(deleteId);
                    break;
                case 5:
                    // Exit the program
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}