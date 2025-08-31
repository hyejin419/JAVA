package lesson09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Ex01_Client_Main {
    public static void main(String[] args) {
        String serverIp = "127.0.0.1";
        int port = 12345;

        try(Socket socket = new Socket(serverIp, port)) { //Socket을 이용해 서버에 연결 시도.
            System.out.println("서버에 연결됨.");

            //서버와 통신을 위한 입출력 스트림 생성.
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            out.println("안녕하세요, 서버!");

            String response = in.readLine();
            System.out.println("서버 응답: " + response);  //서버로부터 받은 메시지를 출력.
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
