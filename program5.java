import java.util.Scanner;

class Library {
    String bookName;
    String author;

    void displayDetails() {
        System.out.println("Library Book Details");
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + author);
    }

    void issueBook() {
        System.out.println("Book is issued.");
    }

    void returnBook() {
        System.out.println("Book is returned.");
    }
}

class Student extends Library {
    String studentName;

    Student(String bookName, String author, String studentName) {
        this.bookName = bookName;
        this.author = author;
        this.studentName = studentName;
    }

    @Override
    void displayDetails() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Student Name: " + studentName);
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + author);
    }

    @Override
    void issueBook() {
        System.out.println(bookName + " has been issued to " + studentName);
    }

    @Override
    void returnBook() {
        System.out.println(bookName + " has been returned by " + studentName);
    }
}

class Librarian extends Library {
    String librarianName;

    Librarian(String bookName, String author, String librarianName) {
        this.bookName = bookName;
        this.author = author;
        this.librarianName = librarianName;
    }

    @Override
    void displayDetails() {
        System.out.println("\n--- Librarian Details ---");
        System.out.println("Librarian Name: " + librarianName);
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + author);
    }

    @Override
    void issueBook() {
        System.out.println("Librarian " + librarianName
                + " issued " + bookName);
    }

    @Override
    void returnBook() {
        System.out.println("Librarian " + librarianName
                + " received " + bookName);
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Book Name: ");
        String book = sc.nextLine();

        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();

        System.out.print("Enter Student Name: ");
        String student = sc.nextLine();

        System.out.print("Enter Librarian Name: ");
        String librarian = sc.nextLine();

        Library obj;

        obj = new Student(book, author, student);
        obj.displayDetails();
        obj.issueBook();
        obj.returnBook();

        obj = new Librarian(book, author, librarian);
        obj.displayDetails();
        obj.issueBook();
        obj.returnBook();

        sc.close();
    }
}
