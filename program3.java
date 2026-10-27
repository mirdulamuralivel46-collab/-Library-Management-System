import java.util.Scanner;

class Library {
    String bookName;
    String studentName;

    Library(String b, String s) {
        bookName = b;
        studentName = s;
    }

    void display() {
        System.out.println("\n--- Library Management System ---");
        System.out.println("Book Name: " + bookName);
        System.out.println("Student Name: " + studentName);
    }

    void display(int days) {
        System.out.println("Book Issued for " + days + " days");
    }
}

public class library2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Book Name: ");
        String book = sc.nextLine();

        System.out.print("Enter Student Name: ");
        String student = sc.nextLine();

        System.out.print("Enter Number of Days: ");
        int days = sc.nextInt();

        Library obj = new Library(book, student);

        obj.display();
        obj.display(days);

        sc.close();
    }
}
