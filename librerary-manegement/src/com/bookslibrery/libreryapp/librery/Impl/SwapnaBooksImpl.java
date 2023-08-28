package com.bookslibrery.libreryapp.librery.Impl;

import com.bookslibrery.libreryapp.bookstore.BookStoreDTO;
import com.bookslibrery.libreryapp.librery.Libreries;

import java.util.Arrays;

public class SwapnaBooksImpl implements Libreries {

   public BookStoreDTO books[];
   int id;
   int index;

   public SwapnaBooksImpl(int size){
       books = new BookStoreDTO[size];
   }

    @Override
    public boolean addBooks(BookStoreDTO book) {
        boolean isBooksAdded = false;
        if (book != null){
            book.setBookId(++id);
            this.books[index++] = book;
            isBooksAdded=true;
        }
        else {
            System.out.println("the books should not be null");
        }
        return  isBooksAdded;
    }

    @Override
    public String getBookNameById(int bookId) {
       String bookName=null;
       for (int index=0 ; index< books.length ; index++){
           if (books[index].getBookId()==bookId){
               bookName = books[index].getBookName();
           }
       }
       return  bookName;
    }

    @Override
    public String getBookAuthorNameByBookName(String bookName) {
      String authorName =null;
      for (int index =0 ; index< books.length ; index++){
          if (books[index].getBookName().equals(bookName)){
              authorName = books[index].getAuthorName();
          }
      }
      return authorName;
    }

    @Override
    public double getPriceByBookName(String bookName) {
       double price = 0.0;
       for (int index =0 ; index < books.length ; index++){
           if (books[index].getBookName().equals(bookName)){
               price = books[index].getPrice();
           }
       }
       return price;
    }

    @Override
    public BookStoreDTO getBookById(int id) {
        BookStoreDTO book= null;
        for (int index=0; index < books.length;index++){
            if (books[index].getBookId()==id){
                book = books[index];
            }
        }
        return  book;
    }

    @Override
    public BookStoreDTO[] getBookByYearOfpublishing(int yearOfPublishing) {
           BookStoreDTO[] sameYearBook = new BookStoreDTO[index];
           for (int oldIndex=0,newIndex=0 ; oldIndex< books.length;oldIndex++){
               if (books[oldIndex].getYearOfPublishing()==yearOfPublishing){
                   sameYearBook[newIndex++] = books[oldIndex];
               }
           }
        return sameYearBook;
    }

    @Override
    public BookStoreDTO[] getBookByAuthorName(String authorName) {
        BookStoreDTO[] authorBook =new BookStoreDTO[index];
        for (int oldIndex=0,newIndex=0; oldIndex< books.length; oldIndex++){
            if (books[oldIndex].getAuthorName().equals(authorName)){
                authorBook[newIndex++] = this.books[oldIndex];
            }
        }
        return authorBook;
    }

    @Override
    public BookStoreDTO getBookByPublisher(String publisherName) {
        BookStoreDTO book = null;
        for (int index =0 ; index <  books.length ; index++){
            if (books[index].getPublisherName().equals(publisherName)){
                book = books[index];
            }
        }
        return book;
    }

    @Override
    public boolean updateNoOfPagesByName(int updatedPages , String existingbookName) {
       boolean isPagesUpdated = false;
       for (int index =0 ; index< books.length ; index++){
           if (books[index].getBookName().equals(existingbookName)){
               books[index].setNoOfPages(updatedPages);
               isPagesUpdated =true;
           }
       }
      return  isPagesUpdated;
    }

    @Override
    public boolean updatePriceById(double updatedPrice, int existingBookId) {
       boolean isPriceUpdated = false;
        for (int index=0 ; index < books.length ; index++){
            if (books[index].getBookId()==existingBookId){
                books[index].setPrice(updatedPrice);
                isPriceUpdated =true;
            }
        }
        return isPriceUpdated;
    }

    @Override
    public boolean updatePublisherByAuthorName(String updatedPublisherName, String existingAuthorName) {
        boolean isPublisherNameUpdated=false;
        for (int index=0 ; index < books.length ; index++){
            if (books[index].getAuthorName().equals(existingAuthorName)){
                books[index].setPublisherName(updatedPublisherName);
                isPublisherNameUpdated= true;
            }
        }
        return isPublisherNameUpdated;
    }

    @Override
    public boolean deleteBookByName(String bookName) {
        boolean isBookDeleted = false;
        int oldIndex, newIndex;
        for (oldIndex = 0, newIndex = 0; oldIndex < books.length; oldIndex++) {
            if (!(books[oldIndex].getBookName().equals(bookName))) {
                books[newIndex++] = this.books[oldIndex];
            }
        }
        books = Arrays.copyOf(books, newIndex);
        System.out.println(Arrays.toString(books));
        isBookDeleted = true;
        return isBookDeleted;
    }

    public void getAllBooks(){
        System.out.println("the book details are shown below:");
        for (int index=0; index<books.length ; index++){
            System.out.println(books[index]);
        }
    }
}
