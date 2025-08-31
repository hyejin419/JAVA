package lesson08;
//Stream2
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex02_Main {
    public static void main(String[] args) {
        try (
               FileInputStream fis = new FileInputStream("input.txt");
               FileOutputStream fos = new FileOutputStream("./output.txt");
        ){
            int data;
            while((data = fis.read()) !=-1) {
                fos.write(data);
            }
            /*
            1.fis.read()로 한 바이트씩 데이터를 읽음 (파일 끝이면 -1반환)
            2. 읽은 바이트를 fos.write()로 출력 스트림에 씀
            > 이 과정에서 한 글자씩 복사하듯 반복.
            > 결과적으로 input.txt 에서 output.txt로 내용이 복사된다.
             */

            System.out.println("파일 복사 완료(바이트 스트림)");
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
/*
Input/OutputStream (클래스) : 바이트단위로 처리
Reader, Writer(클래스) : 문자단위로 처리

동작 순서
1. input.txt를 바이트 단위로 읽음
2. output.txt에 그대로 바이트를 씀
3. 끝날 때까지 반복
4. 모든 작업이 끝나면 "파일 복사 완료(바이트 스트림)" 메시지 출력
 */