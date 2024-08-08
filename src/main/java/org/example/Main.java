package org.example;

public class Main {
//    public static void main(String[] args) {
//        System.out.println("Hello world!");
//    }
}

System.out.println( " ====== Display list of all books ====");
try {
        for (Books cc : bookDao.getAllBooks()) {
int ISBN = cc.getIsbn();
String BookName = cc.getBookName();
       System.out.println("======================");
       System.out.println("ISBN Number :" + ISBN + "and Book name: " + BookName);

   }
           } catch (ClassNotFoundException e) {
        e.printStackTrace();
} catch (SQLException e) {
        e.printStackTrace();
}

        System.out.println("----Book information is updating -----");
Books Bookupdating = new Books();
Bookupdating.setIsbn(3);
Bookupdating.setBookName("Algorithms Book");
boolean result = bookDao.updateBook(Bookupdating, 3);
System.out.println(result);

