class Library {

    String memberName;
    String bookName;

    Library(String memberName, String bookName) {
        this.memberName = memberName;
        this.bookName = bookName;
    }

    void issueBook() {
        try {
            if (bookName == null || bookName.isEmpty()) {
                throw new Exception("Book name cannot be empty");
            }

            System.out.println("Book issued successfully!");
            System.out.println("Member Name: " + memberName);
            System.out.println("Book Name: " + bookName);

        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    void returnBook() {
        try {
            if (memberName == null || memberName.isEmpty()) {
                throw new Exception("Member name cannot be empty");
            }

            System.out.println("Book returned successfully!");
            System.out.println("Member Name: " + memberName);
            System.out.println("Book Name: " + bookName);

        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Library obj = new Library("Arun", "Java");

        obj.issueBook();
        obj.returnBook();
    }
}
