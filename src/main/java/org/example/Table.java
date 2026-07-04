package org.example;

//@Component
public class Table {
    private Book book;
    private Pen pen;

    public Table(Book book, Pen pen){
        this.book = book;
        this.pen = pen;
        System.out.println("Table been is created");
    }

    public void OpenBook() {
        System.out.println("The book is opening...");
        book.open();
    }

    public void lookAtPen(){
        System.out.println("Pen's name is " + pen.getMark());
    }

}
