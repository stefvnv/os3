/**
 * Lab 1 - Threads
 * 2. Using the runnable Interface
 * a)
 * Stefana Chiritescu
 * A00282343
 */

class SimpleThreadRunnable implements Runnable {
    String name;

    public SimpleThreadRunnable(String name) {
        this.name = name;
    }


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
        System.out.println("DONE! " + name);
    }
}


