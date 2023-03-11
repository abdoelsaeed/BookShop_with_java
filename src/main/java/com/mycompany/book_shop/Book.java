/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.book_shop;
import java.util.Scanner;
import java.util.ArrayList;

public class Book {
   static ArrayList<Book>booklist=new ArrayList<Book>();
   private String name,author;
    private double price;
static Scanner input=new Scanner(System.in);
    public Book() {
    }

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public static void start()
    {
    System.out.println("------Main menu------");
System.out.println("Enter <1> to Display All Books");
System.out.println("Enter <2> to Add Book");
System.out.println("Enter <3> to Delete Book");
System.out.println("Enter <4> to Search Book By name");
System.out.println("Enter <5> to EXIT");
System.out.println(" ");
System.out.println("Enter Your choice : ");
    
    }
    public static void Displayalldata(){
     ArrayList<Book>booklist=Book.booklist; 
     if(booklist.isEmpty()){
         System.out.println("There is no data");}
     else{
               for(Book book:booklist)
       { System.out.println("name \t author \t price");
      System.out.println(book.getName()+" \t "+book.getAuthor()+" \t          "+book.getPrice()+" \t ");
       }}
    }
    
    public static void Addbook(){
        System.out.println("Enter the number of book you want to add it");
        int countbook=input.nextInt();
        if(countbook<0)
        {
        System.out.print("The count must be > 0 ");
        }
        else{    
            for(int i=0;i<countbook;i++){
                System.out.println("enter data of book number "+(i+1));
    Book book=new Book();
    System.out.println("enter the name of book");
    book.setName(input.next());
     
     System.out.println("enter the price");
     book.setPrice(input.nextInt());
   
   System.out.println("enter the author");
     book.setAuthor(input.next());
     
booklist.add(book);    }
        }}

public static void Updatebook(){

}
public static Book Getbookbyname(String name){
for(Book book:booklist)
{
if(name.equals(book.getName()))
{
return book;
}
}
return null;
}

   static boolean deletebook(Book book) {
if(!booklist.isEmpty())
{booklist.remove(book);
return true;
}
return false;
    }
 public static void Searchbookbyname(){
 System.out.println(" ---Enter the book name--- ");
     String name=input.next();
int counter=0;
     for(Book book:booklist){
 if((book.getName()).equals(name)){
    
    System.out.println("The Name = "+book.getName()+" , "+" the author = "+book.getAuthor()+" , "+" the price = "+book.getPrice());
    counter++;break;
 }}
 if(counter==0)
     System.out.println("---Not Founded The Book---");
     
     

 }}
