/**
 * Lab 4 - Wait Notify
 * WaitNotifyTest class
 * Stefana Chiritescu
 * A00282343
 */

public class WaitNotifyTest {

    public static void main(String[] args) {

        // Create a Message(), two Waiters(msg), and a Notifier(msg)
        Message msg = new Message("notifier Notifier work done");
        Waiter waiterOne = new Waiter(msg);
        Waiter waiterTwo = new Waiter(msg);
        Notifier notifier = new Notifier(msg);

        //Start Waiters and Notifier
        Thread threadOne = new Thread(waiterOne, "***Waiter 1***");
        Thread threadTwo = new Thread(waiterTwo, "***Waiter 2***");
        Thread threadThree = new Thread(notifier, "Notifier");

        threadOne.start();
        threadTwo.start();
        threadThree.start();

        // Print message "All the threads are started"
        System.out.println("All the threads are started");
    }
}
