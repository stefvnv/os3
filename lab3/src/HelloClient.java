/**
 * Lab 3 - Threaded File Servers
 * Client class
 * Stefana Chiritescu
 * A00282343
 */

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class HelloClient {

    public static void main(String[] args) throws Exception {
        InetAddress inet = InetAddress.getByName("localhost");
        Socket socket = new Socket(inet, 2000);

        OutputStream out = socket.getOutputStream();
        PrintWriter p = new PrintWriter(out);

        InputStream in = socket.getInputStream();
        System.out.println("InputStream class: " + in.getClass());
        Scanner scanner = new Scanner(in);

        p.println("Stefana");
        p.flush();

        String inputLine = scanner.nextLine();
        System.out.println("Client: " + inputLine);
    }
}
