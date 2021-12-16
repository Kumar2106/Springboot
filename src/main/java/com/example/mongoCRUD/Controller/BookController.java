package com.example.mongoCRUD.Controller;

import java.util.List;
import java.util.Optional;

import com.example.mongoCRUD.model.Book;
import com.example.mongoCRUD.repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    @PostMapping("/addBook")
    public String saveBook(@RequestBody Book book){
        bookRepository.save(book);
        return "Added book with id : "+ book.id;
    }

    //method to get all the book 
    @GetMapping("/findAllBooks")
    public List<Book> getBooks(){ 
        return bookRepository.findAll();
    }

    //method to get books with given id
    @GetMapping("/findAllBooks/{id}")
    public Optional<Book> getBook(@PathVariable int id){
        return bookRepository.findById(id);
    }

    //method to delete a book with findById
    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable int id){
        bookRepository.deleteById(id);
        return "book deleted with id : "+id;
    }

}
