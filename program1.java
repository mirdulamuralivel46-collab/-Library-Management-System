class Book {
    int bookId;
    String bookName;
    String author;

    Book(int id, String name, String authorName) {
        bookId = id;
        bookName = name;
        author = authorName;
    }

    void display() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + author);
    }
}

public class Library {
    public static void main(String[] args) {
        Book b1 = new Book(101, "Java Programming", "James");
        b1.display();
    }
}
