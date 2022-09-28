/**
 * Lab 1 - Threads
 * 3. All together
 * a)
 * Stefana Chiritescu
 * A00282343
 */

class YourThreadRunnable implements Runnable {
    String name;
    int time;

    public YourThreadRunnable(String name, int time) {
        this.name = name;
        this.time = time;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + name);
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
            }
        }
        System.out.println("DONE! " + name);
    }

    public static void main(String[] args) {
        Runnable s1 = new YourThreadRunnable("AIT", 1000);
        Thread t1 = new Thread(s1);
        Runnable s2 = new YourThreadRunnable("TUS", 2000);
        Thread t2 = new Thread(s2);
        t1.start();
        t2.start();
    }
}
