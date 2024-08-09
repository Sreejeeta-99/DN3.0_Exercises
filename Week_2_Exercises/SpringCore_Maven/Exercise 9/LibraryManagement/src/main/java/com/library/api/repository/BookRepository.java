package com.library.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.api.entity.Book;

//designing pattern used mvc(model view controller)..Whenever we will request anything it will be taken by the controller then controller proceeds and decides which view to return(in form json here)


//extending the class JpaRepository all the CRUD method or functions
public interface BookRepository extends JpaRepository<Book,Integer> {

}
