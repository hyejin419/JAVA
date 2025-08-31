package lesson09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Ex02_ChatClient {

    public static void main(String[] args) {
        String serverIP = "127.0.0.1";
        int port = 12345;

        try(Socket socket = new Socket(serverIP, port)) {
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            new Thread(() -> {
                String serverMsg;
                try{
                    while((serverMsg = in.readLine()) != null) {
                        System.out.println(serverMsg);
                    }
                }catch (IOException e) {
                    System.out.println("서버 연결 종료");
                }
            }).start();

            String input;
            while((input = keyboard.readLine()) != null) {
                out.println(input);
                if (input.equalsIgnoreCase("exit")) break;
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
