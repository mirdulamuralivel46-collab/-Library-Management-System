import java.util.Scanner;

interface BookOperations {
    void issueBook();
    void returnBook();
}

interface MemberOperations {
    void displayMember();
}

class LibraryMember implements BookOperations, MemberOperations {
    String memberName;
    String bookName;

    LibraryMember(String memberName, String bookName) {
        this.memberName = memberName;
        this.bookName = bookName;
    }

    @Override
    public void issueBook() {
        System.out.println(bookName + " has been issued to " + memberName);
    }

    @Override
    public void returnBook() {
        System.out.println(bookName + " has been returned by " + memberName);
    }

    @Override
    public void displayMember() {
        System.out.println("\n--- Library Member Details ---");
        System.out.println("Member Name: " + memberName);
        System.out.println("Book Name: " + bookName);
    }
}

public class LibraryManagement2 {

    static void libraryOperations(LibraryMember member) {
        member.displayMember();
        member.issueBook();
        member.returnBook();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Member Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Book Name: ");
        String book = sc.nextLine();

        LibraryMember member = new LibraryMember(name, book);

        libraryOperations(member);

        sc.close();
    }
}
