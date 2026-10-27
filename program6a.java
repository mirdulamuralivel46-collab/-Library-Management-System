import java.util.Scanner;

abstract class Library {
    String bookName;
    String memberName;

    abstract void displayDetails();

    void issueBook() {
        System.out.println(bookName + " is issued to " + memberName);
    }

    void returnBook() {
        System.out.println(bookName + " is returned by " + memberName);
    }
}

class Member extends Library {

    Member(String bookName, String memberName) {
        this.bookName = bookName;
        this.memberName = memberName;
    }

    @Override
    void displayDetails() {
        System.out.println("\n--- Library Details ---");
        System.out.println("Member Name: " + memberName);
        System.out.println("Book Name: " + bookName);
    }
}

public class LibraryManagement1 {

    static void libraryOperations(Library obj) {
        obj.displayDetails();
        obj.issueBook();
        obj.returnBook();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Member Name: ");
        String member = sc.nextLine();

        System.out.print("Enter Book Name: ");
        String book = sc.nextLine();

        Member m = new Member(book, member);

        libraryOperations(m);

        sc.close();
    }
}
