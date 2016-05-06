
package com.upao.test;

import com.upao.ejericicios.Author;
import com.upao.ejericicios.Book;

public class Test1 {

    
    public static void main(String[] args) 
    {
        
       Author n2=new Author("maqui ", "yor-el-20@hotmail.com", 'M');
        System.out.println(n2);
        
        Book n1=new Book("George R.Martin ",n2, 20.00, 2);
        System.out.println(n1);
    }
    
}
