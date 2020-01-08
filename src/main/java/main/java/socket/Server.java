package main.java.socket;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Server端
 * @author 苏若墨
 */
public class Server {
    public static void main(String[] args) throws IOException {
        System.out.println("Server Start...");
        ServerSocket serverSocket = new ServerSocket(10000);
        while(true){
            Socket s = serverSocket.accept();
            System.out.println("Someone accepting ....");
            PrintStream ps = new PrintStream(s.getOutputStream());
            ps.println("Hello,I'm Server");
            ps.close();
            s.close();
        }
    }
}
