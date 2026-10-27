class LibraryManagement {

    private static int bookId = 101;
    private static String bookName = "Java";

    public static void display() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Name: " + bookName);
    }

    public static void search(int id) {
        System.out.println("Searching Book ID: " + id);
    }

    public static void search(String name) {
        System.out.println("Searching Book Name: " + name);
    }
}

public class Method {
    public static void main(String[] args) {

        LibraryManagement.display();
        LibraryManagement.search(101);
        LibraryManagement.search("Java");

    }
}
