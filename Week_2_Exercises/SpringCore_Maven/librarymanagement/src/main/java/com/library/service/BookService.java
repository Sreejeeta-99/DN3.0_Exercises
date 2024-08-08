package com.library.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.repository.BookRepository;

@Service
public class BookService {
    private BookRepository bookRepository;
    
    @Autowired
    public void setBookRepository(BookRepository bookRepository){
        this.bookRepository=bookRepository;
    }
    @Override
    public String toString() {
        return "BookService {" +
               "bookRepository=" + bookRepository +
               '}';
    }
    public void displayBookRepository(){
        System.out.println("The Book Repository is : "+bookRepository);
    }
    public void displayBookService(){
        System.out.println("Inside Book Service");
    }
}
