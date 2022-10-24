/**
 * Lab 3 - Threaded File Servers
 * WorkerThread class
 * Stefana Chiritescu
 * A00282343
 */

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class WorkerThread extends Thread {
    Socket s;

    WorkerThread(Socket s) {
        this.s = s;
    }

    public void run() {
        try {
            InputStream in = s.getInputStream();
            Scanner r = new Scanner(in);
            OutputStream o = s.getOutputStream();
            PrintWriter p = new PrintWriter(o);

            String fileName;
            fileName = r.nextLine();
            System.out.println(getName() + " handling " + fileName);

            FileInputStream fin = new FileInputStream(fileName);
            Scanner f = new Scanner(fin);

            String line;
            while (f.hasNextLine()) {
                line = f.nextLine();
                p.println(line);
            }
            sleep(10000);
            p.close();
            System.out.println(getName() + " finished handling " + fileName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
