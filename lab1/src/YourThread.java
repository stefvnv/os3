/**
 * Lab 1 - Threads
 * 3. All together
 * b)
 * Stefana Chiritescu
 * A00282343
 */

public class YourThread extends Thread {
    String name;
    int time;

    public YourThread(String name, int time) {
        this.name = name;
        this.time = time;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + name);
            try {
                sleep(time);
            } catch (InterruptedException e) {
            }
        }
        System.out.println("DONE! " + name);
    }



    public static void main(String[] args) {
        new YourThread("AIT", 500).start();
        new YourThread("TUS", 1000).start();
    }
}

