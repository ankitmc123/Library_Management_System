/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.library_management_system;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

/**
 *
 * @author ankit
 */
public class LibraryTest {
    
    public LibraryTest() {
    }
    
    @Test
    public void addNewBook()throws Exception{
        Library l=new Library();
        Books b1=new Books("1","book1","ankit",2021);
        assertEquals(b1,l.addBook(b1)); 
    }
    @Test
    public void alreadyadded()throws Exception { // here we add book with same isbn no.
        Library l=new Library();
        Books b1=new Books("1","book1","ankit",2021);
        Books b2=new Books("1","book1","ankit",2021);
        assertThrows(Exception.class,()->{
            l.addBook(b1);
            l.addBook(b2);
        });
    }
    @Test
    public void addNull() throws Exception {
        Library l=new Library();
        Books b1=null;
        assertThrows(Exception.class,()->{
            l.addBook(b1);
            
        });
    }
    @Test
    public void addInvalidIsbn() throws Exception {
        Library l=new Library();

        assertThrows(Exception.class,()->{
            Books b1=new Books("aaa","book1","ankit",2021);
        });
        
    }
    @Test
    public void BorrowAddedBook() throws Exception {
        Library l=new Library();
        Books b1=new Books("1","nice","urmik",2021);
        l.addBook(b1);
        assertEquals(b1,l.borrowBook(b1.getIsbn()));
    }
    @Test
    public void BorrowalreadyboorowedBook()throws Exception{
        Library l=new Library();
        Books b1=new Books("1","nice","prabhu",2021);
            l.addBook(b1);
        assertThrows(Exception.class,()->{
            l.borrowBook(b1.getIsbn());
            l.borrowBook(b1.getIsbn());
        });

    }
    @Test
    public void BorrowNonExistingBook()throws Exception{
        Library l=new Library();
        Books b1=new Books("1","nice","urmik",2021);
        assertThrows(Exception.class,()->{
            l.borrowBook(b1.getIsbn());        
        });
    }
    @Test
    public void ReturnBorrowedBook()throws Exception{
        Library l=new Library();
        Books b1=new Books("1","nice","ankit",2021);
        l.addBook(b1);
        l.borrowBook(b1.getIsbn());
        assertEquals(b1,l.returnBook(b1.getIsbn()));   
    }
    @Test
    public void ReturnReturnedBook()throws Exception{
        Library l=new Library();
        Books b1=new Books("1","nice","ankit",2021);
        l.addBook(b1);
        l.borrowBook(b1.getIsbn());
        l.returnBook(b1.getIsbn());
        assertThrows(Exception.class,()->{
            l.returnBook(b1.getIsbn());
        });   
    }
    @Test
    public void ReturnNeverBorrowedBook()throws Exception{
        Library l=new Library();
        Books b1=new Books("1","nice","ankit",2021);
        l.addBook(b1);
        assertThrows(Exception.class,()->{
            l.returnBook(b1.getIsbn());
        });   
    }
    @Test
    public void SearchAvailableBook()throws Exception{ 
        Library l=new Library();
        Books b1=new Books("1","nice","prabhu",2021);
        Books b2=new Books("2","nice2","urmik",2022);
        l.addBook(b1);
        assertEquals(b1,l.searchavilableBook(b1.getIsbn()));
    }
    @Test
    public void SearchNotAvailableBook()throws Exception{ 
        Library l=new Library();
        Books b1=new Books("1","nice","prabhu",2021);
        Books b2=new Books("2","nice2","urmik",2022);
        l.addBook(b2);
        assertThrows(Exception.class,()->{
        l.searchavilableBook(b1.getIsbn());
        });
    }
    @Test
    public void GetAvailableBook()throws Exception{ 
        Library l=new Library();
        Books b1=new Books("1","nice","prabhu",2021);
        Books b2=new Books("2","nice2","urmik",2022);
        Books b3=new Books("3","nice3","ankit",2023);
        l.addBook(b1);
        l.addBook(b2);
        l.addBook(b3);
        l.borrowBook(b1.getIsbn());
        List<Books>a1=new ArrayList<>();

        a1.add(b2);
        a1.add(b3);

        assertEquals(a1,l.showAvailableBooks());
    }
    @Test
    public void GetNotAvailableBook()throws Exception{ 
        Library l=new Library();
        Books b1=new Books("1","nice","prabhu",2021);
        Books b2=new Books("2","nice2","urmik",2022);
        Books b3=new Books("3","nice3","ankit",2023);
        l.addBook(b1);
        l.addBook(b2);
        l.addBook(b3);
        l.borrowBook(b1.getIsbn());
        List<Books>a1=new ArrayList<>();

        a1.add(b1);


        assertEquals(a1,l.showNotAvailableBooks());
    }
}
