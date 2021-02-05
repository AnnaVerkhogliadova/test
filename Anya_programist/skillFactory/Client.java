package Anya_programist.skillFactory;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client implements Runnable {
    Socket socket;
    ChatServer server;

    Scanner in;
    PrintStream out;

    public Client(Socket socket, ChatServer server){

        this.socket = socket;
        this.server = server;
        new Thread(this).start();
    }

    void receive(String massege){
        out.println(massege);
    }

    public void run() {
        try {
            // получаем потоки ввода и вывода
            InputStream is = socket.getInputStream();
            OutputStream os = socket.getOutputStream();

            // создаем удобные средства ввода и вывода
            in = new Scanner(is);
            out = new PrintStream(os);

            // читаем из сети и пишем в сеть
            out.println("Welcome to mountains!");
            String input = in.nextLine();
            while (!input.equals("bye")) {
                input = in.nextLine();
            }
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
