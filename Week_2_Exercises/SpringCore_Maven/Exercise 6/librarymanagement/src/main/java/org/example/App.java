package org.example;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.service.BookService;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService service=context.getBean(BookService.class);
        
        service.displayBookRepository();
        service.displayBookService();
        System.out.println(service.toString());
        
        context.close();
    }
}