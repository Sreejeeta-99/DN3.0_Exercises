public class FactoryMethodPattern
{
    // Define a common interface for all document types
    interface Document 
    {
        void open();
        void close();
    }

    // Concrete class implementing the Document interface for PDF documents
    static class PdfDocument implements Document 
    {
        @Override
        public void open() 
        {
            System.out.println("Opening PDF document...");
        }

        @Override
        public void close() 
        {
            System.out.println("Closing PDF document...");
        }
    }

    // Concrete class implementing the Document interface for Word documents
    static class WordDocument implements Document 
    {
        @Override
        public void open() 
        {
            System.out.println("Opening Word document...");
        }

        @Override
        public void close() 
        {
            System.out.println("Closing Word document...");
        }
    }

    // Concrete class implementing the Document interface for Excel documents
    static class ExcelDocument implements Document 
    {
        @Override
        public void open() 
        {
            System.out.println("Opening Excel document...");
        }

        @Override
        public void close() 
        {
            System.out.println("Closing Excel document...");
        }
    }

    // Abstract factory class with a method to create documents
    abstract static class DocumentFactory 
    {
        // Abstract method to be implemented by concrete factories
        public abstract Document createDocument();
    }

    // Concrete factory class for creating PDF documents
    static class PdfDocumentFactory extends DocumentFactory 
    {
        @Override
        public Document createDocument() 
        {
            return new PdfDocument();
        }
    }

    // Concrete factory class for creating Word documents
    static class WordDocumentFactory extends DocumentFactory 
    {
        @Override
        public Document createDocument() 
        {
            return new WordDocument();
        }
    }

    // Concrete factory class for creating Excel documents
    static class ExcelDocumentFactory extends DocumentFactory
    {
        @Override
        public Document createDocument() 
        {
            return new ExcelDocument();
        }
    }

    // Test class to demonstrate the Factory Method Pattern
    public static void main(String[] args) 
    {
        // Create a PDF document using the factory method
        DocumentFactory ob1 = new PdfDocumentFactory();
        Document obj1 = ob1.createDocument();
        obj1.open();
        obj1.close();

        // Create a Word document using the factory method
        DocumentFactory ob2 = new WordDocumentFactory();
        Document obj2 = ob2.createDocument();
        obj2.open();
        obj2.close();

        // Create an Excel document using the factory method
        DocumentFactory ob3 = new ExcelDocumentFactory();
        Document obj3 = ob3.createDocument();
        obj3.open();
        obj3.close();
    }
}
