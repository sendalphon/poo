
package com.upao.test;

import com.upao.ejercicio.Author;
import com.upao.ejercicio.Book;

public class test {

    public static void main(String[] args) 
    {
        Author h=new Author("maqui ", "yor-el-20@hotmail.com ", 'M');
        Book  b=new Book("el viejo y el mar", h, 30, 4);
        System.out.println(b);
    }
    
}
