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
}

class Student extends Book {

    String studentName = "Kanishka";
    int rollNo = 101;

    void displayStudent() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Roll Number: " + rollNo);
    }

    void borrowBook() {
        System.out.println(studentName + " borrowed the book.");
    }
}

class IssueBook extends Student {

    void issueBook() {
        System.out.println("Book Issued Successfully");
    }

    void dueDate() {
        System.out.println("Due Date: 10 Days from Issue");
    }

    void returnBook() {
        System.out.println("Book Returned Successfully");
    }
}

public class Main1 {

    public static void main(String[] args) {

        IssueBook obj = new IssueBook();

        obj.libraryInfo();
        obj.openTime();

        System.out.println();

        obj.displayBook();
        obj.searchBook();

        System.out.println();

        obj.displayStudent();
        obj.borrowBook();

        System.out.println();

        obj.issueBook();
        obj.dueDate();
        obj.returnBook();
    }
}
