/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.library_management_system;
import java.util.*;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ankit
 */
public class Library {
        private HashMap<String,Books>bookshelf;
    
    Library(){
        this.bookshelf=new HashMap<>();
    }
    public Books addBook(Books book)throws Exception{
        if(book==null){
            throw new Exception("enter valid book info");
        }
        if(bookshelf.containsKey(book.getIsbn())){
            throw new Exception("Book is already added");
        }
        bookshelf.put(book.getIsbn(), book);
        return book;
    }
    public Books borrowBook(String isbn)throws Exception{
        if(bookshelf.containsKey(isbn)){
            if(!bookshelf.get(isbn).getIsAvailable()){
                throw new Exception("book is already borrowed");
            }
            Books b=bookshelf.get(isbn);
            b.setIsAvailable(false);
            return b;
        }
        else{
            throw new Exception("non existing book");
        }


    }
    public Books returnBook(String isbn)throws Exception{
            if(bookshelf.get(isbn).getIsAvailable()){
                throw new Exception("Book is already returned");
            }
            Books b=bookshelf.get(isbn);
            b.setIsAvailable(true);
            return b;
    }
    public Books searchavilableBook(String isbn)throws Exception{
        Books b=bookshelf.get(isbn);
        if(b.getIsAvailable()){
            return b;
        }
        else{
            throw new Exception("book is not avilable");
        }

}
 
    public List<Books> showAvailableBooks(){
           List<Books>Availablebook=new ArrayList<>();
        for(Map.Entry e:bookshelf.entrySet()){
            Books b=(Books)e.getValue();
            if(b.getIsAvailable()==true){
                Availablebook.add(b);
                System.out.println("name:"+b.getTitle()+" ,Isbn:"+b.getIsbn()+" ,author:"+b.getAuthor()+" ,publication_year"+b.getPublication_year());
                
            }
            
        }
    
     return Availablebook;
    }
    public List<Books> showNotAvailableBooks(){
           List<Books>NotAvailablebook=new ArrayList<>();
        for(Map.Entry e:bookshelf.entrySet()){
            Books b=(Books)e.getValue();
            if(b.getIsAvailable()==false){
                NotAvailablebook.add(b);
                System.out.println("name:"+b.getTitle()+" ,Isbn:"+b.getIsbn()+" ,author:"+b.getAuthor()+" ,publication_year"+b.getPublication_year());
                
            }
            
        }
    
     return NotAvailablebook;
    }
    


}
