import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.InputMismatchException;

class Book 
{
    private String bookId;
    private String title;
    private String author;

    // Constructor to initialize book details
    public Book(String bookId, String title, String author) 
    {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    // Getter methods for book details
    public String getBookId() 
    {
        return bookId;
    }
    public String getTitle() 
    {
        return title;
    }
    public String getAuthor() 
    {
        return author;
    }
    // Setter methods fr book details
    public void setBookId(String bookId) 
    {
        if (bookId == null || bookId.trim().isEmpty()) 
            throw new IllegalArgumentException("Book ID cannot be null or empty");
        
        this.bookId = bookId;
    }
    public void setTitle(String title) 
    {
        if (title == null || title.trim().isEmpty()) 
            throw new IllegalArgumentException("Title cannot be null or empty");
        
        this.title = title;
    }
    public void setAuthor(String author) 
    {
        if (author == null || author.trim().isEmpty()) 
            throw new IllegalArgumentException("Author cannot be null or empty");
        
        this.author = author;
    }

    // Override toString method to display book details
    @Override
    public String toString() 
    {
        return "Book ID: " + bookId + ", Title: " + title + ", Author: " + author;
    }
}
   
class BookSearch 
{
    // Linear search implementation
    public static Book ls(List<Book> books, String title) 
    {
        for (Book book : books) 
        {
            if (book.getTitle().equalsIgnoreCase(title)) 
                return book;     
        }
        return null; // Book not found
    }

    // Binary search implementation
    public static Book bs(List<Book> books, String title) 
    {
        int low = 0;
        int high = books.size() - 1;

        books.sort(Comparator.comparing(Book::getTitle, String.CASE_INSENSITIVE_ORDER));

        while (low <= high) 
        {
            int mid = (low + high) / 2;
            Book midBook = books.get(mid);
            int comparison = midBook.getTitle().compareToIgnoreCase(title);

            if (comparison == 0) 
                return midBook;
            else if (comparison < 0) 
                low = mid + 1;
            else 
                high = mid - 1;          
        }
        return null; // Book not found
    }
}

public class LibraryManagementSystem 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        List<Book> books = new ArrayList<>();

        // Add some sample books
        books.add(new Book("1", "The Fault in Our Stars", "John Green"));
        books.add(new Book("2", "Harry Potter", "J. K. Rowling"));
        books.add(new Book("3", "Nancy Drew", "Carolyn Keene"));

        while (true) 
        {
            System.out.println("Choose an option:");
            System.out.println("1. Search Book by Title (Linear Search)");
            System.out.println("2. Search Book by Title (Binary Search)");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = 0;
            try 
            {
                choice = sc.nextInt();
                sc.nextLine(); // Consume the newline character
            } catch (InputMismatchException e) 
            {
                System.out.println("Invalid choice. Please enter a number between 1 and 3.");
                sc.nextLine(); // Clear the invalid input
                continue;
            }

            switch (choice) 
            {
                case 1:
                    // Linear search
                    System.out.print("Enter Book Title to search: ");
                    String linearSearchTitle = sc.nextLine();
                    Book foundLinear = BookSearch.ls(books, linearSearchTitle);
                    System.out.println(foundLinear != null ? foundLinear : "Book not found.");
                    break;
                case 2:
                    // Binary search
                    System.out.print("Enter Book Title to search: ");
                    String binarySearchTitle = sc.nextLine();
                    Book foundBinary = BookSearch.bs(books, binarySearchTitle);
                    System.out.println(foundBinary != null ? foundBinary : "Book not found.");
                    break;
                case 3:
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
