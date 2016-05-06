
package com.upao.ejercicio;

public class Book 
{
    private String name;
    private Author autor;
    private double price;
    private int qtyinstock;

    public Book(String name, Author autor, double price, int qtyinstock) {
        this.name = name;
        this.autor = autor;
        this.price = price;
        this.qtyinstock = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAutor() {
        return autor;
    }

    public void setAutor(Author autor) {
        this.autor = autor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQtyinstock() {
        return qtyinstock;
    }

    public void setQtyinstock(int qtyinstock) {
        this.qtyinstock = qtyinstock;
    }

    @Override
    public String toString() {
        return "Book{" + "name=" + name + ", autor=" + autor + ", price=" + price + ", qtyinstock=" + qtyinstock + '}';
    }

   
    
    
    
}
