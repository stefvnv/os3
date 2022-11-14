/**
 * Lab 5 - ArrayBlockingQueue
 * Consumer class
 * Stefana Chiritescu
 * A00282343
 */

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

    private final BlockingQueue<Integer> queue;

    @Override
    public void run() {
        try {
            while (true) {
                process(queue.take());
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private void process(Integer take) throws InterruptedException {
        System.out.println("[Consumer] Take : " + take);
        Thread.sleep(100);
    }

    public Consumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }
}
