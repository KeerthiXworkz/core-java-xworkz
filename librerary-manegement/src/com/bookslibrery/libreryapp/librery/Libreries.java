package com.bookslibrery.libreryapp.librery;

import com.bookslibrery.libreryapp.bookstore.BookStoreDTO;

public interface Libreries {

    public boolean addBooks(BookStoreDTO book);
    public void getAllBooks();
    public  String getBookNameById(int bookId);

    public  String getBookAuthorNameByBookName(String bookName);

    public double getPriceByBookName(String bookName);
    public BookStoreDTO getBookById(int id);
    public BookStoreDTO[] getBookByYearOfpublishing(int yearOfPublishing);
    public  BookStoreDTO[] getBookByAuthorName(String authorName);
    public BookStoreDTO getBookByPublisher(String publisherName);
    public boolean updateNoOfPagesByName(int updatedPages , String existingbookName);
    public  boolean updatePriceById(double updatedPrice, int existingBookId);

    public  boolean updatePublisherByAuthorName(String updatedPublisherName , String existingAuthorName);
    public boolean deleteBookByName(String bookName);


}
