class Library extends Thread {

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
            System.out.println("Thread interrupted");
            Thread.currentThread().interrupt();
            return;
        }

        System.out.println("Book issued successfully!");

        System.out.println("Book is being returned...");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
            Thread.currentThread().interrupt();
            return;
        }

        System.out.println("Book returned successfully!");
    }

    public static void main(String[] args) {
        Library obj = new Library("Arun", "Java");
        obj.start();
    }
}
