package main.java.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Client端
 * @author 苏若墨
 */
public class Client {
    public static void main(String[] args) throws IOException {
        System.out.println("Client Start...");
        Socket s = new Socket("10.27.152.203",10000);
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream(),"utf-8"));
        String line = br.readLine();
        System.out.println("accepted data:" + line);
        br.close();
        s.close();
    }
}
