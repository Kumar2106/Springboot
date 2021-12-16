package com.example.mongoCRUD.repository;

import com.example.mongoCRUD.model.Book;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends MongoRepository<Book,Integer>{
    
}
