package Lab1;
import java.io.*;
import java.net.*;

class SocketExampleServer {

    public static void main(String[] args) throws Exception {
        int port = 5678;
        ServerSocket ss = new ServerSocket(port);

        while (true) {
            System.out.println("Waiting incoming connection...");

            Socket s = ss.accept();
            DataInputStream dis = new DataInputStream(s.getInputStream());

            String x = null;

            try {
                while ((x = dis.readUTF()) != null) {

//                System.out.print(x.)
                    System.out.println(x);

                }
            } catch (IOException e) {
                System.err.println("Client closed its connection.");
            }
        }
    }
}



