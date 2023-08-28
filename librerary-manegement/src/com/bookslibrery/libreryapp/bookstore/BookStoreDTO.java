package com.bookslibrery.libreryapp.bookstore;

import com.bookslibrery.libreryapp.constant.BookType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString

public class BookStoreDTO {

    private int bookId;
    private String bookName;
    private String authorName;
    private int noOfPages;
    private double price;
    private BookType type;
    private int yearOfPublishing;
    private  String publisherName;


}
