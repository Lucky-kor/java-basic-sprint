package javabasic;

public class Book {
    String title;
    String author;
    int price;

    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }
    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void printTitle() {
        System.out.println(this.title);
    }

    public void printAuthor() {
        System.out.println(this.author);
    }

    public void printPrice() {
        System.out.println(this.price);
    }
}
