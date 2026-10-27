class Library implements Runnable {

    String memberName;
    String bookName;

    Library(String memberName, String bookName) {
        this.memberName = memberName;
        this.bookName = bookName;
    }

    @Override
    public void run() {
        System.out.println("--- Library Management System ---");
        System.out.println("Member Name: " + memberName);
        System.out.println("Book Name: " + bookName);

        System.out.println("Book is being issued...");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
            Thread.currentThread().interrupt();
            return;
        }

        System.out.println(bookName + " has been issued to " + memberName);

        System.out.println("Book is being returned...");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
            Thread.currentThread().interrupt();
            return;
        }

        System.out.println(bookName + " has been returned by " + memberName);
    }

    public static void main(String[] args) {
        Library obj = new Library("Arun", "Java");

        Thread t = new Thread(obj);
        t.start();
    }
}
