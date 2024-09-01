/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.library_management_system;

/**
 *
 * @author ankit
 */
public class Library_Management_System {

    public static void main(String args[]){
        Library l=new Library();
       try {
            Books b1 = new Books("1", "my", "ankit", 2024);
            l.addBook(b1);
            Books b2 = new Books("2", "my2", "ankit", 2029);
            l.addBook(b2);
            Books b3 = new Books("3", "my3", "ankit", 2000);
            l.addBook(b3);
            Books b6 = new Books("F", "my4", "chirag", 2010); // Invalid ISBN    
        } catch (Exception e) {
            System.out.println("Invalid ISBN: " + e.getMessage());
        }
        try{
            Books b4 = new Books("4", "my4", "chirag", 2010);
            Books b5 = new Books("4", "my4", "chirag", 2010);
            l.addBook(b4);
            l.addBook(b5);
        }
        catch(Exception e){
            System.out.println("Duplicate ISBN: " + e.getMessage());
        
        }
        l.showAllBooks();
        System.out.println("we try to insert null book");
        try{
            l.addBook(null);
        }
        catch (Exception e){
            System.out.println(e);
        
        }
        l.showAvailableBooks();
        System.out.println("after borrow isbn 1,2 book ");


        try{
        l.borrowBook("1");
        l.borrowBook("2");

        }
        catch(Exception e){
            System.out.println(e);   
        
        }
        l.showAvailableBooks();
        
        System.out.println("again try to borrow book b1");
        try{
            l.borrowBook("1");
        }
        catch(Exception e){
            System.out.println(e);
        }
        l.showAvailableBooks();
        System.out.println("after returning isbn 1 book");
        try{
        l.returnBook("1");
        }
        catch(Exception e){
         System.out.println(e);  
        }
        l.showAvailableBooks();
        System.out.println("again try to return 1st book");
        try{
            
        l.returnBook("1");  
        
        }
        catch(Exception e){
            System.out.println(e);
        
        }
            System.out.println("search for book 2 is it avilable or not ");
        try{
            l.searchavilableBook("2");
        
        }
        catch (Exception e){
            System.out.println(e);
        }
            System.out.println("search for book 1 is it avilable or not ");
        try{
            l.searchavilableBook("1");
            System.out.println("book is available");
        }
        catch (Exception e){
            System.out.println(e);
        }
      System.out.println("show available books ");
             l.showAvailableBooks();
              System.out.println("show not available books ");
        l.showNotAvailableBooks();
      System.out.println("show all books ");
        l.showAllBooks();

     
    }
}
