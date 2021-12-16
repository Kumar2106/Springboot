package com.example.mongoCRUD.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="Book")
public class Book {
    @Id
    public int id = 0;
    private String bookname;
    private String authorname;

    Book(int id, String bookname, String authorname) {
        this.id = id;
        this.bookname = bookname;
        this.authorname = authorname;
    }

    //returning book id
    private int getBookId() {
        return id;
    }

    //set book id
    private void setBookId(int id){
        this.id = id;
    }

    //returning bookname
    private String getBookName() {
        return bookname;
    }

    //setting bookname
    private void setBookName(String bookname){
        this.bookname = bookname;
    }

    //returning authorname
    private String getAuthorname() {
        return authorname;
    }

    //set authorname
    private void setAuthorname(String authorname){
        this.authorname=authorname;
    }
}
