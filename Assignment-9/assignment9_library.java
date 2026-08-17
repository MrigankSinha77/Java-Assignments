class Book {
    final String isbn = "619-9346577179";
    String title = "The Memory Police";
    String author = "Yoko Ogawa";
    double price = 599;

    void displayBook() {
        System.out.println("Book ISBN: " + isbn);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class assignment9_library {
    public static void main(String[] args) {
        Book b = new Book();
        b.displayBook();
    }
}
