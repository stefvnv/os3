/**
 * Lab 5 - ArrayBlockingQueue
 * Main class
 * Stefana Chiritescu
 * A00282343
 */

import java.util.concurrent.LinkedBlockingQueue;

public class Main {

    public static void main(String[] args) {

        // Create a new LinkedBlockingQueue size 10
        LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>(10);

        //Start Producer and Consumer threads
        Producer p = new Producer(0, queue);
        Consumer c = new Consumer(queue);

        for (int i = 0; i < 5; i++) {
            new Thread(p).start();
        }
        new Thread(c).start();
    }
}
