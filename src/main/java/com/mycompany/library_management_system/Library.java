/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.library_management_system;

import java.util.HashMap;

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

            
            Books b=bookshelf.get(isbn);
            b.setIsAvailable(true);
            return b;

    
    }

}
