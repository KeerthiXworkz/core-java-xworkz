package com.bookslibrery.libreryapp;

import com.bookslibrery.libreryapp.bookstore.BookStoreDTO;
import com.bookslibrery.libreryapp.constant.BookType;
import com.bookslibrery.libreryapp.librery.Impl.SwapnaBooksImpl;
import com.bookslibrery.libreryapp.librery.Libreries;

import java.util.Arrays;
import java.util.Scanner;

public class BooksLibreryTester {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the books");
        int size = sc.nextInt();
        Libreries lib = new SwapnaBooksImpl(size);
        SwapnaBooksImpl swapnaBooks = new SwapnaBooksImpl(size);
        for (int index=0 ; index <swapnaBooks.books.length;index++){
            BookStoreDTO bookStore = new BookStoreDTO();

            System.out.println("enter the name of the book");
            bookStore.setBookName(sc.next());
            System.out.println("enter the author name");
            bookStore.setAuthorName(sc.next());
            System.out.println("enter the noOfPages");
            bookStore.setNoOfPages(sc.nextInt());
            System.out.println("enter the price of book");
            bookStore.setPrice(sc.nextDouble());
            System.out.println("enter type of the book");
            bookStore.setType(BookType.valueOf(sc.next()));
            System.out.println("enter thr date of publishing");
            bookStore.setYearOfPublishing(sc.nextInt());
            System.out.println("enter the publisher name");
            bookStore.setPublisherName(sc.next());

            lib.addBooks(bookStore);
        }

       String userInput = null;
        do {
            System.out.println("press 1: to get all book details");
            System.out.println("press 2: to get bookname by id ");
            System.out.println("press 3: to get author name by name");
            System.out.println("press 4:to get price by name");
            System.out.println("press 5: to get book by Id");
            System.out.println("press 6: to get book by year of publishing");
            System.out.println("press 7: to get book by author name ");
            System.out.println("press 8: to get book by publisher");
            System.out.println("press 9:to update noOfPages by name ");
            System.out.println("press 10: to update price by id");
            System.out.println("press 11: to update publisher by author name ");
            System.out.println("press 12: to delete book by name");

            int options = sc.nextInt();
            switch (options){

                case 1: lib.getAllBooks();
                break;
                case 2:
                    System.out.println("enter book id to get bookname");
                    String bookName = lib.getBookNameById(sc.nextInt());
                    System.out.println("the bookName is:" + bookName);

                 break;

                case 3:
                    System.out.println("enter the book name to get author name");
                   String authorName = lib.getBookAuthorNameByBookName(sc.next());
                    System.out.println("the author name is:" + authorName);
                 break;

                case 4:
                    System.out.println(" enter the name to get price");
                    double price = lib.getPriceByBookName(sc.next());
                    System.out.println("the price of book is:"+ price);
                    break;
                case 5:
                    System.out.println("enter the id to get book details");
                    BookStoreDTO book = lib.getBookById(sc.nextInt());
                    System.out.println("the book details is:"  + book);
                    break;

                case 6:
                    System.out.println("enter the year of publishing to get books");
                    BookStoreDTO[] sameYearBook = lib.getBookByYearOfpublishing(sc.nextInt());
                    //System.out.println("the bookStore details is:" + Arrays.toString(sameYearBook));
                    System.out.println("**************************************************************");
                    for (BookStoreDTO dto:sameYearBook) {
                        System.out.println(dto.toString());
                    }

                    break;

                case 7:
                    System.out.println("enter the Author name to get books");
                    BookStoreDTO[] authorBook = lib.getBookByAuthorName(sc.next());
                   // System.out.println("the books details is:"+ Arrays.toString(authorBook));
                    for (BookStoreDTO dto : authorBook) {
                        System.out.println(dto.toString());
                    }
                    break;

                case 8:
                    System.out.println("enter the publisher name to get books");
                    BookStoreDTO bookStoreDTO = lib.getBookByPublisher(sc.next());
                    System.out.println("the bookStoreDTO is:" + bookStoreDTO);
                    break;

                case 9:
                    System.out.println("enter the name to update the noOf Pages");
                    String existingName = sc.next();
                    System.out.println("enter the updated noOfPages");
                    int updatedPages = sc.nextInt();
                    boolean isPagesUpdated =lib.updateNoOfPagesByName(updatedPages,existingName);
                    break;
                case 10:
                    System.out.println("enter the id  to update the price");
                    int existingId = sc.nextInt();
                    System.out.println("enter the updated price");
                    double updatedPrice = sc.nextDouble();
                    boolean isPriceUpdated = lib.updatePriceById(updatedPrice,existingId);
                    break;

                case 11 :
                    System.out.println("enter the author name to update the publisher");
                    String existingAuthorName = sc.next();
                    System.out.println("enter the updated publisher ");
                    String updatedPublisherName = sc.next();
                    boolean ispublisherUpdated = lib.updatePublisherByAuthorName(updatedPublisherName,existingAuthorName);
                    break;

                case 12:
                    System.out.println("enter the book name to delete Book ");
                    boolean isBookDeleted = lib.deleteBookByName(sc.next());
                    break;
            }
            System.out.println("enter yes / no to further continue");
            userInput = sc.next();
        }while(userInput.equals("yes"));

        System.out.println("thank you for using ... use again");
    }
}
