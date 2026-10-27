class Libraryp {

    static Object book = new Object();
    static Object member = new Object();

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            synchronized (book) {
                System.out.println("Thread 1: Book is locked");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println(e);
                    Thread.currentThread().interrupt();
                    return;
                }

                synchronized (member) {
                    System.out.println("Thread 1: Member is locked");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (member) {
                System.out.println("Thread 2: Member is locked");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println(e);
                    Thread.currentThread().interrupt();
                    return;
                }

                synchronized (book) {
                    System.out.println("Thread 2: Book is locked");
                }
            }
        });

        t1.start();
        t2.start();
    }
}
