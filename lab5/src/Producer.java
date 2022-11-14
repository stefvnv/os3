/**
 * Lab 5 - ArrayBlockingQueue
 * Producer class
 * Stefana Chiritescu
 * A00282343
 */

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
    private final BlockingQueue<Integer> queue;
    private final int start;

    @Override
    public void run() {
        try {
            process();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private void process() throws InterruptedException {

        // Put 20 ints into Queue and sleep for 100ms
        for (int i = start; i < 20; i++) {
            System.out.println("[Producer] Put : " + i);

            queue.put(i * i);
            Thread.sleep(100);
        }
    }

    public Producer(int startInt, BlockingQueue<Integer> queue) {
        this.start = startInt;
        this.queue = queue;
    }
}
