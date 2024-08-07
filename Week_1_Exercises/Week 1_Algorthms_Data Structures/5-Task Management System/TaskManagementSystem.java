import java.util.Scanner;
import java.util.InputMismatchException;

class Task 
{
    private String taskId;
    private String taskName;
    private String status;

    // Constructor to initialize task details
    public Task(String taskId, String taskName, String status) 
    {
        this.taskId = taskId;
        this.taskName = taskName;
        this.status = status;
    }

    // Getter methods for task details
    public String getTaskId() 
    {
        return taskId;
    }
    public String getTaskName() 
    {
        return taskName;
    }
    public String getStatus() 
    {
        return status;
    }

    // Setter methods for task details
    public void setTaskId(String taskId) 
    {
        if (taskId == null || taskId.trim().isEmpty()) 
            throw new IllegalArgumentException("Task ID cannot be null or empty");
        
        this.taskId = taskId;
    }
    public void setTaskName(String taskName) 
    {
        if (taskName == null || taskName.trim().isEmpty()) 
            throw new IllegalArgumentException("Task Name cannot be null or empty");

        this.taskName = taskName;
    }
    public void setStatus(String status) 
    {
        if (status == null || status.trim().isEmpty()) 
            throw new IllegalArgumentException("Status cannot be null or empty");

        this.status = status;
    }

     // Override toString method to display task details
    @Override
    public String toString() 
    {
        return "Task ID: " + taskId + ", Task Name: " + taskName + ", Status: " + status;
    }
}

// Node class for singly linked list
class Node 
{
    Task data;
    Node next;
    Node(Task data) 
    {
        this.data = data;
        this.next = null;
    }
}

// Class for managing tasks using a singly linked list
class TaskLinkedList 
{
    private Node head;

    // Constructor to initialize the linked list
    public TaskLinkedList() 
    {
        head = null;
    }

    // Method to add a task to the beginning of the list
    public void addTask(Task data) 
    {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Method to search for a task by taskId
    public Task searchTask(String taskId) 
    {
        Node current = head;
        while (current != null) 
        {
            if (current.data.getTaskId().equals(taskId)) 
                return current.data;
            
            current = current.next;
        }
        return null; // Task not found
    }

    // Method to traverse and display all tasks
    public void traverseTasks() 
    {
        Node current = head;
        while (current != null) 
        {
            System.out.println(current.data);
            current = current.next;
        }
    }

    // Method to delete a task by taskId
    public void deleteTask(String taskId) 
    {
        Node current = head;
        Node previous = null;
        while (current != null) 
        {
            if (current.data.getTaskId().equals(taskId)) 
            {
                if (previous == null)  // Deleting head
                    head = current.next;
                else 
                    previous.next = current.next;
                
                System.out.println("Task deleted.");
                return;
            }
            previous = current;
            current = current.next;
        }
        System.out.println("Task not found.");
    }
}

// Main class to interact with the task management system
public class TaskManagementSystem 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        TaskLinkedList ob = new TaskLinkedList();

        // Menu-driven interface for user interaction
        while (true) 
        {
            System.out.println("Choose an option:");
            System.out.println("1. Add Task");
            System.out.println("2. Search Task");
            System.out.println("3. Traverse Tasks");
            System.out.println("4. Delete Task");
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
                    // Add a new task
                    System.out.print("Enter Task ID: ");
                    String taskId = sc.nextLine();
                    System.out.print("Enter Task Name: ");
                    String taskName = sc.nextLine();
                    System.out.print("Enter Task Status: ");
                    String status = sc.nextLine();
                    Task task = new Task(taskId, taskName, status);
                    ob.addTask(task);
                    break;
                    case 2:
                        // Search for a task by ID
                        System.out.print("Enter Task ID to search: ");
                        String searchId = sc.nextLine();
                        Task found = ob.searchTask(searchId);
                        System.out.println(found != null ? found : "Task not found.");
                        break;
                    case 3:
                        // Traverse and display all tasks
                        ob.traverseTasks();
                        break;
                    case 4:
                        // Delete a task by ID
                        System.out.print("Enter Task ID to delete: ");
                        String deleteId = sc.nextLine();
                        ob.deleteTask(deleteId);
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