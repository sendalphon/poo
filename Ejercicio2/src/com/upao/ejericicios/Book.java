
package com.upao.ejericicios;

public class Book 
{
    private String name;
    private Author author;
    private double price;
    private int qtyIntStock;
    private  String Authornames;
    public Book(String name, Author author, double price) 
    {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyIntStock=0;
    }

    public Book(String name, Author author, double price, int qtyIntStock) 
    {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyIntStock = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQtyIntStock() {
        return qtyIntStock;
    }

    public void setQtyIntStock(int qtyIntStock) {
        this.qtyIntStock = qtyIntStock;
    }
    public String getAuthornames(String Authornames)
    {
        return Authornames;
    }
    public void setAuthornames(String Authornames)
    {
        this.Authornames=Authornames;
    }

    @Override
    public String toString() {
        return "Book{" + "name=" + name + ", author=" + author + ", Authornames=" + Authornames + '}';
    }
    
    
    
    
}
