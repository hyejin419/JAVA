package lesson09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Ex02_ClientHandler implements Runnable {
    private Socket socket;
    private PrintWriter out;
    private BufferedReader in;

    public Ex02_ClientHandler(Socket socket) {
        this.socket = socket;
        try {
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);
            out.println("서버에 연결되었습니다. 닉네임을 입력하세요: ");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void sendMessage(String msg){
        out.println(msg);
    }

    @Override
    public void run() {
        try {
            String name = in.readLine();
            Ex02_ChatServer.broadcast(name + "님이 입장하셨습니다.", this);

            String message;
            while ((message = in.readLine()) != null){
                if(message.equalsIgnoreCase("exit")) break;
                Ex02_ChatServer.broadcast(name + ": " + message, this);
            }
            out.println("채팅을 종료합니다.");
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                Ex02_ChatServer.removeClient(this);
                socket.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}