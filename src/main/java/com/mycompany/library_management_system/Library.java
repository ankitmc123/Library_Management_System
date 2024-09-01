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
        
        if(bookshelf.containsKey(book.getIsbn())){
            throw new Exception("Book is already added");
        
        }
        
        bookshelf.put(book.getIsbn(), book);
        return book;
    }

}
