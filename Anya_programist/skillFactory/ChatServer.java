package Anya_programist.skillFactory;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChatServer {
    ArrayList<Client> clients = new ArrayList<>();
    ServerSocket serverSocket;

    ChatServer() throws IOException {
        serverSocket = new ServerSocket(1234);
    }

    void sendAll(String massage){

    }

    public void run() {
        while (true) {
            System.out.println("Waiting...");

            // ждем клиента
            try {
                Socket s = serverSocket.accept();
                System.out.println("Client connected!");
                clients.add(new Client(s, this));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        new ChatServer().run();

    }

}