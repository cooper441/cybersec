package Lab1;
import java.io.*;
import java.net.*;

class SocketExampleClient {

    public static void main(String [] args) throws Exception {

        String host = "localhost"; // hostname of server
        int port = 5678;           // port of server

        try {
            Socket s = new Socket(host, port);
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());

            dos.writeUTF("Hello World!");
            dos.writeUTF("Happy new year!");

        } catch (Exception e) {
            System.err.println("Cannot connect to server.");
        }

    }
}