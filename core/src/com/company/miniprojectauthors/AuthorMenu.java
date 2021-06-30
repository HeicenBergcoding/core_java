package com.company.miniprojectauthors;

import java.util.Arrays;
import java.util.Scanner;

public class AuthorMenu {
    static Scanner scanner = new Scanner(System.in);
    static int choice;
    public static void menu(){
        System.out.println("0. Enter the number of books and authors");
        System.out.println("1. Add an author");
        System.out.println("2. Add a book");
        System.out.println("3. Search a book by book name");
        System.out.println("4. Display a book details");
        System.out.println("5. Display an author details");
        System.out.println("6. Display all books");
        System.out.println("7. Display all authors");
        System.out.println("99. Exit program");
        System.out.println("Enter number of your choice");
        choice= scanner.nextInt();

    }
    public static void main(String[] args){

        Book books[] = null;
        Author authors[] = null;
        Author author = null;
        Book book= null;
        int noOfAuthors=0;
        int noOfBooks=0;
        System.out.println("enter 0 first");


        while (true) {
            System.out.println("-------------------------------------------------------------");


            menu();
            switch (choice) {

                case 0:
                    System.out.println("enter the number of authors you want");
                    noOfAuthors = scanner.nextInt();
                    authors = new Author[noOfAuthors];

                    System.out.println("enter the number of books you want");
                    noOfBooks = scanner.nextInt();
                    books = new Book[noOfBooks];

                    break;


                case 1:
                    System.out.println("add " + noOfAuthors + " author details" + "\r\n");
                    for (int i = 0; i < noOfAuthors; i++) {
                        System.out.println("enter authorid");
                        long authorId = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("enter author name");
                        String authorName = scanner.nextLine();
                        author = new Author(authorId, authorName);
                        authors[i] = author;
                    }
                    break;


                case 2:
                    System.out.println("add " + noOfBooks + " book details" + "\r\n");
                    for (int i = 0; i < noOfBooks; i++) {
                        System.out.println("enter bookid");
                        long bookId = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("enter book name");
                        String bookName = scanner.nextLine();
                        System.out.println("enter book description");
                        String description = scanner.nextLine();
                        System.out.println("enter price of the book");
                        double price = scanner.nextDouble();
                        //Display all books to user ad ask user to choose one book
                        System.out.println("Available authors");
                        System.out.println("---------------------------------------------------------");
                        for (Author a : authors) {
                            System.out.println("the authorID :" + a.authorId);
                            System.out.println("the authorName: " + a.authorName);
                            System.out.println("---------------------------------------------------------");
                        }
                        System.out.println("enter the author id of the author for this book");
                        int authId = scanner.nextInt();
                        Author tempauthor = null;
                        for (Author a : authors) {
                            if (a.authorId == authId) {
                                tempauthor = a;
                                break;
                            }
                        }
                        if (tempauthor == null) {
                            System.out.println("no matching author found");
                        } else {
                            System.out.println("your chosen author is " + tempauthor.authorName);
                        }
                        book = new Book(bookId, bookName, description, price, tempauthor);
                        books[i] = book;
                    }
                    break;


                case 3:
                    System.out.println("enter a book name to search");
                    scanner.nextLine();
                    String searchBookName = scanner.nextLine();
                    Book tempBook = null;
                    for (Book b : books) {
                        if (b.bookName.equals(searchBookName)) {
                            tempBook = b;
                            System.out.println("the book's name is " + tempBook.bookName);
                            System.out.println("the book's id is " + tempBook.bookId);
                        }
                    }if(tempBook==null){
                        System.out.println("this name doesn't exist");
                }

            break;


            case 4:
                System.out.println("enter a book name to display details of");
                scanner.nextLine();
                String searchBook = scanner.nextLine();
                Book newBook = null;
                for (Book b : books) {
                    if (b.bookName.equals(searchBook)) {
                        newBook = b;
                        break;
                    }
                }if(newBook==null){
                System.out.println("this book doesn't exist");

            }else {
                System.out.println("The details of the book is");
                System.out.println("the book's name is " + newBook.bookName);
                System.out.println("the book's id is " + newBook.bookId);
                System.out.println("the book's id is " + newBook.description);
                System.out.println("the book's price is " + newBook.price);
                System.out.println("the book's id is " + newBook.author.authorName);
            }
                break;


            case 5:
                System.out.println("enter an author name to display details of");
                scanner.nextLine();
                String authName = scanner.nextLine();
                Author tempauthorName = null;
                for (Author a : authors) {
                    if (a.authorName == authName) {
                        tempauthorName = a;
                        break;
                    }
                }
                if (tempauthorName == null) {
                    System.out.println("no matching author found");
                } else {
                    System.out.println("the author name is " + tempauthorName.authorName);
                    System.out.println("the author id is " + tempauthorName.authorId);
                }
                break;


            case 6:
                System.out.println("here are all the books");
                System.out.println("---------------------------------------------------------");
                for (Book b : books) {
                    System.out.println("the bookID :" + b.bookId);
                    System.out.println("the bookName: " + b.bookName);
                    System.out.println("the description: " + b.description);
                    System.out.println("the price: " + b.price);
                    System.out.println("the author: " + b.author.authorName);
                    System.out.println("---------------------------------------------------------");
                }
                break;


            case 7:
                System.out.println("here are all the authors");
                System.out.println("---------------------------------------------------------");
                for (Author a : authors) {
                    System.out.println("the authorID :" + a.authorId);
                    System.out.println("the authorName: " + a.authorName);
                    System.out.println("---------------------------------------------------------");
                }
                break;


            case 99:
                System.out.println("the program is exiting");
                System.exit(0);


            default:
                System.out.println("wrong input please try again");
                break;
        }
            }
        }
    }

