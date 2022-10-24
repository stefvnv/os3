/**
 * Lab 3 - Threaded File Servers
 * ThreadedFileServerApp class
 * Stefana Chiritescu
 * A00282343
 */

import java.net.ServerSocket;
import java.net.Socket;

public class ThreadedFileServerApp {
    public static void main(String[] args) throws Exception {
        System.out.println("Server ready...");

        ServerSocket ss = new ServerSocket(2001);
        while (true) {
            Socket s = ss.accept();
            Thread t = new WorkerThread(s);
            t.start();
        }
    }
}
