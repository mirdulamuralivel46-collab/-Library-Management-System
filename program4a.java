class Library {

    void libraryInfo() {
        System.out.println("Library Management System");
    }

    void openTime() {
        System.out.println("Library Timing: 9:00 AM to 5:00 PM");
    }
}

class Book extends Library {

    String bookName = "Java Programming";
    String author = "James Gosling";

    void displayBook() {
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + author);
    }

    void searchBook() {
        System.out.println("Book Found in Library");
    }

    void issueBook() {
        System.out.println("Book Issued Successfully");
    }
}

public class Main {

    public static void main(String[] args) {

        Book obj = new Book();

        obj.libraryInfo();
        obj.openTime();

        System.out.println();

        obj.displayBook();
        obj.searchBook();
        obj.issueBook();
    }
}
