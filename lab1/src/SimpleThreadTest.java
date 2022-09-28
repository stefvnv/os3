/**
 * Lab 1 - Threads
 * 1. Extending the Thread class
 * b)
 * Stefana Chiritescu
 * A00282343
 */
public class SimpleThreadTest {
    public static void main(String[] args) {
        new SimpleThread("Dog").start();
        new SimpleThread("Cat").start();
        new SimpleThread("Fish").start();
    }
}



