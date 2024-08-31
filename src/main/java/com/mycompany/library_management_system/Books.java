/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.library_management_system;

/**
 *
 * @author ankit
 */
public class Books {
    private String isbn;
    private String title;
    private String author;
    private int publication_year;
    private boolean isAvailable;


    Books(String isbn,String title,String author,int publication_year){
        this.isbn=isbn;
        this.title=title;
        this.author=author;
        this.publication_year=publication_year;
        this.isAvailable=true;
        
    }
    public String getIsbn(){
        return isbn;
    }
    public void setisbn(String isbn){
        this.isbn=isbn;
    
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(){
        this.author=author;
    }
    public int getPublication_year(){
        return publication_year;
    }
    public void setPublication_year(int publication_year ){
        this.publication_year=publication_year;
    }
    public boolean getIsAvailable(){
        return isAvailable;
    }
    public void setIsAvailable(boolean isAvailable){
        this.isAvailable=isAvailable;
    }
    

    
}
