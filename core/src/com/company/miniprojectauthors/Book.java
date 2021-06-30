package com.company.miniprojectauthors;

public class Book {
    long bookId;
    String bookName;
    String description;
    double price;
    Author author;

    public Book(long bookId,String bookName,String description,double price,Author author){
        this.author=author;
        this.bookId=bookId;
        this.bookName=bookName;
        this.description=description;
        this.price=price;
    }







}
