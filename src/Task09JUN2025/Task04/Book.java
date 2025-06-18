package Task09JUN2025.Task04;

public class Book {
    public static void main(String[] args) {

        Book bb = new Book("title-X", "Author-Y", 400);
        bb.Display();
    }

    String title;
    String author;
    int price;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void Display(){
        System.out.println("Title of the Book is -> "+title);
        System.out.println("Author of the Book is -> "+author);
        System.out.println("Price of the Book is -> "+price);
    }
}
