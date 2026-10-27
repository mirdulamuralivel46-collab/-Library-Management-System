interface BookOperations {
    void issueBook();
    void returnBook();
}

interface MemberOperations {
    void displayMember();
}

class librarymember implements BookOperations, MemberOperations {

    String memberName;
    String bookName;

    public librarymember(String memberName, String bookName) {
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

public class Main {
    public static void main(String[] args) {

        librarymember member = new librarymember("Arun", "Java");

        member.displayMember();
        member.issueBook();
        member.returnBook();
    }
}
