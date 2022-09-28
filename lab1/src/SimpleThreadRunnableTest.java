/**
 * Lab 1 - Threads
 * 2. Using the runnable Interface
 * b)
 * Stefana Chiritescu
 * A00282343
 */

class SimpleThreadRunnableTest {
    public static void main(String args[]) {
        Runnable s1 = new SimpleThreadRunnable("Dog");
        Thread t1 = new Thread(s1);
        Runnable s2 = new SimpleThreadRunnable("Cat");
        Thread t2 = new Thread(s2);
        Runnable s3 = new SimpleThreadRunnable("Fish");
        Thread t3 = new Thread(s3);
        t1.start();
        t2.start();
        t3.start();
    }
}


