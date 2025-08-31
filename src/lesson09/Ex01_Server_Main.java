package lesson09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex01_Server_Main {
    public static void main(String[] args) {
        int port = 12345;

        try(ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("서버 대기 중...");
            Socket clientSocket = serverSocket.accept();//클라이언트가 접속할 때까지 블로킹됨
            System.out.println("클라이언트 연결됨: " + clientSocket.getInetAddress());

            //클라이언트와의 데이터 입출력을 위한 스트림 설정
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            String input = in.readLine();
            System.out.println("클라이언트로부터 받은 메시지: " + input);

            out.println(input);
            clientSocket.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
