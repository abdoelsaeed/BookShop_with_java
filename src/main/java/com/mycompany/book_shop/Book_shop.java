/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.book_shop;
import java.util.ArrayList;
import java.util.Scanner;

public class Book_shop {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        try{ boolean x=true;
while(x){
Book.start();
int choise=input.nextInt();

switch(choise)
{
case 1:
      Book.Displayalldata();
        break;
case 2:
        Book.Addbook();
        break;

        
case 3:
    System.out.println("Enter name the Book");
    String a=input.next();
        Book book=Book.Getbookbyname(a);
        if(book==null){System.out.println("Not founded ");}
        else{
        book.deletebook(book);
        }
        break;
case 4:
    Book.Searchbookbyname();
        break;
 case 5:
     System.out.println("-----DONE-----");
       x=false; 
        break;
}
}
    
}
catch(Exception e){
        System.out.println("The following error occer: "
       + e.getMessage());
        }    

}
}

