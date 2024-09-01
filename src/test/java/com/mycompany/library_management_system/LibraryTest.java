/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.library_management_system;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ankit
 */
public class LibraryTest {
    
    public LibraryTest() {
    }
    @Test
    public void addNewBook(){
        Library l=new Library();
        Books b1=new Books("1","book1","ankit",2021);
        assertEquals(b1,l.addBook(b1)); 
    }
}
